package me.rainstorm.patterns.factory;

import me.rainstorm.patterns.factory.entity.ConcreteProduct2;
import me.rainstorm.patterns.factory.entity.Product;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Thread-safe
 *
 * @author baochen1.zhang
 * @date 2018.08.06
 */
public class LazyLoadFactory {
    private static final Map<String, Product> cache = new ConcurrentHashMap<>();

    public static <T extends Product> T createProduct(Class<T> tClass) {
        String name = tClass.getName();
        Product product = cache.get(name);

        if (product == null) {
            try {
                cache.putIfAbsent(name, tClass.getDeclaredConstructor().newInstance());

                product = cache.get(name);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return (T) product;
    }

    public static void main(String[] args) {
        Product product = LazyLoadFactory.createProduct(ConcreteProduct2.class);
        product.method();
    }

}
