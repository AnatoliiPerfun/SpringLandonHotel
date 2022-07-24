package com.web.roomwebapp.data;

import com.web.roomwebapp.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tolik
 * @project Spring
 * @created 7/24/2022 - 2:38 PM
 */
public interface StaffRepository extends JpaRepository<Staff, String> {
}
