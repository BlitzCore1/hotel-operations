package com.pluralsight;

public class Hotel
{
    private String name;
    private int numberOfSuites;
    private int numberOfBasicRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfBasicRooms)
    {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfBasicRooms, int bookedSuites, int bookedBasicRooms)
    {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getAvailableRooms()
    {
       return numberOfBasicRooms - bookedBasicRooms;
    }

    public int getAvailableSuites()
    {
        return numberOfSuites - bookedSuites;
    }

   // public boolean bookRoom(int numberOfBasicRooms, boolean isSuite)
    {

    }

}
