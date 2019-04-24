package com.adpro.seat;

public class MiddleSeat extends Seat{

    private static int cost;

    public MiddleSeat(boolean isBooked, int seatNumber) {
        super(isBooked, seatNumber);
        cost = 35000;
        type = "Middle";
    }

    public static int getCost() {
        return cost;
    }

    public static void setCost(int cost) {
        cost = cost;
    }

}
