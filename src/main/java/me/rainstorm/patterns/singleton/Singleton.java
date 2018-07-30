package me.rainstorm.patterns.singleton;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * thread-safe，不能预防反射攻击
 *
 * @author baochen1.zhang
 * @date 2018.07.30
 */
public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return SINGLETON;
    }

    /**
     * 反射攻击，可以创建任意个实例
     */
    public static void main(String[] args) {
        try {
            Class singleton = Singleton.class;
            Singleton singletonByReflect = (Singleton) singleton.getDeclaredConstructor().newInstance();

            // 返回 false，即创建实例成功
            System.out.println(singletonByReflect == Singleton.getInstance());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
