package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

public interface Devil extends Buff {
    @Override
    default String name(){
        return BuffEnum.E_MO.name;
    }

    @Override
    default int[] levels(){
        return BuffEnum.E_MO.levels;
    };

    @Override
    default String descriptions(){
        return BuffEnum.E_MO.description;
    };

    @Override
    default BuffEnum getBuffEnum(){
        return BuffEnum.E_MO;
    }

}
