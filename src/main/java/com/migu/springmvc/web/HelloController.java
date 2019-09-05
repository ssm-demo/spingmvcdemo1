package com.migu.springmvc.web;

import com.migu.springmvc.bean.Boy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.jws.WebParam;

@Controller
public class HelloController {
        @RequestMapping("/index")
        public String hello(){
            return "index";
        }

        @RequestMapping("/getRole")
        public ModelAndView getRole()
        {
            ModelAndView mv = new ModelAndView();
            mv.addObject(new Boy("cjq","not"));
            mv.setView(new MappingJackson2JsonView());
            return mv;
        }
}
