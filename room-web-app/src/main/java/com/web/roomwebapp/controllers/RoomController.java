package com.web.roomwebapp.controllers;

import com.web.roomwebapp.data.RoomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 10:05 PM
 */

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomRepository.findAll());
        return "rooms";
    }
}
