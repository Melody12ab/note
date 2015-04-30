package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/4/27.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/index")
    public String login() {
        return "success";
    }
}
