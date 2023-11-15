package Laundry;

import java.util.ArrayList;

public class client implements laundry{

    //Variabel lokal private
    private ArrayList<String> namaC = new ArrayList <String> ();
    private ArrayList<String> alamatC = new ArrayList<String>();
    private ArrayList<String> teleponC = new ArrayList<String>();
    ArrayList<Integer> saldoC = new ArrayList<Integer>();

    client(){
        this.namaC.add("numan");
        this.alamatC.add("Lumajang");
        this.teleponC.add("085257321080");
        this.saldoC.add(50000);
    }
    void printC(int index){
        System.out.println("======================================");
        System.out.println("Nama\t\t\t= " + namaC.get(index));
        System.out.println("Alamat\t\t\t= " + alamatC.get(index));
        System.out.println("Telepon\t\t\t= " + teleponC.get(index));
        System.out.println("Saldo\t\t\t= " + saldoC.get(index));
        System.out.println("======================================");
    }

    public ArrayList<String> getNamaC(){
        return this.namaC;
    }
    @Override
    public String getNama(int i){
        return namaC.get(i);
    }
    @Override
    public String getAlamat(int i){
        return alamatC.get(i);
    }
    @Override
    public String getTelp(int i){
        return teleponC.get(i);
    }
    //Enkapsulasi getter

    public int getSaldoC(int i) {
        return saldoC.get(i);
    }
    //Enkapsulasi setter

    public void setNamaC(String nama){
        this.namaC.add(nama);
    }
    public void setAlamatC(String alamat){
        this.alamatC.add(alamat);
    }
    public void setTeleponC(String telepon){
        this.teleponC.add(telepon);
    }
    //Polimorfisme Overload

    public void setSaldoC(int saldoC) {
        this.saldoC.add(saldoC);
    }
    public void setSaldo(int index,int saldo){
        this.saldoC.set(index,saldo);
    }
}
