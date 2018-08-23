package me.rainstorm.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author baochen1.zhang
 * @date 2018.08.23
 */
public class SubjectInvocationHandler implements InvocationHandler {
    private Object obj;

    public SubjectInvocationHandler(Subject obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        Object result = method.invoke(obj, args);
        after(method);
        return result;
    }

    private void before(Method method) {
        System.out.println(String.format("%s before method[%s] invoke",
                SubjectInvocationHandler.class.getSimpleName(), method.getName()));
    }

    private void after(Method method) {
        System.out.println(String.format("%s after method[%s] invoke",
                SubjectInvocationHandler.class.getSimpleName(), method.getName()));
    }

    public static void main(String[] args) {
        Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class}, new SubjectInvocationHandler(new RealSubject()));
        proxy.request();
    }
}
