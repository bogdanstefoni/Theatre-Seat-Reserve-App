package com.bogdan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater =  new Theater("Olympian", 8 ,12);
//        theater.getSeats();
        if(theater.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else {
            System.out.println("Seat already reserved");
        }
        if(theater.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        }else {
            System.out.println("Seat already reserved");

        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeat = new ArrayList<>(theater.getSeats());
        priceSeat.add(theater.new Seat("B00", 13.00));
        priceSeat.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeat, Theater.PRICE_ORDER);
        printList(priceSeat);

        }

    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================");
    }


}
