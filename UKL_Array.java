/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author moklet
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[][] ={
            {12,19,17},
            {23,21,15},
            {18,22,27}
        }; 
        int b[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; 
        System.out.println("Pengurangan");
        System.out.println("A");
        printArray(a,a);
        System.out.println("\nB");
        printArray(b,b);
        
        int c[][]=new int[3][3];
        
        int abc = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                abc = a[i][j]-=b[i][j];
                c[i][j] = abc;
            }
        }
        System.out.println("\nA-B");
        printArray(c,c);
        
        System.out.print("\nPerkalian");

        int d[][]={
            {6,3},
            {4,8}
        };
        int e[][]={
            {1},
            {2}
        };
        System.out.println("\nD");
        printArray(d,d);
        System.out.println("\nE");
        for (int i = 0; i < 2; i++) {
            System.out.println("["+e[i][0]+"]");
        }
        int kolomD = d.length;
        int barisD = d.length;
        int kolomE = e.length;
        int barisE = e.length;
        
        int f[][] = new int[kolomD][barisD];
        
        int abcd;
        for (int i = 0; i < barisE; i++) {
            for (int j = 0; j < 1; j++) {
                abcd = 0;
                for (int k = 0; k < 2; k++) {
                    abcd += d[i][k]*e[k][j];
                }
                f[i][j] = abcd;
            }
        }
        
        System.out.println("\nD*E");
        for (int i = 0; i <2; i++) {
            System.out.println("["+f[i][0]+"]");
            
        }
        
        
        
    }static void printArray(int a[][],int b[][]){
        int kolom = a.length;
        int baris = b.length;
        for (int i = 0; i < kolom; i++) {
            System.out.print("[ ");
                for (int j = 0; j < baris; j++) {
                System.out.print(a[i][j]+" ");
                }
            System.out.print("]");
            System.out.println("");
        }
    }
}
