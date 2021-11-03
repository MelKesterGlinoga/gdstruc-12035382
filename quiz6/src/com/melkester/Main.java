package com.melkester;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        System.out.println("\nAscending order: ");
        tree.traverseInOrder();

        System.out.println("\nDescending order: ");
        tree.traverseInOrderDescending();

        System.out.println("\nMinimum and Maximum value: ");
        tree.getMin();
        tree.getMax();

        System.out.println("\nRoot node: " + tree.get(25));
        System.out.println(tree.get(99999));
    }
}
