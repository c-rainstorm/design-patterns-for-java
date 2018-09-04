package me.rainstorm.patterns.prototype;

import lombok.Data;

import java.util.Random;

/**
 * @author baochen1.zhang
 * @date 2018.09.03
 */
@Data
public class Prototype implements Cloneable {
    private static Random random = new Random();
    private Integer data;

    public void init() {
        data = random.nextInt();
        System.out.println(String.format("%s::init::%d", Prototype.class.getSimpleName(), data));
    }

    public void doSomething() {
        System.out.println(String.format("%s::doSomething::%d", Prototype.class.getSimpleName(), data));
    }

    @Override
    protected Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            // 需要实现 java.lang.Cloneable 接口
            System.out.println(e);
        }

        return prototype;
    }

    public static void main(String[] args) {
        final int SIZE = 10;
        Prototype prototype = new Prototype();
        for (int i = 0; i < SIZE; ++i) {
            Prototype clone = prototype.clone();

            clone.init();
            clone.doSomething();
        }

    }
}
