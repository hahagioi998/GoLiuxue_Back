package com.kenkoku.goliuxue.controller;

import com.kenkoku.common.R;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class LoginController {

    /**
     * 登录功能
     * @return
     */
    @PostMapping("login")
    public R login(){
        return R.ok().data("token", "admin");
    }

    @PostMapping("logout")
    public R logout(){
        return R.ok();
    }

    /**
     * 获取信息功能
     * @return
     */
    @GetMapping("info")
    public R info(){
        return R.ok()
                .data("name", "admin")
                .data("roles", "[admin, admin]")
                .data("avatar", "https://image.flaticon.com/icons/svg/3189/3189525.svg");
    }
}
