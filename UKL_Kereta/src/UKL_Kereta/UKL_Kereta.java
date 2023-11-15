/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UKL_Kereta;

/**
 *
 * @author moklet
 */
import java.util.*;
public class UKL_Kereta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String [] tujuan = {"Bandung -> Jakarta","Surabya -> Jakarta"};
        String [] kereta = {"Argo parahyangan","Jayabaya"};
        String [] kereta2 = {"KAI","KRL"};
        String [] kelas = {"Ekonomi","Bisnis","Eksekutif"};
        int [][] tiket = {//Argo parahyangan 
            {50000,100000,250000},
            {150000,250000,400000}};
        int [][] tiket2 = {//Jayabaya
            {45000,90000,225000},
            {130000,200000,350000}};
        int [][] tiket3 = {//KAI
            {59000,12000,245000},
            {120000,210000,235000}};
        int [][] tiket4 = {//KRL
            {75000,85000,128000},
            {135000,221000,432000}};
        System.out.println("=====Masukkan jumlah penumpang===== ");
        System.out.print("Penumpang = ");
        int penumpang = sc.nextInt();
        for (int i = 0; i < tujuan.length; i++) {
            System.out.println((i+1)+" . "+tujuan[i]);
        }
        System.out.print("pilih = ");
        int pilihtujuan = sc.nextInt();
        if (pilihtujuan <= 2){
            if (pilihtujuan == 1){
                for (int i = 0; i < kereta.length; i++) {
                    System.out.println((i+1)+" . "+kereta[i]);
                }
            }else if(pilihtujuan == 2){
                for (int i = 0; i < kereta2.length; i++) {
                    System.out.println((i+1)+" . "+kereta2[i]);
                }
            }
            System.out.print("pilih = ");
            int pilihkereta = sc.nextInt();
            if (pilihkereta <= 2){
                for (int i = 0; i < kelas.length; i++) {
                    System.out.println((i+1)+" . "+kelas[i]);
                }
                System.out.print("pilih = ");
                int pilihkelas = sc.nextInt();
                if (pilihkelas <= 3){
                    if (pilihtujuan == 1){
                        if (pilihkereta==1){ 
                            bayar(penumpang,tiket[pilihtujuan-1][pilihkelas-1]*penumpang);
                        }else if(pilihkereta == 2){
                            bayar(penumpang,tiket2[pilihtujuan-1][pilihkelas-1]*penumpang);
                        }
                    }else if (pilihtujuan == 2){
                        if (pilihkereta==1){ 
                            bayar(penumpang,tiket3[pilihtujuan-1][pilihkelas-1]*penumpang);
                        }else if(pilihkereta == 2){
                            bayar(penumpang,tiket4[pilihtujuan-1][pilihkelas-1]*penumpang);
                        }        
                    }                
                }else{
                    System.out.println("Kelas tidak ditemukan");   
                }

            }else{
                System.out.println("Kereta tidak ditemukan");   
            }
        }else{
            System.out.println("Tujuan tidak ditemukan");
        }
    }static void bayar(int penumpang,int total){
            System.out.println("===============================");
            System.out.println("             TOTAL             ");
            System.out.println("===============================");
            System.out.println("Jumlah Penumpang   = "+penumpang);
            System.out.println("Total yang dibayar = "+total);
    }
    
}
