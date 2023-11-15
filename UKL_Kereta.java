/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author moklet
 */
import java.util.Scanner;
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tujuan[]={"Jakarta-Bandung","Bandung-Surabaya","Semarang-Bandung"};
        String kereta [][]={
            {"Kai","KRL"},//Jakarta bandung
            {"Malabar","Ciremai"},
            {"Sancaka","Gumarang"}
        };
        int KAIKRL[][]={
            {400000,300000,200000},
            {350000,250000,150000}
        };
        int malabar[][]={
            {470000,350000,254000},
            {540000,390000,312000},
        };
        int sancaka[][]={
            {640000,340000,232000},
            {750000,220000,123000},
        };
        
        
        
        String kelas []={"Eksekutif","Bisnis","Ekonomi"};
        System.out.print("Masukkan jumlah Penumpang = ");
        int penumpang = sc.nextInt();
        for (int i = 0; i < tujuan.length; i++) {
            System.out.println((i+1)+". "+tujuan[i]);
        }
        System.out.print("Pilih = ");       
        int jurusan = sc.nextInt();
        
        if (jurusan <= 3){      
            System.out.println("Jenis Kereta");
            for (int i = 0; i < 2; i++) {
                System.out.println((i+1)+". "+kereta[jurusan-1][i]);
            }
            System.out.print("Pilih = ");
            int pilihkereta=sc.nextInt();
            
            if (pilihkereta < 3){
                for (int i = 0; i < kelas.length; i++) {
                    System.out.println((i+1)+". "+kelas[i]);
                }
                
                System.out.print("Pilih = " );
                int pilihkelas = sc.nextInt();
                
                if (pilihkelas <= 3){
                    if (jurusan == 1){        
                        total(penumpang,KAIKRL[pilihkereta-1][pilihkelas-1]*penumpang,KAIKRL[pilihkereta-1][pilihkelas-1]);
                    }else if (jurusan == 2){
                        total(penumpang,malabar[pilihkereta-1][pilihkelas-1]*penumpang,malabar[pilihkereta-1][pilihkelas-1]);
                    }else if (jurusan == 3){
                        total(penumpang,sancaka[pilihkereta-1][pilihkelas-1]*penumpang,sancaka[pilihkereta-1][pilihkelas-1]);
                    }                
                }else{
                    System.out.println("Kelas tidak ditemuka");
                }

            }else{
                System.out.println("Kereta tidak ditemukan");
            }
        }else{
            System.out.println("Jurusan Tidak ditemukan");
        }
        
        
        
        
    }static void total(int penumpang,int total,int tiket){
            System.out.println("===========================");
            System.out.println("           TOTAL           ");
            System.out.println("===========================");
            System.out.println("Tiket satuan`       = " + tiket);
            System.out.println("Penumpang           = " + penumpang);
            System.out.println("Total               = " + total);
    
    }
    
}
