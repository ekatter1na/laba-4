package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну массива");

        int lengthOfArray = scanner.nextInt();
        int[] myArray = new int[lengthOfArray];

        System.out.printf("Введите %d целых чисел +\n",lengthOfArray);

        for (int i = 0; i < lengthOfArray; i++)
        {
            myArray[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = myArray[0];

        for (int item: myArray)
        {
            if (min>item)
            {
                min = item;
            }
            sum += item;
        }
        System.out.println(min + sum/(double)lengthOfArray);
    }
}