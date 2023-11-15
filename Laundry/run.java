package Laundry;

public class run {
    public static void main(String[] args) {
        client client = new client();
        petugas petugas = new petugas();
        jenisLaundry jenisLaundry = new jenisLaundry();
        Transaksi transaksi = new Transaksi(client,petugas,jenisLaundry);
        transaksi.run();






    }
}
