package com.melkester;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Array lists
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1,"Asuna", 100));
        playerList.add(new Player(2, "LethalBacon", 205));
        playerList.add(new Player(3, "HPDeskjet", 34));

        System.out.println(playerList.get(1));

        playerList.add(2, new Player(553, "Arctis", 55));   // add player in a specific index

        playerList.remove(2);   // removes element in the specified index

        System.out.println("Is LethalBacon in the array list? " + playerList.contains(new Player(2, "LethalBacon", 205)));
        System.out.println("The index of LethalBacon is : " + playerList.indexOf(new Player(2, "LethalBacon", 205)));

        playerList.forEach(player -> System.out.println(player));   // simplified for loop, prints the array

        for (Player p : playerList)     // for loops for printing array
        {
            System.out.println(p);
        }
    }
}
