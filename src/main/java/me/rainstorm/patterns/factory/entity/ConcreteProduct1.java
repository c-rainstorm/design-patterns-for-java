package me.rainstorm.patterns.factory.entity;

/**
 * @author baochen1.zhang
 * @date 2018.08.06
 */
public class ConcreteProduct1 extends Product {
    @Override
    public void method() {
        System.out.println(ConcreteProduct1.class.getName());
    }
}
