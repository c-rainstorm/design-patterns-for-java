package me.rainstorm.patterns.template;

/**
 * @author baochen1.zhang
 * @date 2018.08.08
 */
public class SubClass1 extends AbstractClass {

    @Override
    protected void doAnything() {
        System.out.println("subClass1 doAnything");
    }

    @Override
    protected void doSomething() {
        System.out.println("subClass1 doSomething");
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new SubClass1();
        abstractClass.templateMethod();
    }
}
