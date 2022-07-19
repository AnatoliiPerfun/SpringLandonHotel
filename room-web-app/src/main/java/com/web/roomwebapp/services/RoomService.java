package com.web.roomwebapp.services;

import com.web.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 10:27 PM
 */

@Service
public class RoomService {
    private static final List<Room> _rooms = new ArrayList<>();
    static{
        IntStream.range(0, 10)
                .mapToObj(i -> new Room(i, "Room"+i, "R"+i, "Q"))
                .forEach(_rooms::add);
    }
    public List<Room> getAllRooms() {
        return _rooms;
    }
}
