package cn.dxbtech.controller.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hzdxb on 2017/7/14.
 */
@Controller
public class ThymeleafController {

    @GetMapping("thymeleaf")
    String thymeleaf() {
        return "hello";
    }

}
