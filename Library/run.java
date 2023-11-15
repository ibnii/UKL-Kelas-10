package Library;


public class run {
    public static void main(String[] args) {
        siswa siswa = new siswa();
        petugas petugas = new petugas();
        buku buku = new buku();
        peminjaman run = new peminjaman(siswa,petugas,buku);




        run.pinjam();





    }



}
