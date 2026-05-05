package com.pluralsight;

public class Room
{
    private String roomType;
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(String roomType, int numberOfBeds, double price)
    {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;

    }

    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public int getNumberOfBeds()
    {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds)
    {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice()
    {
        double price = 0;

        if (roomType.equalsIgnoreCase("king"))
        {
            price = 139.00;
        }
        else if (roomType.equalsIgnoreCase("double"))
        {
            price = 124.00;
        }

        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public void setOccupied(boolean occupied)
    {
        isOccupied = occupied;
    }

    public boolean isDirty()
    {
        return isDirty;
    }

    public void setDirty(boolean dirty)
    {
        isDirty = dirty;
    }

    public boolean isAvailable()
    {
        return !isOccupied && !isDirty;
    }
}