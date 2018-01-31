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

import com.yuen.domain.Account;
import com.yuen.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;

    @GetMapping("/account")
    public String login(Model model) {
                return "login";
    }
        
    @PostMapping("/account/search")
    public String search(@RequestParam("accountPassword") String p, @RequestParam("userEmail") String e,  Model model) {
        if (p.equals("") && e.equals("")) {
            return "redirect:/account";
        }
        if (!accountService.search(e).isEmpty() && (!accountService.searchAccountPassword(p).isEmpty())) {
        model.addAttribute("accounts", accountService.search(e));
        model.addAttribute("password", accountService.searchAccountPassword(p));
        return "list";
        }
        else return "redirect:/account";
    }

    


}
