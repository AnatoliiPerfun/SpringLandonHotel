package com.web.roomwebapp.services;

import com.web.roomwebapp.data.RoomRepository;
import com.web.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 10:27 PM
 */

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
}
