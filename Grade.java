/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial2;

/**
 *
 * @author User
 */
public class Grade {
    
    
     public static void main(String[] args){
         
         int[]arr = new int[]{87,68,94,100,83,78,85,91,76,87};
         float sum = 0;
         for(int i=0;i<arr.length;i++){
             sum = sum+arr[i];
         }
         float avr = sum/arr.length;
         
         int min = arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
                 min=arr[i];
             }
         }
         int max = arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
         }
         
         System.out.println("Welcome to the grade book for \nCS101 Introduction to Java Programming");
         System.out.println("");
         System.out.println("The grades are: ");
         System.out.println("");
         
         
         for(int i=0;i<arr.length;i++){              
             System.out.println("Student " + (i+1) + ": " + arr[i]);
         }
         System.out.println("");
         
         System.out.printf("Class average is " + "%.2f",avr );
         System.out.println("");
         System.out.println("Lowest grade is " + min);
         System.out.println("Highest grade is " + max);
         
         
     }
}
