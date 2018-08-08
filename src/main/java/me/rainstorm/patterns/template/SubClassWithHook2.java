package me.rainstorm.patterns.template;

/**
 * @author baochen1.zhang
 * @date 2018.08.08
 */
public class SubClassWithHook2 extends AbstractClassWithHook {

    @Override
    protected boolean isSuccess() {
        return false;
    }

    @Override
    protected void successThing() {
        System.out.println("SubClassWithHook2 successThing");
    }

    @Override
    protected void doAnything() {
        System.out.println("SubClassWithHook2 doAnything");
    }

    @Override
    protected void doSomething() {
        System.out.println("SubClassWithHook2 doSomething");
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new SubClassWithHook2();
        abstractClass.templateMethod();
    }
}
