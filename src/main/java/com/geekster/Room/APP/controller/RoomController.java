package com.geekster.Room.APP.controller;


import com.geekster.Room.APP.model.Room;
import com.geekster.Room.APP.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    //post api

    @PostMapping("room")
    public String addRoom(@RequestBody Room newRoom)
    {
        return roomService.addRoom(newRoom);
    }

    @PostMapping("rooms")
     public String addRooms(@RequestBody List<Room> newRooms)
     {
         return  roomService.addRooms(newRooms);
     }
    //get api

    @GetMapping("rooms")
    public List<Room> getRooms()
    {
        return roomService.getRooms();
    }


    @GetMapping("room")
    public String getTest()
    {
        return "room";
    }

    @GetMapping("rooms/id/{id}")
    public Room getRoomById(@PathVariable Integer id)
    {
        return roomService.getRoomById(id);
    }

    @GetMapping("rooms/price/{price}")
    public List<Room> getRoomByPrice(@PathVariable double price)
    {
        return roomService.getRoomByPrice(price);
    }

    @GetMapping("rooms/price/{price}/and/available")
    public List<Room> getAvailableRoomsBelowPrice(@PathVariable double price)
    {
        return roomService.getAvailableRoomsBelowPrice(price);
    }

    @GetMapping("rooms/price/{price}/or/available")
    public List<Room> getAvailableRoomsOrBelowPrice(@PathVariable double price)
    {
        return roomService.getAvailableRoomsOrBelowPrice(price);
    }

    @GetMapping("rooms/AC/or/available")
    public List<Room> getAvailableRoomsOrACSortedByPrice()
    {
        return roomService.getAvailableRoomsOrAcSortedByPrice();
    }



    //delete by ID

    @DeleteMapping("rooms/ids")
    public String removeRooms(@RequestBody List<Integer> ids)
    {
        return  roomService.removeRooms(ids);
    }


}
