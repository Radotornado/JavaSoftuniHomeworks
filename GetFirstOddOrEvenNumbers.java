package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numsAsStrings = scanner.nextLine().trim().split("\\s");
        String[] commandTokens = scanner.nextLine().trim().split("\\s");

        int[] nums = new int[numsAsStrings.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numsAsStrings[i]);
        }

        int numOfelements = Integer.parseInt(commandTokens[1]);
        String oddEvene = commandTokens[2];

        if(oddEvene.toLowerCase().equals("odd")) {
            printMatches(nums, numOfelements, 1);
        } else {
            printMatches(nums, numOfelements, 0);
        }
    }

    private static void printMatches(int[] nums, int numOfelements, int type) {
        for (int i = 0; i < nums.length; i++) {
            if(numOfelements == 0) {
                break;
            }

            if(nums[i] % 2 == type) {
                numOfelements--;
                System.out.print(nums[i] + " ");
            }
        }
    }
}
