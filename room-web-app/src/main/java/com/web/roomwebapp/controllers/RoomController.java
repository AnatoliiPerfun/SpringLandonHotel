package com.web.roomwebapp.controllers;

import com.web.roomwebapp.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 10:05 PM
 */

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static final List<Room> _rooms = new ArrayList<>();
    static {
        IntStream.range(0, 10)
                .mapToObj(i -> new Room(i, "Room" + i, "R" + i, "Q"))
                .forEachOrdered(_rooms::add);
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", _rooms);
        return "rooms";
    }
}
