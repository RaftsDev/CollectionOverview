package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Olympian", 8, 12);
        List<Theater.Seat> seatCopy= new ArrayList<>(theater.seats);//shallowCopy
        printList(seatCopy);

        // check references to same data of both ArrayList

        seatCopy.get(1).reserve();
        if(theater.reserveSeat("A02")){
            System.out.println("Pay for reserve");
        }else{
            System.out.println("seat already reserved");
        }

/*
        if(theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if(theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        theater.getSeats();*/

    }

    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat: list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("*********************************************");
    }
}
