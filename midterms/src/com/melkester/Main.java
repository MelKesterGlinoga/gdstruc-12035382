package com.melkester;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner pause = new Scanner(System.in);
        Random randomValue = new Random();

        CardStack stack = new CardStack(30);
        CardStack discarded = new CardStack(30);
        CardStack playerHands = new CardStack(30);

        stack.push(new Card(1, "cat"));
        stack.push(new Card(2, "dog"));
        stack.push(new Card(3, "sheep"));
        stack.push(new Card(4, "hamster"));
        stack.push(new Card(5, "feline cat"));
        stack.push(new Card(6, "cat dog"));
        stack.push(new Card(7, "bird"));
        stack.push(new Card(8, "omg a cute birb"));
        stack.push(new Card(9, "parrot"));
        stack.push(new Card(10, "Sonic"));
        stack.push(new Card(11, "sheepNoFur"));
        stack.push(new Card(12, "smol doggo hehe"));
        stack.push(new Card(13, "pelican"));
        stack.push(new Card(14, "magpie?"));
        stack.push(new Card(15, "what! not butter!?"));
        stack.push(new Card(16, "andISaidHeyYeaYeaYea"));
        stack.push(new Card(17, "pancakes"));
        stack.push(new Card(18, "treesAreSinging"));
        stack.push(new Card(19, "ohHiMark"));
        stack.push(new Card(20, "RTX 69420"));
        stack.push(new Card(21, "coffee"));
        stack.push(new Card(22, "Uno Reverse"));
        stack.push(new Card(23, "emptyCard.exe"));
        stack.push(new Card(24, "heyJude-beatles"));
        stack.push(new Card(25, "p6"));
        stack.push(new Card(26, "downloadFreeRam.com"));
        stack.push(new Card(27, "unique name"));
        stack.push(new Card(28, "starbucksIsExpensive"));
        stack.push(new Card(29, "machineGunGoBrr"));
        stack.push(new Card(30, "jerrythemouse001"));

        // program start

        int randCards = randomValue.nextInt(5) + 1;

        System.out.println("Getting cards from the deck . . . ");
        for (int i = 0; i < randCards; i++)
        {
            if (!stack.isEmpty())
            {
                playerHands.push(stack.pop());
            }
            else
            {
                break;
            }
        }

        pause.nextLine();

        playerHands.printStack();
        System.out.print("Remaining cards in deck: ");
        stack.printTotalStack();
        System.out.print("Discarded cards: ");
        discarded.printTotalStack();

        pause.nextLine();

        while (!playerHands.isEmpty())
        {
            int x = randomValue.nextInt(3) + 1;
            randCards = randomValue.nextInt(5) + 1;

            if (x == 1)
            {
                for (int i = 0; i < randCards; i++)
                {
                    if (!stack.isEmpty())
                    {
                        System.out.print


                                ("Getting cards from the deck . . . ");
                        playerHands.push(stack.pop());
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else if (x == 2)
            {
                for (int i = 0; i < randCards; i++)
                {
                    if (!playerHands.isEmpty())
                    {
                        System.out.print("Discarding cards . . . ");
                        discarded.push(playerHands.pop());
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else if (x == 3)
            {
                for (int i = 0; i < randCards; i++)
                {
                    if (!discarded.isEmpty())
                    {
                        System.out.print("Getting cards from the discarded deck . . . ");
                        playerHands.push(discarded.pop());
                    }
                    else
                    {
                        break;
                    }
                }
            }
            pause.nextLine();

            playerHands.printStack();

            System.out.print("Remaining cards in deck: ");
            stack.printTotalStack();

            System.out.print("Discarded cards: ");
            discarded.printTotalStack();

            pause.nextLine();
        }


        System.out.println("You currently don't have any cards.");
    }
}
