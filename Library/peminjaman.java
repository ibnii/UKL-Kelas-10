package Library;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class peminjaman extends complement{
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    private ArrayList<UUID> idSiswaa = new ArrayList<UUID>();
    private ArrayList<UUID> idBukuu = new ArrayList<UUID>();

    private siswa siswa;
    private petugas petugas;
    private buku buku;

    private String nama,Yornpinjam,YornUlang,YornKendala,namaBuku,namaPetugas,alamatPetugas,noPetugas,namaSiswa,alamatSiswa,noSiswa,YornAddAdmin, YornBackHomePage;
    private int indexOfSiswa,pilihanBuku,bukuPinjam,kendalaPetugas,stokBuku,hargaBuku,idBukuStart = 3,pilihaanAdmin;

    peminjaman(siswa siswa,petugas petugas,buku buku){
        this.siswa = siswa;
        this.petugas = petugas;
        this.buku = buku;

        idBuku.add(1);
        idBuku.add(2);
        idBuku.add(3);

        idSiswa.add(1);
        idSiswa.add(2);
        idSiswa.add(3);

        for (int i = 0; i < 3; i++) {
            UUID id = UUID.randomUUID();
            idSiswaa.add(id);
        }

        for (int i = 0; i < 3; i++) {
            UUID id = UUID.randomUUID();
            idBukuu.add(id);
        }
    }

    void pinjam(){
        Scanner sc = new Scanner(System.in);
        UUID idSiswaa = UUID.randomUUID();
        UUID idBukuu = UUID.randomUUID();

        while (true) {
            super.homePage();
            System.out.print("Masukkan nama => ");
            nama = sc.next();

            if (nama.equalsIgnoreCase("Admin")) {

                super.adminOpening();
                System.out.println("Selamat datang Admin, ada yang perlu dibantu ? ");
                while (true) {
                    System.out.println("=====================================");
                    System.out.println("1.Ingin menambah buku \n2.Ingin Menambah petugas\n3.Ingin mendaftarkan siswa (Daftar)");
                    System.out.print("=> ");
                    pilihaanAdmin = sc.nextInt();

                    switch (pilihaanAdmin) {
                        case 1:
                            super.informationBook();
                            System.out.println("Masukkan Nama Buku :");
                            System.out.print("=> ");
                            namaBuku = sc.next();
                            System.out.println("Masukkan stok :");
                            System.out.print("=> ");
                            stokBuku = sc.nextInt();
                            System.out.println("Masukkan harga buku :");
                            System.out.print("=> ");
                            hargaBuku = sc.nextInt();

                            buku.addNamaBuku(namaBuku);
                            buku.addStok(stokBuku);
                            buku.addHarga(hargaBuku);

                            ++idBukuStart;
                            idBuku.add(idBukuStart);

                            //UUID
                            this.idBukuu.add(idBukuu);

                            cetakBuku();
                            break;
                        case 2:
                            super.officerInformation();
                            System.out.println("Masukkan Nama Petugas :");
                            System.out.print("=> ");
                            namaPetugas = sc.next();
                            System.out.println("Masukkan Alamat :");
                            System.out.print("=> ");
                            alamatPetugas = sc.next();
                            System.out.println("Masukkan Telepon :");
                            System.out.print("=> ");
                            noPetugas = sc.next();

                            petugas.namaKaryawan.add(namaPetugas);
                            petugas.alamat.add(alamatPetugas);
                            petugas.telepon.add(noPetugas);

                            cetakPetugas();

                            break;
                        case 3:
                            super.studentInformation();
                            System.out.println("Masukkan Nama Siswa :");
                            System.out.print("=> ");
                            namaSiswa = sc.next();
                            System.out.println("Masukkan Alamat :");
                            System.out.print("=> ");
                            alamatSiswa = sc.next();
                            System.out.println("Masukkan Telepon :");
                            System.out.print("=> ");
                            noSiswa = sc.next();

                            siswa.namaSiswa.add(namaSiswa);
                            siswa.alamat.add(alamatSiswa);
                            siswa.telepon.add(noSiswa);

                            //UUID
                            this.idSiswaa.add(idSiswaa);

                            cetakSiswa();

                            break;
                    }

                    System.out.println("Apakah ingin menambah kembali? (Y/N)");
                    YornAddAdmin = sc.next();
                    if (YornAddAdmin.equalsIgnoreCase("n")) {
                        break;
                    }
                }


            } else if (siswa.namaSiswa.contains(nama)) {
                indexOfSiswa = siswa.namaSiswa.indexOf(nama);

                while (true) {
                    System.out.println("Ingin meminjam atau mengembalikan ? (Y/N)");
                    Yornpinjam = sc.next();

                    if (Yornpinjam.equalsIgnoreCase("y")) {

                        if (siswa.status.get(indexOfSiswa)) {
                            buku.print();
                            System.out.println("Masukkan nomer yang akan di pinjam");
                            System.out.print("=> ");

                            pilihanBuku = sc.nextInt();

                            //Get->disimpan di varibel->dikurangi stok->set
                            bukuPinjam = buku.getStok(pilihanBuku - 1) - 1;
                            buku.setStok(pilihanBuku - 1, bukuPinjam);
                            siswa.status.set(indexOfSiswa, false);

                            cetakPinjam();

                        } else {
                            super.rejectedBook();
                        }


                    } else if (Yornpinjam.equalsIgnoreCase("n")) {
                        if (siswa.status.get(indexOfSiswa)) {
                            super.borrowedBook();
                        } else {
                            super.responsibility();

                            bukuPinjam = buku.getStok(pilihanBuku - 1) + 1;
                            buku.setStok(pilihanBuku - 1, bukuPinjam);
                            siswa.status.set(indexOfSiswa, true);
                        }
                    }
                    System.out.println("Ada kendala? ingin menghubungi petugas ? (Y/N)");
                    YornKendala = sc.next();
                    if (YornKendala.equalsIgnoreCase("Y")) {
                        System.out.println("Silahkan hubungi salah satu petugas :)");
                        petugas.print();
                        System.out.print("=> ");
                        kendalaPetugas = sc.nextInt();

                        System.out.println("=====================================");
                        System.out.println("Nama petugas\t\t\t= " + petugas.getNama(kendalaPetugas - 1));
                        System.out.println("Nomor Telefon\t\t\t= " + petugas.getTelepon(kendalaPetugas - 1));
                    }

                    System.out.println("Apakah ingin mengulanginya kembali? (Y/N)");
                    YornUlang = sc.next();
                    if (YornUlang.equalsIgnoreCase("N")) {
                        super.responsibilityOfLibrary();
                        break;
                    }
                }


            } else {
                super.namedRegistered();
            }

            System.out.println("Apakah ingin kembali ke Home Page? (Y/N)");
            YornBackHomePage = sc.next();
            if (YornBackHomePage.equalsIgnoreCase("N")) {
                break;
            }

        }


    }


    void cetakPinjam(){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String jam = time.format(formatter);

        System.out.println("=====================================");
        System.out.println("          PEMINJAMAN BUKU");
        System.out.println("=====================================");
        System.out.println("Peminjam\t\t\t\t\t= " + siswa.getNama(indexOfSiswa));
        System.out.println("ID siswa\t\t\t\t\t= " + idSiswa.get(indexOfSiswa));
        System.out.println("Buku\t\t\t\t\t\t= " + buku.getNamaBuku(pilihanBuku-1));
//        System.out.println("ID buku\t\t\t\t\t\t= " + idBuku.get(pilihanBuku-1));
        System.out.println("ID buku\t\t\t\t\t\t= "+ idBukuu.get(pilihanBuku-1));
        System.out.println("Tanggal\t\t\t\t\t\t= " + date);
        System.out.println("Jam\t\t\t\t\t\t\t= " + jam);
        System.out.println("Tanggal akhir pengembalian\t= " + date.plusDays(3));
        System.out.println("=====================================");
    }

    void cetakBuku(){
        System.out.println("=====================================");
        System.out.println("           INFORMASI BUKU ");
        System.out.println("=====================================");
        System.out.println("Nama\t\t\t\t\t= " + buku.getNamaBuku(buku.getLastIndex()));
        System.out.println("Stok\t\t\t\t\t= " + buku.getStok(buku.getLastIndex()));
        System.out.println("Harga\t\t\t\t\t= " + buku.getHarga(buku.getLastIndex()));
//        System.out.println("ID\t\t\t\t\t\t= " + idSiswa.get((idSiswa.size()-1)));
        System.out.println("ID\t\t\t\t\t\t= " + idBukuu.get(idBukuu.size()-1));
        System.out.println("=====================================");
    }

    void cetakPetugas(){
        System.out.println("=====================================");
        System.out.println("          INFORMASI PETUGAS ");
        System.out.println("=====================================");
        System.out.println("Nama\t\t\t\t\t= " + petugas.namaKaryawan.get(petugas.namaKaryawan.size()-1));
        System.out.println("alamat\t\t\t\t\t= " + petugas.alamat.get(petugas.alamat.size()-1));
        System.out.println("No Telefon\t\t\t\t= " + petugas.telepon.get(petugas.telepon.size()-1));
        System.out.println("=====================================");
    }

    void cetakSiswa(){
        System.out.println("=====================================");
        System.out.println("          INFORMASI SISWA ");
        System.out.println("=====================================");
        System.out.println("Nama\t\t\t\t\t= " + siswa.namaSiswa.get(siswa.namaSiswa.size()-1));
        System.out.println("alamat\t\t\t\t\t= " + siswa.alamat.get(siswa.alamat.size()-1));
        System.out.println("No Telefon\t\t\t\t= " + siswa.telepon.get(siswa.telepon.size()-1));
        System.out.println("ID\t\t\t\t\t\t= " + idSiswaa.get(idSiswaa.size()-1));
        System.out.println("=====================================");
    }


}
