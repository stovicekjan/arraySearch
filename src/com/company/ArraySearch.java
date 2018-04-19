package com.company;

import java.util.ArrayList;

/**
 * Created by Jan on 19. 4. 2018.
 */
public class ArraySearch {

    /**
     * The function searches for an Integer in an ArrayList al by binary algorithm with the time complexity
     * of O(log n).
     * @param al - ArrayList
     * @param num - the Integer to be searched
     * @return the index of the found element, or -1 if the element is not present
     */
    public static int binarySearch(ArrayList<Integer> al, Integer num) {
        int left = 0;
        int right = al.size() - 1;
        int index;

        if (al.size() == 0)
            return -1;

        do {
            index = (left + right) / 2;

            if (num > al.get(index))
                left = index;
            else
                right = index;

            if (right - left == 1 && !num.equals(al.get(left)) && !num.equals(al.get(right)))
                return -1;

            if (right == left && !num.equals(al.get(left)))
                return -1;

            if (right - left == 1 && num.equals(al.get(left)))
                return left;

            if (right - left == 1 && num.equals(al.get(right)))
                return right;
        } while (num != al.get(index));

        return index;
    }

}
