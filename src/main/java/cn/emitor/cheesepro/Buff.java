package cn.emitor.cheesepro;

import cn.emitor.cheesepro.enums.BuffEnum;

public interface Buff {
    String name();

    int[] levels(); // 返回羁绊的等级

    String descriptions();

    BuffEnum getBuffEnum();
}
