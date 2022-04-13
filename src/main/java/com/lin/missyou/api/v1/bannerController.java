package com.lin.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class bannerController {
    @GetMapping("/test")
    public void test(HttpServletResponse response) throws IOException {
        // 中文乱码
        response.getWriter().write("hello,张正洋");
    }

    @GetMapping("/test1")
    @ResponseBody
    public String test1(HttpServletResponse response) {
        return "hello,张正洋";
    }
}
