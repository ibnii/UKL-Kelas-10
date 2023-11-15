package Laundry;

import java.util.ArrayList;
import java.util.Scanner;

//Inheritance terjadi " Extends "
public class Transaksi extends inheritance{


    ArrayList<Integer> idClient = new ArrayList<Integer>();
    ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    ArrayList<Integer> banyak = new ArrayList<Integer>();

    client client;
    petugas petugas;
    jenisLaundry jenisLaundry;

    String nameCheck,namaInput,alamatInput,teleponInput;
    int idCStart = 2,indexC, addSaldo,pilihLaundry,laundrySaldo,clientSaldo,topUp;
    double beratLaundry;
    boolean whileSaldo = true;

    Transaksi(client client,petugas petugas,jenisLaundry jenisLaundry){
        this.client = client;
        this.petugas = petugas;
        this.jenisLaundry = jenisLaundry;

        this.idClient.add(1);
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan masukkan nama!");
        System.out.print("Nama\t= ");
        nameCheck = sc.next();

        if(this.client.getNamaC().contains(nameCheck)){
            indexC = this.client.getNamaC().indexOf(nameCheck);
            this.client.printC(indexC);
        }else {
            super.identitas();
            System.out.print("Alamat\t= ");
            alamatInput = sc.next();
            System.out.print("Telepon\t= ");
            teleponInput = sc.next();
            System.out.println("======================================");

            //Memasukkan Inputan ke Class Client
            this.client.setNamaC(nameCheck);
            this.client.setAlamatC(alamatInput);
            this.client.setTeleponC(teleponInput);
            this.idClient.add(idCStart);
            ++idCStart;

            System.out.println("Saldo anda 0 Rupiah, silahkan top up terlebih dahulu");
            System.out.println("Masukkan nominal Top Up !");
            System.out.print("==>");
            addSaldo = sc.nextInt();

            indexC = this.client.getNamaC().indexOf(nameCheck);
            this.client.setSaldoC(addSaldo);

        }

        super.mansLaundry();
        this.petugas.print();

        System.out.println("Silahkan masukkan berat pakaian yang akan di laundry (kg)");
        System.out.print("==> ");
        beratLaundry = sc.nextDouble();
        super.pilihLaundry();
        this.jenisLaundry.print();
        System.out.print("==>");
        pilihLaundry = sc.nextInt();

        System.out.println("======================================");
        clientSaldo = this.client.getSaldoC(indexC);
        laundrySaldo = this.jenisLaundry.harga.get(pilihLaundry-1);

        laundrySaldo *= this.beratLaundry;

        System.out.println("Tagihan yang perlu dibayar = " + laundrySaldo);
        System.out.println("======================================");

        while (whileSaldo) {
            if (this.client.getSaldoC(indexC) >= laundrySaldo) {
                whileSaldo = false;
                clientSaldo = this.client.getSaldoC(indexC);
                clientSaldo -= laundrySaldo;
                this.client.setSaldo(indexC, clientSaldo);
                System.out.println("Saldo anda tersisa\t= " + this.client.getSaldoC(indexC));
            } else {
                System.out.println("Saldo anda tidak mencukupi, ");
                System.out.println("silahkan Top Up terlebih dahulu");
                System.out.println("======================================");
                System.out.println("Masukkan nominal Top Up !");
                System.out.print("==>");
                addSaldo = sc.nextInt();

                this.topUp = this.client.getSaldoC(indexC) + this.addSaldo;
                this.client.setSaldo(indexC, topUp);

                System.out.println("Saldo\t= " + this.client.getSaldoC(indexC));
                System.out.println("======================================");
            }
        }


    }


}
