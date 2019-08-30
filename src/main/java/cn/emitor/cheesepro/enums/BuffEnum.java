package cn.emitor.cheesepro.enums;

public enum BuffEnum {
    E_MO("恶魔", new int[]{2, 4, 6}, "恶魔的普攻有40%几率灼烧目标20法力并回复恶魔15/30/45法力值"),
    LONG("龙", new int[]{2}, "龙免疫魔法伤害"),
    LANG_REN("浪人", new int[]{1}, "战斗开始时，如果一名浪人周围格子没有友军，则其获得等同于自身生命值的护盾"),
    JI_DI("极地", new int[]{2, 4, 6}, "极地生物有20/30/45几率对目标造成2秒眩晕效果"),
    DI_GUO("帝国", new int[]{2, 4}, "1名/所有帝国单位造成双倍伤害"),
    REN_ZHE("忍者", new int[]{1, 4}, "提高忍者50/70攻击力和法术强度"),
    GUI_ZU("贵族", new int[]{3, 6}, "1名随机/所有友军 增加60双抗并每次普攻回复35生命值"),
    AN_YIN("暗影", new int[]{2}, "战斗开始时诅咒一名随机敌人，将其生命值设置为100"),
    HAI_DAO("海盗", new int[]{3}, "每回合战斗结束随机掉落0-4个金币"),
    JI_QI_REN("机器人", new int[]{1}, "机器人在回合开始就拥有满额法力值"),
    KONG_XU("空虚", new int[]{3}, "虚空单位造成真实伤害"),
    KUANG_YE("狂野", new int[]{2, 4}, "狂野/所有 友军普攻获得怒气层，之多五层叠加，每层提供12%攻速加成"),
    YUE_DE_ER_REN("约德尔人", new int[]{3, 6}, "约德尔人有30%/55% 几率闪避攻击及特效"),
    HAI_KE_SI("海克斯科技", new int[]{2, 4}, "朝着一名戴着装备的敌军扔出一颗炸弹，并禁用1/2格内所有装备，持续8秒"),
    CI_KE("刺客", new int[]{3, 6}, "刺客们获得额外150%/300% 的暴击伤害"),
    JIAN_SHI("剑士", new int[]{3, 6, 9}, "剑士们的每次攻击有45%几率打出 1/2/4次额外攻击"),
    DOU_SHI("斗士", new int[]{2, 4, 6}, "斗士获得额外的200/500/900 点最大生命值"),
    YUAN_SU_SHI("元素使", new int[]{3}, "元素使们的攻击提供双倍法力值，战斗开始时，召唤小菊"),
    HU_WEI("护卫", new int[]{2}, "战斗开始时，护卫周围各自友军获得50护甲"),
    QIANG_SHOU("枪手", new int[]{2, 4, 6}, "攻击时，枪手们有50%几率对额外1/2/4名随机敌军打出额外攻击"),
    QI_SHI("骑士", new int[]{2, 4, 6}, "整支队伍无视来自地方15/30/55伤害"),
    YOU_XIA("游侠", new int[]{2, 4}, "游侠们没过3秒有25%/65% 几率使他们在接下来3秒内攻速翻倍"),
    HUAN_XING_SHI("换形师", new int[]{3, 6}, "换形师们在他们变形时获得额外60%/120%最大生命值"),
    FA_SHI("法师", new int[]{3, 6}, "所有友军增加40%/100%技能伤害");
    public String name;
    public int[] levels;
    public String description;

    BuffEnum(String name, int[] levels, String description) {
        this.name = name;
        this.levels = levels;
        this.description = description;
    }
}
