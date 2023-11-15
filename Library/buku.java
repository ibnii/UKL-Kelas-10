package Library;

import java.util.ArrayList;

public class buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    buku(){
        namaBuku.add("Naruto eps 1");
        namaBuku.add("Naruto eps 2");
        namaBuku.add("Naruto eps 3");

        stok.add(3);
        stok.add(4);
        stok.add(2);

        harga.add(40000);
        harga.add(45000);
        harga.add(45000);


    }

    void print(){
        for (int i = 0; i < namaBuku.size(); i++) {
            System.out.println((i+1)+". " + namaBuku.get(i) + "( " + stok.get(i) + " ) ");
        }
    }


    public Integer getStok(int index) {
        return stok.get(index);
    }

    public Integer getHarga(int index) {
        return harga.get(index);
    }

    public String getNamaBuku(int index) {
        return namaBuku.get(index);
    }


    public void setHarga(int index,int rubah) {
        this.harga.set(index,rubah);
    }

    public void setNamaBuku(int index,String rubah) {
        this.namaBuku.set(index,rubah);
    }

    public void setStok(int index,int rubah) {
        this.stok.set(index,rubah);
    }

    public void addNamaBuku(String nama){
        this.namaBuku.add(nama);
    }
    public void addStok(int stok){
        this.stok.add(stok);
    }
    public void addHarga(int harga){
        this.harga.add(harga);
    }
    public int getLastIndex(){
        return (namaBuku.size()-1);
    }

}
