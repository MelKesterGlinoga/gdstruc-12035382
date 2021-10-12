package com.melkester;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random randomNumPlayers = new Random();
        Scanner pause = new Scanner(System.in);

        ArrayQueue queue = new ArrayQueue(15);
        ArrayQueue inGame = new ArrayQueue(5);

        queue.enqueue(new Player(1, "player 1", 34));
        queue.enqueue(new Player(2, "jessica", 55));
        queue.enqueue(new Player(3, "evan", 13));
        queue.enqueue(new Player(4, "tyler", 21));
        queue.enqueue(new Player(5, "queue", 8));
        queue.enqueue(new Player(6, "new player", 1));
        queue.enqueue(new Player(7, "stuka", 4));
        queue.enqueue(new Player(8, "will smith", 77));
        queue.enqueue(new Player(9, "god1", 444));
        queue.enqueue(new Player(10, "nice", 69));
        queue.enqueue(new Player(11, "mig 3", 514));
        queue.enqueue(new Player(12, "glhf", 6));
        queue.enqueue(new Player(13, "bedtime", 15));
        queue.enqueue(new Player(14, "array", 66));
        queue.enqueue(new Player(15, "stack", 32));

        int randPlayers = 0;
        int round = 1;

        while (round != 11)
        {
            if (round == 11)
                break;

            System.out.println("Round: " + round);

            while (inGame.size() < 5) // inGame size limit is 5
            {
                randPlayers = randomNumPlayers.nextInt(7) + 1;

                System.out.println("Queueing players . . . ");

                pause.nextLine();

                for (int i = 0; i < randPlayers; i++)
                {
                    inGame.enqueue(queue.dequeue());

                    if (inGame.size() >= 5)
                        break;
                }

                if (inGame.size() == 5)
                    break;
            }

            inGame.printQueue();
            System.out.println("Game is starting . . . ");

            for (int i = 0; i < 5; i++) // simulate game ending, remove players from game and re-queue them
            {
                queue.enqueue(inGame.dequeue());
            }

            round++;
            pause.nextLine();
        }
    }
}
