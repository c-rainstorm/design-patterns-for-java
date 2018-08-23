package me.rainstorm.patterns.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author baochen1.zhang
 * @date 2018.08.23
 */
public class SubjectMethodInterceptor implements MethodInterceptor {

    private Object obj;

    public SubjectMethodInterceptor(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before(method);
        Object result = method.invoke(this.obj, args);
        after(method);
        return result;
    }

    private void before(Method method) {
        System.out.println(String.format("%s before method[%s] invoke",
                SubjectMethodInterceptor.class.getSimpleName(), method.getName()));
    }

    private void after(Method method) {
        System.out.println(String.format("%s after method[%s] invoke",
                SubjectMethodInterceptor.class.getSimpleName(), method.getName()));
    }

    public static void main(String[] args) {
        Subject proxy = (Subject) Enhancer.create(Subject.class, new SubjectMethodInterceptor(new RealSubject()));
        proxy.request();
    }
}
