package me.rainstorm.patterns.factory;

import me.rainstorm.patterns.factory.entity.Product;

/**
 * @author baochen1.zhang
 * @date 2018.08.06
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> tClass);
}
