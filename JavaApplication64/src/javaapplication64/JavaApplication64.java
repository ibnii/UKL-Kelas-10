/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication64;

/**
 *
 * @author moklet
 */
import java.util.*;
public class JavaApplication64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String kota[]={"","Surabaya","Malang"};
        String hotel[]={"","Bess Mansion","Royal Tulip","Aston"};
        String hotelmalang[]={"","Majapahit","OYO"};
        String kelas[]={"","Superior","Deluxe"};
        int hargahotel[]={ 1056000/*Bess Mansionn*/,2000000/*Royal Tulip*/,3000000/*Aston*/};
        int hargahotelmalang[]={500000/*Majapahit*/,700000/*OYO*/};
        
        System.out.print("Masukkan Nama             =");
        String nama = sc.nextLine();
        System.out.print("Masukkan Jumlah penginap  =");
        int penginap = sc.nextInt();
        System.out.println("==============================");
        System.out.println("Pilih Daerah Hotel");
        System.out.println("==============================");
        for (int i = 1; i < kota.length; i++) {
            System.out.println(i+". "+kota[i]);
        }
        System.out.print("pilih=");
        int pilihdaerah = sc.nextInt();
        if (pilihdaerah < 4){
                System.out.println("========Pilih Hotel========");
            if (pilihdaerah == 1){
                for (int i = 1; i < hotel.length; i++) {
                    System.out.println(i+". "+hotel[i]);
                }
            }else if (pilihdaerah == 2){
                    for (int i = 1; i < hotelmalang.length; i++) {
                    System.out.println(i+". "+hotelmalang[i]);
                }
            }
                System.out.print("pilih = ");
                int pilihhotel = sc.nextInt();
                if (pilihhotel < 4 ){
                        System.out.println("========Pilih Kelas========");
                        for (int i = 1; i < kelas.length; i++) {
                        System.out.println(i+". "+kelas[i]);
                        }
                        System.out.print("Pilih =");
                        int pilihkelas = sc.nextInt();         
                        if (pilihdaerah == 1){
                            switch (pilihkelas){
                                case 1 :
                                    pembayaranakhir(nama,kota[pilihdaerah],hotel[pilihhotel],(hargahotel[pilihhotel-1]*penginap),penginap);
                                    break;
                                case 2 :
                                    pembayaranakhir(nama,kota[pilihdaerah],hotel[pilihhotel],((hargahotel[pilihhotel-1]*penginap)-200000),penginap);
                                    break;
                            }
                        }else if (pilihdaerah == 2){
                            switch (pilihkelas){
                            case 1 :
                                pembayaranakhir(nama,kota[pilihdaerah],hotelmalang[pilihhotel],(hargahotelmalang[pilihhotel-1]*penginap),penginap);
                                break;
                            case 2 :
                                pembayaranakhir(nama,kota[pilihdaerah],hotelmalang[pilihhotel],((hargahotelmalang[pilihhotel-1]*penginap)-200000),penginap);
                                break;
                            }
                        }
                }
        }
    }static void pembayaranakhir(String nama,String kota,String hotel,int harga,int penginap){
            System.out.println("====================================");
            System.out.println("               Total                ");
            System.out.println("====================================");
            System.out.println("Saudara         : "+nama);
            System.out.println("Penginap        : "+penginap);
            System.out.println("Kota Hotel      : "+kota);
            System.out.println("Nama Hotel      : "+hotel);
            System.out.println("harus membayar  : Rp. "+harga);
    }
    
}
