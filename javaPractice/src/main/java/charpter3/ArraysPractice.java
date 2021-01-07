package charpter3;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 4, 3, 8,10};

        //copy
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);

        for (int number : numbers){
            System.out.println(number);
        }

        for (int number : copyNumbers) {
            System.out.println(number);
        }

        int[] doubleNumbers = Arrays.copyOf(numbers, 2 * numbers.length);
        for (int number : doubleNumbers){
            System.out.println(number);
        }

        //sort: 优化的快速排序算法
        Arrays.sort(numbers);
        for (int number : numbers){
            System.out.println(number);
        }

        // search：
        int index = Arrays.binarySearch(numbers, 0, numbers.length, 2);
        System.out.println(index);

    }
}
