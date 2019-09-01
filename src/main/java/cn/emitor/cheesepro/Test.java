package cn.emitor.cheesepro;

import cn.emitor.cheesepro.service.HeroFactory;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    public static void main(String[] args) {
//        testTheMostBuffTeam();
//        List<Buff> buffs = new ArrayList<>();
//        buffs.add(new JianShi());
//        buffs.add(new Devil());
//        buffs.add(new JianShi());
//        buffs.add(new Devil());
//        buffs.add(new LangRen());
//
//        Map<Buff, Integer> map = getBuffAndItCountMap(buffs);
//        Iterator<Map.Entry<Buff, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Buff, Integer> entry = iterator.next();
//            System.out.println(entry.getKey().name() + " 个数： " + entry.getValue());
//        }
//        int point = getPoint(map);
//        System.out.println(point);

        Map<String, List<Hero>> map = testTheMostBuffTeam();
        map.forEach((k, v) -> {
            StringBuilder stringBuilder = new StringBuilder();
            v.forEach(hero -> stringBuilder.append(hero.heroEnum.name()).append(" + "));
            System.out.println(k + stringBuilder.toString());
            System.out.println("以上阵容羁绊是："+getZhengXingFromHeroList(v));
            System.out.println("==========================我是分割线=============================");
        });

//        int pointMax = testTheMostBuffTeam();
//        System.out.println(pointMax);

    }

    private static Map<String, List<Hero>> testTheMostBuffTeam() {
        List<Hero> allHeroList = HeroFactory.getAllHero();

        long length = allHeroList.size();

        int point = 0; // 计算指数
//        int powerTeamCount = 1;

        Map<String, List<Hero>> powerTeam = new HashMap<>();

        for (int a = 0; a < length; a++) {
            for (int b = a + 1; b < length; b++) {
                for (int c = b + 1; c < length; c++) {
                    for (int d = c + 1; d < length; d++) {
                        for (int e = d + 1; e < length; e++) {
                            for (int f = e + 1; f < length; f++) {
                                for (int g = f + 1; g < length; g++) {
                                    for (int h = g + 1; h < length; h++) {
                                        for (int i = h + 1; i < length; i++) {
                                            for (int j = i + 1; j < length; j++) {
                                                // 处理逻辑
                                                List<Hero> calcHeroList = new ArrayList<>();

                                                calcHeroList.add(allHeroList.get(a));
                                                calcHeroList.add(allHeroList.get(b));
                                                calcHeroList.add(allHeroList.get(c));
                                                calcHeroList.add(allHeroList.get(d));
                                                calcHeroList.add(allHeroList.get(e));
                                                calcHeroList.add(allHeroList.get(f));
                                                calcHeroList.add(allHeroList.get(g));
                                                calcHeroList.add(allHeroList.get(h));
                                                calcHeroList.add(allHeroList.get(i));
                                                calcHeroList.add(allHeroList.get(j));

                                                List<Buff> buffList = getBuffListFromHeroList(calcHeroList);
                                                Map<Buff, Integer> buffIntegerMap = getBuffAndItCountMap(buffList);
                                                int nowPoint = getPoint(buffIntegerMap);
                                                if (point < nowPoint) {
                                                    point = nowPoint;
                                                }
                                                if (nowPoint >= 11) {
                                                    powerTeam.put("给力阵容方案" + nowPoint + "种羁绊：", calcHeroList);
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    calcHeroList.forEach(hero -> {
                                                        stringBuilder.append(hero.heroEnum.name).append(" + ");
//                                                        System.out.println("给力阵容方案" + nowPoint + "种羁绊：" + stringBuilder.toString());
                                                    });
                                                    System.out.println("以下给力阵容方案具有" + nowPoint + "种羁绊：" + stringBuilder.toString());
                                                    System.out.println("以上阵容羁绊是："+getZhengXingFromHeroList(calcHeroList));
                                                    System.out.println("==========================我是分割线=============================");
                                                }
//                                                powerTeam.put("给力阵容方案" + nowPoint, calcHeroList);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return powerTeam;
    }

    private static Map<Buff, Integer> getBuffAndItCountMap(List<Buff> buffList) {
        Map<Buff, Integer> resultMap = new HashMap<>();
        for (Buff buff : buffList) {
            Integer integer = resultMap.get(buff);
            if (null != integer) {
                resultMap.put(buff, ++integer);
            } else {
                resultMap.put(buff, 1);
            }
        }

        return resultMap;
    }

    private static int getPoint(Map<Buff, Integer> map) {
        // 获取最少有最低羁绊的数量
        AtomicInteger point = new AtomicInteger();
        map.forEach((k, v) -> {
            int[] levels = k.levels();
            int minCountToBuff = levels[0];
            if (minCountToBuff <= v) {
                point.getAndIncrement();
            }
        });

        return point.get();
    }

    private static String getZhengXingFromHeroList(List<Hero> heroList) {
        StringBuilder stringBuilder = new StringBuilder();

        List<Buff> buffList = getBuffListFromHeroList(heroList);

        Map<Buff, Integer> buffIntegerMap = getBuffAndItCountMap(buffList);
        buffIntegerMap.forEach((k, v) -> stringBuilder.append(v).append(k.name()).append(Arrays.toString(k.levels())).append("---"));

        return stringBuilder.toString();
    }

    private static List<Buff> getBuffListFromHeroList(List<Hero> heroList) {
        List<Buff> buffList = new ArrayList<>();
        for (Hero hero : heroList) {
            Set<Buff> buffs = hero.buffs;
            buffList.addAll(buffs);
        }

        return buffList;
    }
}
























