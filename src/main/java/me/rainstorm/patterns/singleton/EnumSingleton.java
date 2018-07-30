package me.rainstorm.patterns.singleton;

/**
 *
 * 使用单个枚举值的枚举类，可以预防反射攻击（原因请看下面的知乎回答）
 *
 * 什么是反射攻击：单例类的目的是让外部只能使用已经实例化好的唯一实例，
 *              但是通过反射我们可以创建任意多个实例，与最初的设计不符。
 *              如何通过反射创建单例类的实例可以参考
 *              me.rainstorm.patterns.singleton.Singleton#main(java.lang.String[])
 *              中的实现
 *
 * java中如何让一个方法不能被反射调用？ - Accelerator的回答 - 知乎
 * https://www.zhihu.com/question/47896687/answer/108123861
 *
 * @author baochen1.zhang
 * @date 2018.07.30
 */
public enum EnumSingleton {
    INSTANCE;

    // instance 的操作方法
}

