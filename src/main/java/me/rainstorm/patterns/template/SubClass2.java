package me.rainstorm.patterns.template;

/**
 * @author baochen1.zhang
 * @date 2018.08.08
 */
public class SubClass2 extends AbstractClass {

    @Override
    protected void doAnything() {
        System.out.println("subClass2 doAnything");
    }

    @Override
    protected void doSomething() {
        System.out.println("subClass2 doSomething");
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new SubClass2();
        abstractClass.templateMethod();
    }
}
