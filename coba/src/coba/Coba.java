
package coba;
import java.util.*;
public class Coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Batu Gunting Kertas Game");
        System.out.println("1. batu");
        System.out.println("2. Gunting");
        System.out.println("3. Kertas");
        System.out.println("=============================");
        System.out.print("input Player = ");
        int player = sc.nextInt();
        if (player <= 3 && player > 0){
            int a = (int) (Math.random()*3)+1;
            System.out.println("Computer     = " + a);
            System.out.println("=============================");
            if (player == 1 && a == 2){
                System.out.println("You Win");
            }
            else if (player == 2 && a == 3){
                System.out.println("You Win");
            }
            else if (player == 3 && a == 1){
                System.out.println("You Win");
            }
            else if (player == 2 && a == 1){
                System.out.println("You Lose");
            }
            else if (player == 3 && a == 2){
                System.out.println("You Lose");
            }
            else if (player == 1 && a == 3){
                System.out.println("You Lose");
            }
            else if (player == 1 && a == 1){
                System.out.println("Draw");
            }
            else if (player == 2 && a == 2){
                System.out.println("Draw");
            }
            else if (player == 3 && a == 3){
                System.out.println("Draw");
            }
        }
        else if (player > 3){
            System.out.println("Masukkan angka yang ada di list");
        }
        else{
            System.out.println("Masukkan angka yang ada di list");
        }
        //1.batu
        //2.gunting
        //3.kertas
     
        
    }
    
}
