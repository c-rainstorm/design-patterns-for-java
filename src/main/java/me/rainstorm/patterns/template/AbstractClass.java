package me.rainstorm.patterns.template;

/**
 * @author baochen1.zhang
 * @date 2018.08.08
 */
public abstract class AbstractClass {

    public void templateMethod() {

        doSomething();

        doAnything();
    }

    protected abstract void doAnything();

    protected abstract void doSomething();

}
