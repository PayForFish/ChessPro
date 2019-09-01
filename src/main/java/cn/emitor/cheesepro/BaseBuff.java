package cn.emitor.cheesepro;

public abstract class BaseBuff implements Buff {
    @Override
    public int hashCode() {
        return this.name().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass());
    }
}
