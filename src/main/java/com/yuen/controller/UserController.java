package com.yuen.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuen.domain.User;
import com.yuen.service.UserService;
import com.yuen.service.AccountService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AccountService accountService;

    @GetMapping("/register")
    public String login(Model model) {
                return "register";
    }
    
    @PostMapping("/user/save")
    public String save(@Valid User user, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        userService.save(user);
        redirect.addFlashAttribute("success", "Saved contact successfully!");
        return "redirect:/contact";
    }
        
   

    


}
