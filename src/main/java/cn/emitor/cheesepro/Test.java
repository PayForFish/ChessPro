package cn.emitor.cheesepro;

import cn.emitor.cheesepro.hero.JianMo;

public class Test {

    public static void main(String[] args) {
        JianMo jianMo = new JianMo();
        for (Buff buff : jianMo.getBuffs()) {
            String test = buff.descriptions();
            System.out.println(test);
        }

    }
}
