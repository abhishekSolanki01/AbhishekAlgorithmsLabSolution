package transaction;

import java.util.Scanner;

public class Transaction {
public static void main(String[] args) {
    //1> ask for no. of txns    
    System.out.println("Enter the size of transaction array");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    //2> create array
    int [] array = new int[n];

    //3> take values in array
    System.out.println("Enter the values of array");
    for(int i=0; i<n; i++){
        array[i] = scn.nextInt();
    }

    //4> total number of targets to be achived
    System.out.println("Enter the total no of targets that needs to be achieved");
    int targetsNumber = scn.nextInt();

    //enter value of targets
    for(int i=0; i<targetsNumber; i++){
        System.out.println("Enter the value of target");
        int target = scn.nextInt();
        int sum = 0;
        for(int j=0; j<n ; j++){
            sum += array[j];
            if(sum >= target){
                System.out.println("Target achieved after " + (j+1) + " transactions");
                break;
            }else if(j == n-1){
                    System.out.println("Given target is not achieved. ");
                    break;
            }
            
        }
        

    }

}
}
