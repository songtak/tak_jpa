package com.sn9tk.web;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootConfiguration
@Controller
public class HomeController {
     @GetMapping("/")
     public String hello() {
    	 System.out.println();
	return "index"; //페이지 이동
}
     @GetMapping("/home")
     public String home() {
    	 System.out.println("유저 홈으로 이동");
	return "user"; //페이지 이동
}
}

