package com.web.roomwebapp.controllers;

import com.web.roomwebapp.models.StaffMember;
import com.web.roomwebapp.services.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tolik
 * @project Spring
 * @created 7/20/2022 - 5:32 PM
 */

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaffMembers() {
        return staffService.getAllStaffMembers();
    }
}
