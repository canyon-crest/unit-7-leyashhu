package com.csplusplus;

import java.util.ArrayList;
import java.util.Random; // Import Random for shuffling

public class Unit7 {

    // 1. Method that returns the sum of all elements in the ArrayList
    // Instructions: Traverse the ArrayList and calculate the sum of all integers in the list.
    // DO NOT use the Collections class or any additional methods beyond size(), add(), get(), set(), and remove().
    public static int sumOfElements(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    // 2. Method that removes all instances of a specific element from the ArrayList
    // Instructions: Use a loop to remove all instances of the specified element.
    // DO NOT use removeIf(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void removeAllInstances(ArrayList<Integer> list, int elementToRemove) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == elementToRemove) {
                list.remove(i);
                i--; // Decrement i because the list size has decreased and the next element is now at the current index i
            }
        }
    }

    // 3. Method that doubles each element in the ArrayList
    // Instructions: Multiply each element by 2 and update the list in place.
    // DO NOT use Collections or other methods beyond size(), add(), get(), set(), and remove().
    public static void doubleAllElements(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
    }

    // 4. Method that adds a new element to the list only if it is not already present
    // Instructions: Check manually if the element is already present before adding.
    // DO NOT use contains(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void addIfNotPresent(ArrayList<Integer> list, int newElement) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == newElement) {
                found = true;
                break; // Element found, no need to continue checking
            }
        }
        if (!found) {
            list.add(newElement);
        }
    }

    // 5. Method that returns a new ArrayList containing only the even elements from the input list
    // Instructions: Create a new list and manually collect the even elements.
    // DO NOT use streams, Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static ArrayList<Integer> getEvenElements(ArrayList<Integer> list) {
        ArrayList<Integer> evenElements = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) { // Check if the element itself is even
                evenElements.add(list.get(i));
            }
        }
        return evenElements;
    }

    // 6. Method that removes elements divisible by 5
    // Instructions: Use a loop to remove all elements divisible by 5.
    // DO NOT use removeIf(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void removeElementsDivisibleBy5(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 5 == 0) {
                list.remove(i);
                i--; // Decrement i because the list size has decreased and the next element is now at the current index i
            }
        }
    }

    // 7. Method that reverses the list without using the Collections class
    // Instructions: Reverse the order of the elements by swapping them manually.
    // DO NOT use Collections or other methods beyond size(), add(), get(), set(), and remove().
    public static void reverseList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            // Swap elements
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    // 8. Method that shuffles the elements of the list
    // Instructions: Shuffle the elements randomly by swapping them manually.
    // DO NOT use the Collections.shuffle() or other methods beyond size(), add(), get(), set(), and remove().
    public static void shuffleList(ArrayList<Integer> list) {
        Random rand = new Random(); // Create a Random object for generating random indices
        for (int i = list.size() - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = rand.nextInt(i + 1);

            // Swap list.get(i) with the element at the random index j
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}
