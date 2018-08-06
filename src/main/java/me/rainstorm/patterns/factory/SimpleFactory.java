package me.rainstorm.patterns.factory;

import me.rainstorm.patterns.factory.entity.ConcreteProduct2;
import me.rainstorm.patterns.factory.entity.Product;

import java.lang.reflect.InvocationTargetException;

/**
 * @author baochen1.zhang
 * @date 2018.08.06
 */
public class SimpleFactory {
    public static <T extends Product> T createProduct(Class<T> tClass){
        Product product = null;
        try {

            product = tClass.getDeclaredConstructor().newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return (T) product;
    }

    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct(ConcreteProduct2.class);
        product.method();
    }
}
