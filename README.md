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
    - [个人实践](#个人实践)
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

### 个人实践

## 参考

1. [Design patterns implemented in Java](http://java-design-patterns.com/)
1. [Singleton pattern with combination of lazy loading and thread safety](https://stackoverflow.com/questions/15792186/singleton-pattern-with-combination-of-lazy-loading-and-thread-safety)
1. [Initialization-on-demand holder idiom](https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom)
1. [由Spring框架中的单例模式想到的](http://www.cnblogs.com/chengxuyuanzhilu/p/6404991.html)
1. [How do I access private methods and private data members via reflection?](https://stackoverflow.com/questions/11483647/how-do-i-access-private-methods-and-private-data-members-via-reflection/11484158#11484158)
