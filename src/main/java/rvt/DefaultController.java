package rvt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    @GetMapping(value = "/about")
    ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView("about");
        return modelAndView;
    }
    @GetMapping(value = "/test")
    public ModelAndView test(@RequestParam HashMap<String, String> allParams, User user){
        
        if(allParams.containsKey("success")){
            ModelAndView modelAndView = new ModelAndView("success"); 
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("test"); 
        return modelAndView;
    }


    @PostMapping(value = "/test")
    public String test1(@ModelAttribute("user") User user, BindingResult bindingResult){


        if (bindingResult.hasErrors()) {
            return "/test";
        }
        return "redirect:/test?success";
    }

    
    
}
