package Java;

import java.util.*;

public class Bubblesort {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter the size of an array");
          int size = sc.nextInt();
  
    int numbers[] = new int[size];
    System.out.println("Enter array elements");
    for(int i=0;i<size;i++)
    {
          numbers[i] = sc.nextInt();
    }

   for(int i=0;i<size;i++)
   {
          for(int j=0;j<size-i-1;j++)
          {
              if(numbers[i]>numbers[i+1])
              {
                  int temp = numbers[i];
                  numbers[i] = numbers[i+1];
                  numbers[i+1]= temp;
              }
          }
   }
   System.out.println("sorted array");
   for(int i=0;i<size;i++)
   {
          System.out.println(numbers[i]);
   }
        }
   
}
}
