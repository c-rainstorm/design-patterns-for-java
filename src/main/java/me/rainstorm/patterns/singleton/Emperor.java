package me.rainstorm.patterns.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Thread-safe
 * <p>
 * 有数量上限的单例类
 *
 * @author baochen1.zhang
 * @date 2018.07.30
 */
public class Emperor {

    private Emperor() {
    }

    /**
     * 当前使用 List，可根据情况换用 Map，Set 等容器类型并重写 getInstance 方法
     */
    private static List<Emperor> emperors;
    private static final Integer MAX_NUM_OF_EMPEROR = Integer.valueOf(3);
    /**
     * 保证 getInstance 的线程安全性
     */
    private static AtomicInteger lastUsed = new AtomicInteger(-1);
    static {
        emperors = new ArrayList<>();
        for (int i = 0; i < MAX_NUM_OF_EMPEROR; ++i) {
            emperors.add(new Emperor());
        }
    }

    /**
     * 使用 AtomicInteger 保证线程安全
     *
     * 当前使用轮询方式获取，可根据情况换用随机等方式
     *
     * @return
     */
    public static Emperor getInstance() {
        // todo lastUsed 增加到 Integer.MAX_VALUE 之后的行为和预期不符
        Integer index = lastUsed.incrementAndGet();
        return emperors.get(index % MAX_NUM_OF_EMPEROR);
    }

}
