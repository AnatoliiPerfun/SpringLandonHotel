package com.web.roomwebapp.services;

import com.web.roomwebapp.data.StaffRepository;
import com.web.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 10:27 PM
 */

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }
}
