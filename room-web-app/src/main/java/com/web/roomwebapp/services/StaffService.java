package com.web.roomwebapp.services;

import com.web.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.web.roomwebapp.models.Position.*;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 10:27 PM
 */

@Service
public class StaffService {

    private static final List<StaffMember> _staff = new ArrayList<>();
    static {
        _staff.add(new StaffMember(UUID.randomUUID().toString(), "Joe", "Doe", FRONT_DESK));
        _staff.add(new StaffMember(UUID.randomUUID().toString(), "Sam", "Serious", SECURITY));
        _staff.add(new StaffMember(UUID.randomUUID().toString(), "Marry", "Poppins", HOUSEKEEPING));
    }
    public List<StaffMember> getAllStaffMembers() {
        return _staff;
    }
}
