package cn.emitor.cheesepro.service;

import cn.emitor.cheesepro.Hero;
import cn.emitor.cheesepro.hero.*;

import java.util.ArrayList;
import java.util.List;

public class HeroFactory {
    public static List<Hero> getAllHero(){
        List<Hero> allHeroList = new ArrayList<>();

        allHeroList.add(new JianMo());
        allHeroList.add(new HuLi());
        allHeroList.add(new AKaLi());
        allHeroList.add(new FengHuang());
        allHeroList.add(new HanBing());
        allHeroList.add(new LongWang());
        allHeroList.add(new JiQiRen());
        allHeroList.add(new HuoNan());
        allHeroList.add(new BuLong());
        allHeroList.add(new DaChongZi());
        allHeroList.add(new DeLaiWen());
        allHeroList.add(new NuoShou());
        allHeroList.add(new ZhiZhu());
        allHeroList.add(new GuaFu());
        allHeroList.add(new JianJi());
        allHeroList.add(new ChuanZhang());
        allHeroList.add(new GaiLun());
        allHeroList.add(new NaEr());
        allHeroList.add(new NanQiang());
        allHeroList.add(new SiGe());
        allHeroList.add(new KaSaDing());
        allHeroList.add(new KaTe());
        allHeroList.add(new TianShi());
        allHeroList.add(new KaiNan());
        allHeroList.add(new TangLang());
        allHeroList.add(new QianJue());
        allHeroList.add(new RiNv());
        allHeroList.add(new BingNv());
        allHeroList.add(new AoBaMa());
        allHeroList.add(new LuLu());
        allHeroList.add(new NvQiang());
        allHeroList.add(new TieNan());
        allHeroList.add(new MoGanNa());
        allHeroList.add(new BaoNv());
        allHeroList.add(new BoBi());
        allHeroList.add(new PaiKe());
        allHeroList.add(new WaJueJi());
        allHeroList.add(new ShiZiGou());
        allHeroList.add(new ZhuMei());
        allHeroList.add(new Shen());
        allHeroList.add(new LongNv());
        allHeroList.add(new WuYa());
        allHeroList.add(new XiaoPao());
        allHeroList.add(new WeiLuSi());
        allHeroList.add(new VN());
        allHeroList.add(new XiaoFa());
        allHeroList.add(new GouXiong());
        allHeroList.add(new Wolf());
        allHeroList.add(new YaSuo());
        allHeroList.add(new Jie());
        allHeroList.add(new KaPai());
        allHeroList.add(new KaMiEr());
        allHeroList.add(new JieSi());
        allHeroList.add(new Wei());
        allHeroList.add(new JinKeSi());

        return allHeroList;
    }
}
