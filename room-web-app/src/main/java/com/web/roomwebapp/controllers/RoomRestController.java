package com.web.roomwebapp.controllers;

import com.web.roomwebapp.models.Room;
import com.web.roomwebapp.services.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 11:42 PM
 */

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }
    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
}
