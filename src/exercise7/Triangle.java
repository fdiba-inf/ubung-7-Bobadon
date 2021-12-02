package exercise7;

import java.util.Scanner;

    public class Triangle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = input.nextInt();
            for (int a = 1; a <= n; a++) {
                    printLine(1, a);
            }
            for (int a = n - 1; a >= 1; a--) {
                printLine(1, a);
            }
        }
        public static void printLine(int start, int end) {
            for (int x = start; x <= end; x++) {
                System.out.print(x);
                if(x != end) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }