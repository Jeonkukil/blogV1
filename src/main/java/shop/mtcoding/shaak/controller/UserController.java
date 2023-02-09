package shop.mtcoding.shaak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/loginForm")
    public String home() {
        return "user/loginForm";

    }
}
