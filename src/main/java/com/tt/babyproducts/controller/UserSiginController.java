package com.tt.babyproducts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tt.babyproducts.model.User;


@Controller
public class UserSiginController {

//	 @Autowired
//	 UserService userService;
	 
	@GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(User user) {
//        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    @PostMapping("/login")
//    public String login(User user, Model model) {
//        User foundUser = userService.findUserByUsername(user.getUsername());
//        if (foundUser == null) {
//            return "redirect:/signup"; // User not found
//        }
//        if (!foundUser.getPassword().equals(user.getPassword())) {
//            model.addAttribute("error", "Invalid password!");
//            return "login"; // Show error message
//        }
//        return "menu"; // if both are correct Show menu
//    }
}
