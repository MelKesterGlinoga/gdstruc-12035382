package com.melkester;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList playerLinkedList = new LinkedList();

        playerLinkedList.add("Asuna");
        playerLinkedList.add("Lethal Bacon");
        playerLinkedList.add("HP Deskjet");
        printList(playerLinkedList);

        playerLinkedList.add("Unicorn but black and white");
        printList(playerLinkedList);

        removeFirstElement(playerLinkedList);
        printList(playerLinkedList);

        checkElement("Lethal Bacon", playerLinkedList);
        checkWhatIndex("Lethal Bacon", playerLinkedList);
    }

    private static void removeFirstElement(LinkedList list)
    {
        System.out.println("The first element is " + list.get(0));
        System.out.println("Removing the first element . . . \n");
        list.remove(0);
    }

    private static void printList(LinkedList list)
    {
        System.out.println("Linked list: ");
        int counter = 0;
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
            counter++;
        }
        System.out.println("There are " + counter + " elements in this linked list.\n");
    }

    private static void checkElement(String element, LinkedList list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (element == list.get(i))
            {
                System.out.println(element + " exists in the list.");
                break;
            }
            else
            {
                System.out.println(element + " does not exist in the list.");
            }
        }
    }

    private static void checkWhatIndex(String element, LinkedList list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (element == list.get(i))
            {
                System.out.println(element + " is in the index " + i);
                break;
            }
        }
    }
}
