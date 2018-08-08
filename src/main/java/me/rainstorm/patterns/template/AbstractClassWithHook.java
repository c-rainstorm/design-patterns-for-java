package me.rainstorm.patterns.template;

/**
 * @author baochen1.zhang
 * @date 2018.08.08
 */
public abstract class AbstractClassWithHook extends AbstractClass {

    @Override
    public void templateMethod() {

        if (isSuccess()) {
            successThing();
        }

        super.templateMethod();
    }

    /**
     * 给一个默认行为
     *
     * @return
     */
    protected boolean isSuccess() {
        return true;
    }

    protected abstract void successThing();
}
