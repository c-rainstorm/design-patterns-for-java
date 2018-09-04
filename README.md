# Design Patterns for Java

**特别推荐：[Design patterns implemented in Java](http://java-design-patterns.com/)**

对于本仓库的规划，分为以下几个部分。

1. 敲一敲书中的代码，更好的理解设计模式（《设计模式之禅》）；
2. 找一找目前成熟框架（Spring、Mybatis 等）是怎么使用这种设计模式的。
3. 自己对设计模式的应用【后期酌情增加】。

---

<!-- TOC -->

- [单例模式](#单例模式)
    - [经典实现](#经典实现)
    - [应用场景](#应用场景)
- [工厂方法模式](#工厂方法模式)
    - [经典实现](#经典实现-1)
    - [应用场景](#应用场景-1)
- [模板方法模式](#模板方法模式)
    - [经典实现](#经典实现-2)
    - [应用场景](#应用场景-2)
- [代理模式](#代理模式)
    - [经典实现](#经典实现-3)
    - [应用场景](#应用场景-3)
- [原型模式](#原型模式)
    - [经典实现](#经典实现-4)
    - [应用场景](#应用场景-4)
- [参考](#参考)

<!-- /TOC -->

---

## 单例模式

### 经典实现

1. [通用的单例类实现【JDK1.5以前推荐】：Singleton](./src/main/java/me/rainstorm/patterns/singleton/Singleton.java)
1. [延迟加载的单例类实现【JDK1.5以前推荐】：LazyLoadSingleton](./src/main/java/me/rainstorm/patterns/singleton/LazyLoadSingleton.java)
1. [防反射攻击的枚举单例类实现【JDK1.5以后推荐】：EnumSingleton](./src/main/java/me/rainstorm/patterns/singleton/EnumSingleton.java)
1. [拓展的单例类（有数量上限的单例类）：Emperor](./src/main/java/me/rainstorm/patterns/singleton/Emperor.java)

### 应用场景

经典的应用场景：

1. 日志类
1. 管理数据库链接
1. 文件管理器

真实世界的用例：

1. [java.lang.Runtime#getRuntime()](https://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html#getRuntime%28%29)
1. [java.lang.System#getSecurityManager()](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getSecurityManager--)

## 工厂方法模式

### 经典实现

1. [完整工厂方法模式](./src/main/java/me/rainstorm/patterns/factory/ConcreteFactory.java)
1. [简单工厂方法模式](./src/main/java/me/rainstorm/patterns/factory/SimpleFactory.java)
1. [延迟加载的工厂类](./src/main/java/me/rainstorm/patterns/factory/LazyLoadFactory.java)

### 应用场景

1. [java.util.Calendar.getInstance()](http://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html#getInstance--)
1. [java.nio.charset.Charset.forName()](https://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html#forName-java.lang.String-)

## 模板方法模式

### 经典实现

1. [经典模板方法实现](./src/main/java/me/rainstorm/patterns/template/AbstractClass.java)
1. [带 Hook 的模板方法实现](./src/main/java/me/rainstorm/patterns/template/AbstractClassWithHook.java)

### 应用场景

经典的应用场景：

1. 子类中的公共部分实现可以抽取出来放到父类中，对新手不太友好，但是抽象程度可以，实现比较简洁

真实世界的用例：

1. [org.apache.catalina.util.LifecycleBase#start()](https://tomcat.apache.org/tomcat-8.0-doc/api/org/apache/catalina/util/LifecycleBase.html#start()) + [org.apache.catalina.core.StandardContext#startInternal()](https://tomcat.apache.org/tomcat-8.0-doc/api/org/apache/catalina/core/StandardContext.htmlstartInternal())

## 代理模式

### 经典实现

1. [经典代理实现](./src/main/java/me/rainstorm/patterns/proxy/SubjectProxy.java)
2. [基于 JDK 动态代理](./src/main/java/me/rainstorm/patterns/proxy/SubjectInvocationHandler.java)
3. [基于 cglib 动态代理](./src/main/java/me/rainstorm/patterns/proxy/SubjectMethodInterceptor.java)

### 应用场景

经典应用场景

1. 对另外对象的控制访问
1. 延迟初始化
1. 日志
1. 对象引用计数

现实世界的用例

1. [java.lang.reflect.Proxy](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Proxy.html)
1. [Apache Commons Proxy](https://commons.apache.org/proper/commons-proxy/)
1. Mocking frameworks Mockito, Powermock, EasyMock

## 原型模式

### 经典实现

1. [经典原型模式](./src/main/java/me/rainstorm/patterns/prototype/Prototype.java)

### 应用场景

经典应用场景

1. 资源优化场景。字节流拷贝，优化类初始化需要消耗资源比较多的情况
1. 避免并发问题。

## 参考

1. [Design patterns implemented in Java](http://java-design-patterns.com/)
1. [Singleton pattern with combination of lazy loading and thread safety](https://stackoverflow.com/questions/15792186/singleton-pattern-with-combination-of-lazy-loading-and-thread-safety)
1. [Initialization-on-demand holder idiom](https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom)
1. [由Spring框架中的单例模式想到的](http://www.cnblogs.com/chengxuyuanzhilu/p/6404991.html)
1. [How do I access private methods and private data members via reflection?](https://stackoverflow.com/questions/11483647/how-do-i-access-private-methods-and-private-data-members-via-reflection/11484158#11484158)
