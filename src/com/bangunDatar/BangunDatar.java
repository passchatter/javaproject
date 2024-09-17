package com.bangunDatar;

import java.util.Scanner;

public class BangunDatar {
    public void PilihBangundatar() {
        Scanner input = new Scanner(System.in); // Membuka Scanner hanya sekali

        while (true) {
            // Menampilkan pilihan menu
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("0. Exit");
            System.out.print("Silahkan pilih nomor pilihan Anda: ");

            // Menerima input pengguna
            int pilihan = 0;
            boolean validInput = false;
            
            // Validasi input pengguna
            while (!validInput) {
                try {
                    pilihan = input.nextInt();
                    validInput = true; // Jika input valid, keluar dari loop
                } catch (Exception e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    input.next(); // Bersihkan input yang tidak valid
                }
            }

            // Menggunakan switch untuk menangani berbagai kondisi
            switch (pilihan) {
                case 0:
                    System.out.println("Program selesai.");
                    input.close(); // Tutup Scanner di sini saat program selesai
                    return; // Keluar dari method dan menghentikan program
                case 1:
                    System.out.print("Masukkan jari jari: ");
                    double r = input.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(r);
                    lingkaran.LuasLingkaran();
                    lingkaran.KelilingLingkaran();
                    break;
                case 2:
                    System.out.println("masukkan sisi : ");
                    int sisi = input.nextInt();
                    Persegi persegi = new Persegi(sisi);
                    persegi.LuasPersegi();
                    persegi.KelilingPersegi();
                    break;
                case 3:
                    System.out.print("Masukkan panjang: ");
                    int panjang = input.nextInt();

                    System.out.print("Masukkan lebar: ");
                    int lebar = input.nextInt();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                    persegiPanjang.LuasPersegiPanjang();
                    persegiPanjang.KelilingPersegiPanjang();
                    break;
                case 4:
                    System.out.println("masukkan alas : ");
                    int alas = input.nextInt();
                    System.out.println("masukkan tinggi : ");
                    int tinggi = input.nextInt();
                    SegiTiga segiTiga = new SegiTiga(alas, tinggi);
                    segiTiga.LuasSegitiga();
                    break;
                default:
                    System.out.println("Pilihan tidak sesuai. Silakan coba lagi.");
            }
        }
    }
}
