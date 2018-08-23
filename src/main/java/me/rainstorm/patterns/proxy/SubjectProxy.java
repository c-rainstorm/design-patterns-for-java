package me.rainstorm.patterns.proxy;

/**
 * @author baochen1.zhang
 * @date 2018.08.23
 */
public class SubjectProxy implements Subject {

    private Subject obj;

    public SubjectProxy() {
        this.obj = new RealSubject();
    }

    public SubjectProxy(Subject obj) {
        this.obj = obj;
    }

    @Override
    public void request() {
        before();
        obj.request();
        after();
    }

    private void before() {
        System.out.println(String.format("%s.before", SubjectProxy.class.getSimpleName()));
    }

    private void after() {
        System.out.println(String.format("%s.after", SubjectProxy.class.getSimpleName()));
    }

    public static void main(String[] args) {
        Subject proxy = new SubjectProxy();
        proxy.request();
    }
}
