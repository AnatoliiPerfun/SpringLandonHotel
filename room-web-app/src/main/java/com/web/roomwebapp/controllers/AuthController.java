package com.web.roomwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tolik
 * @project Spring
 * @created 7/24/2022 - 4:43 PM
 */

@Controller
public class AuthController {

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
