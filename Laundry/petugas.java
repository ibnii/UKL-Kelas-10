package Laundry;

import java.util.ArrayList;
import java.util.Random;

public class petugas implements laundry{

    ArrayList<String> namaP = new ArrayList <String> ();
    ArrayList<String> alamatP = new ArrayList<String>();
    ArrayList<String> teleponP = new ArrayList<String>();
    ArrayList<String> jabatanP = new ArrayList<String>();

    petugas(){
        this.namaP.add("Jayrose");
        this.alamatP.add("Los Angeles");
        this.teleponP.add("085259145807");
        this.jabatanP.add("Karyawan");

        this.namaP.add("Michael");
        this.alamatP.add("Amsterdam");
        this.teleponP.add("082719312989");
        this.jabatanP.add("Karyawan");

        this.namaP.add("Jack");
        this.alamatP.add("England");
        this.teleponP.add("087127981298");
        this.jabatanP.add("Karyawan");
    }

    //Polimorfisme Override
    @Override
    public String getNama(int i){
        return namaP.get(i);
    }
    @Override
    public String getAlamat(int i){
        return alamatP.get(i);
    }
    @Override
    public String getTelp(int i){
        return teleponP.get(i);
    }

    void print(){
        Random random = new Random();
        int randomP = random.nextInt(namaP.size());

        System.out.println("======================================");
        System.out.println("    Petugas yang melayani anda");
        System.out.println("======================================");
        System.out.println("Nama\t\t\t= " + namaP.get(randomP));
        System.out.println("Alamat\t\t\t= " + alamatP.get(randomP));
        System.out.println("Telepon\t\t\t= " + teleponP.get(randomP));
        System.out.println("Jabatan\t\t\t= " + jabatanP.get(randomP));
        System.out.println("======================================");
        System.out.println("   Hubungi jika menemukan kendala");
        System.out.println("======================================");
    }

}
