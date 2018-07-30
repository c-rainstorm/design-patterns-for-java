package me.rainstorm.patterns.singleton;

/**
 * Thread-safe
 *
 * 延迟加载的单例类这是最好的实现，
 * 其他的延迟加载单例类需要在 getInstance 中增加同步代码块来保证 Thread-safe
 *
 * @author baochen1.zhang
 * @date 2018.07.30
 */
public class LazyLoadSingleton {
    /**
     * https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
     *
     * JVM 在初始化 LazyLoadSingleton 时只会对初始化静态变量以及执行静态代码块，这两项本类中都没有。
     * JVM 在检测到 LazyLoadSingletonHolder 必须要执行时才会对其进行加载，即第一次调用 LazyLoadSingleton#getInstance() 时。
     * JLS 中定义的的类初始化过程是序列化的，没有并发，所以 getInstance 不需要额外的同步操作。
     *
     */
    private static class LazyLoadSingletonHolder{
        static final LazyLoadSingleton LAZY_LOAD_SINGLETON = new LazyLoadSingleton();
    }

    private LazyLoadSingleton(){
    }

    public static LazyLoadSingleton getInstance(){
        return LazyLoadSingletonHolder.LAZY_LOAD_SINGLETON;
    }

}
