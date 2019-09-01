package cn.emitor.chesspro.buff;

import cn.emitor.chesspro.BaseBuff;
import cn.emitor.chesspro.enums.BuffEnum;

/**
 * @author Emitor
 * on 2019/8/31.
 */
public class HaiDao extends BaseBuff {
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
