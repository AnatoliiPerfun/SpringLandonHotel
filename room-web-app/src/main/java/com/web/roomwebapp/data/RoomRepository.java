package com.web.roomwebapp.data;

import com.web.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tolik
 * @project Spring
 * @created 7/24/2022 - 1:33 PM
 */
public interface RoomRepository extends JpaRepository<Room, Long> {
}
