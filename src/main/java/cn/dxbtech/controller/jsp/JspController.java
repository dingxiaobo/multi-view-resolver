package cn.dxbtech.controller.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hzdxb on 2017/7/14.
 */
@Controller
public class JspController {

    @GetMapping({"jsp","/"})
    String jsp() {
        return "hello";
    }

}
