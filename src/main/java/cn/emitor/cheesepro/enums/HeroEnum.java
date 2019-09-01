package cn.emitor.cheesepro.enums;

public enum HeroEnum {
    JIAN_MO("剑魔", 3),
    HU_LI("狐狸", 2),
    A_KA_LI("阿卡丽", 4),
    FENG_HUANG("凤凰", 5),
    HAN_BING("寒冰", 3),
    LONG_WANG_("龙王", 4),
    JI_QI_REN("机器人", 2),
    HUO_NAN("火男", 4),
    BU_LONG("布隆", 2),
    DA_CHONG_ZI("大虫子", 4),
    NUO_SHOU("诺手", 1),
    DE_LAI_WEN("德莱文", 4),
    ZHI_ZHU("蜘蛛", 1),
    GUA_FU("寡妇", 3),
    JIAN_JI("剑姬", 1),
    CHUAN_ZHANG("船长", 3),
    GAI_LUN("盖伦", 1),
    NA_ER("纳尔", 4),
    NAN_QIANG("男枪", 1),
    SI_GE("死歌", 5),
    KA_SA_DING("卡萨丁", 1),
    KA_TE("卡特", 3),
    TIAN_SHI("天使", 5),
    KAI_NAN("凯南", 3),
    TANG_LANG("螳螂", 1),
    QIAN_JUE("千珏", 4),
    RI_NV("日女", 4),
    BING_NV("冰女", 2),
    AO_BA_MA("奥巴马", 2),
    LU_LU("露露", 2),
    NV_QIANG("女枪", 5),
    TIE_NAN("铁男", 1),
    MO_GAN_NA("莫甘娜", 3),
    BAO_NV("豹女", 1),
    BO_BI("波比", 3),
    PAI_KE("派克", 2),
    WA_JUE_JI("挖掘机", 2),
    SHI_ZI_GOU("狮子狗", 3),
    ZHU_MEI("猪妹", 3),
    SHEN("慎", 2),
    LONG_NV("龙女", 3),
    WU_YA("乌鸦", 5),
    XIAO_PAO("小炮", 1),
    WEI_LU_SI("维鲁斯", 2),
    WEI_EN("VN", 1),
    XIAO_FA("小法", 3),
    GOU_XIONG("狗熊", 3),
    LANG_REN("狼人", 1),
    YA_SUO("亚索", 5),
    JIE("劫", 2),
    KA_PAI("卡牌", 2),
    KA_MI_ER("卡密尔", 1),
    JIE_SI("杰斯", 2),
    WEI("蔚", 3),
    JIN_KE_SI("金克斯", 4);

    public String name;
    public int cost;

    HeroEnum(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.name + "消耗: " + this.cost + "金币，获得的羁绊: "; // TODO
    }


}
