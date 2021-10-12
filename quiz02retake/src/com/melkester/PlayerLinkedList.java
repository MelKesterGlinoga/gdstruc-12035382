package com.melkester;

import java.util.LinkedList;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void removeFirstElement()
    {
        System.out.println("The first element is " + head.getPlayer());
        System.out.println("Removing the first element . . . \n");
        head = head.getNextPlayer();
    }

    public boolean contains(Player player)
    {
        PlayerNode current = head;

        current.getPlayer();
        if (player == current.getPlayer())
        {
            return true;
        }
        return false;
    }

    public int indexOf(Player player)
    {
        int position = 0;

        PlayerNode current = head;

        while (current != null)
        {
            current.getPlayer();
            if (player == current.getPlayer())
            {
                return position;
            }
        }
        return position;
    }

    public void printList()
    {
        int counter = 0;
        System.out.println("Linked list:");
        PlayerNode current = head;
        System.out.print("HEAD -> ");

        while (current != null)
        {
            counter++;
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }

        System.out.println("null");
        System.out.println("There are " + counter + " elements in the linked list\n");
    }
}
