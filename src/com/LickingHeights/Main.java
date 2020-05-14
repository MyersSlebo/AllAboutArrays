package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;
        pattern1();
        pattern2();
        pattern3();


        int[] array = createNumberArray(size, lowestNumber, highestNumber);


    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void pattern1() {
        for (int f = 0; f < 6; f = f + 1) {
            for (int l = 0; l < 6; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void pattern2() {
        for (int f = 1; f < 7; f = f + 1) {
            for (int l = 0; l < 6; l++) {
                System.out.print(f);


            }
            System.out.println();

        }


    }

    public static void pattern3() {
        for (int f = 1; f < 7; f++) {
            int l;
            for (l = 1; l < 7; l++) {
                System.out.print(l);

            }
            System.out.println();
        }
    }
}





