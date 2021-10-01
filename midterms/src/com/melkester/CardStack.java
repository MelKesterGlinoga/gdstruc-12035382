package com.melkester;

import java.util.EmptyStackException;

public class CardStack {
    private Card[] stack;
    private int top;

    public CardStack(int capacity)
    {
        stack = new Card[capacity];
    }

    public void push(Card card)
    {
        if (top == stack.length) // stack is full
        {
            Card[] newStack = new Card[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
        }

        stack[top++] = card;
    }

    public Card pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        System.out.println();

        Card poppedCard = stack[--top];
        stack[top] = null;
        return poppedCard;
    }

    public Card peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        System.out.println("Your current cards: ");
        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }

    public void printTotalStack()
    {
        int total = 0;
        for (int i = top - 1; i >= 0; i--)
        {
            total++;
        }
        System.out.println(total);
    }
}
