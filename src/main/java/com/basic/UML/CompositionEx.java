package com.basic.UML;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class CompositionEx {
    public static void main(String[] args) {
        House house = new House();
        house.showRooms();
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Room {

    private String name;

}

@Data
class House {

    private List<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
    }

    public void showRooms() {
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
    }

}