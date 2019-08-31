package cn.emitor.cheesepro.buff;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HaiDao implements Buff {
    @Override
    public String name() {
        return BuffEnum.HAI_DAO.name;
    }

    @Override
    public int[] levels() {
        return BuffEnum.HAI_DAO.levels;
    }

    @Override
    public String descriptions() {
        return BuffEnum.HAI_DAO.description;
    }

    @Override
    public BuffEnum getBuffEnum() {
        return BuffEnum.HAI_DAO;
    }
}