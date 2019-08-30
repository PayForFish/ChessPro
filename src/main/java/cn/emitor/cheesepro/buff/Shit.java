package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;
import org.springframework.stereotype.Component;

@Component
public class Shit implements Buff {
    @Override
    public String name() {
        return null;
    }

    @Override
    public int[] levels() {
        return new int[0];
    }

    @Override
    public String descriptions() {
        return "this is shit";
    }

    @Override
    public BuffEnum getBuffEnum() {
        return null;
    }
}
