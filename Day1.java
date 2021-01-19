import java.util.Scanner;

public class Day1 {
   public static void main(String[] args) {
    /*
    This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17...10
    */
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of element in the array");
    int num=sc.nextInt();
    int arr[]=new int[num];
    System.out.println("enter the array value");
    for(int i=0;i<num;i++){
        arr[i]=sc.nextInt();    }
        System.out.println("get value from user (k value)");
        int k=sc.nextInt();
        int one=arr[0];
        for(int i=1;i<num-1;i++){
            for(int j=0;j<num;j++){
              int val=one+arr[j];
            if(val==k){
                System.out.println("Array element :"+one+" second element :"+arr[j]);
            }
        }
        one=arr[i+1];

            
        }


   } 
}
