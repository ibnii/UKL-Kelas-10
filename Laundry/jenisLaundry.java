package Laundry;

import java.util.ArrayList;

public class jenisLaundry {
    ArrayList<String> jenisLaundry = new ArrayList<>();
    ArrayList<Integer> harga = new ArrayList<Integer>();
    ArrayList<Integer> durasi = new ArrayList<Integer>();

    jenisLaundry(){
        this.jenisLaundry.add("Express");
        this.harga.add(10000);
        this.durasi.add(3); // 3 Jam

        this.jenisLaundry.add("Normal");
        this.harga.add(5000);
        this.durasi.add(24); // 24 Jam / 1 hari
    }

    void print(){
        System.out.println("   Jenis \t\tHarga  \t\t Durasi");
        for (int i = 0; i < jenisLaundry.size(); i++) {
            System.out.println((i+1) + ". " + this.jenisLaundry.get(i) + "\t\t" + this.harga.get(i)+ "\t\t" + this.durasi.get(i) + " (Jam)");
        }
    }

}
