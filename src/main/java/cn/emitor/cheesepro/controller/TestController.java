package cn.emitor.cheesepro.controller;

import cn.emitor.cheesepro.Buff;
import cn.emitor.cheesepro.hero.JianMo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/test")
    public void test(@RequestParam String num) {

        JianMo jianMo = new JianMo();
        for (Buff buff : jianMo.getBuffs()) {
            String test = buff.descriptions();
            System.out.println(test);
        }

    }
}
