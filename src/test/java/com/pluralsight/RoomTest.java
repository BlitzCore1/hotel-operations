package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest
{
    @Test
    public void checkin_shouldMarkRoom_asDirtyAndOccupied()
    {
        // arrange
        // setup the object to be tested
        Room room = new Room("king", 1, 139.00);

       // act
       // do the thing we are testing
        room.checkIn();



       // assert
        assertEquals(true, room.isDirty(), "Because the room is checked, in the room is marked as dirty");
        assertEquals(true, room.isOccupied(), "Because the room is checked, in the room is marked as occupied");

    }

}