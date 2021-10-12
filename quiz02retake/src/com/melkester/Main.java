package com.melkester;

public class Main {

    public static void main(String[] args) {
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HpDeskjet", 34);
        Player linkedPlayer = new Player(4, "LinkedPlayer", 69);

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);
        playerLinkedList.addToFront(linkedPlayer);

        playerLinkedList.printList();

        playerLinkedList.removeFirstElement();

        playerLinkedList.contains(asuna);
        playerLinkedList.indexOf(hpDeskjet);

        playerLinkedList.printList();
    }
}
