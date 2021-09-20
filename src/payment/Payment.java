package payment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        //1> Asking for size of currency denominations     
        System.out.println("Enter the size of currency denominations ");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        
        //2> getting the denominations
        int [] denominationsArray = new int[size];
        System.out.println("Enter the currency denominations value");
        for(int i=0; i<size; i++){
            denominationsArray[i] = scn.nextInt();
        }

        //3> sort the denominationArray
        MergeSort MergeSort = new MergeSort();
        MergeSort.sort(denominationsArray, 0, denominationsArray.length-1);

        //4> Asking for amount 
        System.out.println("Enter the amount you want to pay");
        int amount = scn.nextInt();

        //5> payment
        int notesNum;
        int amountLeft = amount;
        System.out.println();
        System.out.println("Your payment approach in order to give min no of notes will be");
        for(int i=size-1; i>=0; i--){
            if(denominationsArray[i]==0)
                break;

            if(amountLeft/denominationsArray[i]>0){
                
                notesNum = amountLeft/denominationsArray[i];
                System.out.println(denominationsArray[i] + ":" + notesNum);
            } 
            amountLeft = amountLeft%denominationsArray[i];
        }
    

       
        }
}
