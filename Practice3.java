/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,m=0,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert any number");
        int n;
        n=sc.nextInt();
        m=n/2;
        if(n==0||n==1){
         System.out.println(n+" is not prime");   
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                 System.out.println(n+" is not prime");  
                 flag=1;
                 break;
                }
            }
            if(flag==0){
                System.out.println(n+" is  prime");  
            }
        }
        // TODO code application logic here
    }
    
}
