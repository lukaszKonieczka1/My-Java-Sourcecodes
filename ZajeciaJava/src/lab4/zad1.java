package lab4;

import java.util.Random;

public class zad1 {
    public zad1() {
        int[] nums = new int[30], numscpy = new int[nums.length];
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            nums[i] = rand.nextInt(150 - 99) + 99;
        }
        numscpy = nums.clone();

        System.out.print("Wylosowane liczby\nTab 1\n|");

        for (int i = 0; i < 30; i++) {
            System.out.print(nums[i] + "|");
        }
        System.out.print("\nTab 2\n|");
        for (int i = 0; i < 30; i++) {
            System.out.print(numscpy[i] + "|");
        }

    }


}
