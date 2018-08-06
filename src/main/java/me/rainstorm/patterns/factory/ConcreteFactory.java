package me.rainstorm.patterns.factory;

import me.rainstorm.patterns.factory.entity.ConcreteProduct1;
import me.rainstorm.patterns.factory.entity.Product;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Calendar;

/**
 * @author baochen1.zhang
 * @date 2018.08.06
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {
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
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct1.class);
        product.method();
    }
}
