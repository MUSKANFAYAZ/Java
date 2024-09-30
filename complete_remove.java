 //Code to completely remove any number from an array

package Java;

import java.util.Scanner;
public class complete_remove {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an array");
            int n = sc.nextInt();

            int numbers[] = new int[n];
            System.out.println("Enter the array elements");
            for(int i=0;i<n;i++)
            {
                numbers[i] = sc.nextInt();
            }

            System.out.println("Enter the number to remove");
            int numbertoremove = sc.nextInt();

            System.out.println("Original Array");
            for(int i=0;i<n;i++)
            {
                System.out.print(numbers[i] + " ");
            }

            int newsize = 0;
            for(int i=0;i<numbers.length;i++)
            {
                if(numbers[i] != numbertoremove){
                    numbers[newsize] = numbers[i];
                    newsize++;
                }
            }
            System.out.println();

            System.out.println("Resultant Array");
            for(int i=0;i<newsize;i++)
            {
                System.out.print(numbers[i] + " ");
            }
        }
}
}
