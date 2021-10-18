package com.melkester;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(134, "Asuna", 100);
        Player lethalBacon = new Player(542, "LethalBacon", 205);
        Player hpDeskjet = new Player(21, "HpDeskjet", 34);
        Player linkedPlayer = new Player(49999, "LinkedPlayer", 69);
        Player hashBrownTable = new Player(68419, "HashBrown", 123);
        Player fiveSeven = new Player(12312, "Five7", 121);

        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put(asuna.getUsername(), asuna);
        hashtable.put(lethalBacon.getUsername(), lethalBacon);
        hashtable.put(hpDeskjet.getUsername(), hpDeskjet);
        hashtable.put(linkedPlayer.getUsername(), linkedPlayer);
        hashtable.put(hashBrownTable.getUsername(), hashBrownTable);
        hashtable.put(fiveSeven.getUsername(), fiveSeven);

        hashtable.printHashtable();

        System.out.println("\nRemoving element . . . \n");
        hashtable.remove(fiveSeven.getUsername(), fiveSeven);

        hashtable.printHashtable();

        //System.out.println(hashtable.get("HashBrown"));
    }
}
