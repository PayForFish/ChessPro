package cn.emitor.chesspro;

import cn.emitor.chesspro.enums.BuffEnum;

public interface Buff {
    String name();

    int[] levels(); // 返回羁绊的等级

    String descriptions();

    BuffEnum getBuffEnum();
}
