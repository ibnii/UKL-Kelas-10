package Library;

import java.util.ArrayList;

public class petugas implements superClass {
    ArrayList<String> namaKaryawan = new ArrayList<String>();
    ArrayList<String> alamat = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<>();


    petugas() {
        namaKaryawan.add("Haya");
        namaKaryawan.add("Lancelot");
        namaKaryawan.add("Grock");

        alamat.add("Sumatra");
        alamat.add("Manado");
        alamat.add("Batam");

        telepon.add("082392636752");
        telepon.add("085239725972");
        telepon.add("085691516923");
    }

    @Override
    public String getTelepon(int index) {
        return telepon.get(index);
    }
    @Override
    public String getNama(int index) {
        return namaKaryawan.get(index);
    }
    @Override
    public String getAlamat(int index) {
        return alamat.get(index);
    }

    void print(){
        for (int i = 0; i < namaKaryawan.size(); i++) {
            System.out.println((i+1)+". " + namaKaryawan.get(i));
        }
    }
}
