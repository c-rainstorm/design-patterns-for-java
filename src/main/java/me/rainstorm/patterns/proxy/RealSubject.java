package me.rainstorm.patterns.proxy;

/**
 * @author baochen1.zhang
 * @date 2018.08.23
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println(String.format("%s.request", RealSubject.class.getSimpleName()));
    }
}
