package com.web.roomwebapp.controllers;

import com.web.roomwebapp.data.StaffRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 11:24 PM
 */

@Controller
@RequestMapping("/staff")
public class StaffController {

   private final StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping
    public String getAllStaff(Model model) {
        model.addAttribute("staff", staffRepository.findAll());
        return "staff";
    }
}
