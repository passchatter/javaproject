package com.Berhitung;
import java.util.Scanner;

public class Saham {
    public double hargaBeli, hargaSekarang, hasil;

    public Saham(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan harga beli : ");
        hargaBeli = input.nextDouble();

        System.out.println("masukkan harga Sekarang");
        hargaSekarang = input.nextDouble();

        input.close();
    }

    public void Persentase(){
        hasil = (hargaSekarang - hargaBeli) / hargaBeli * 100;
        System.out.printf("persentase = %.2f%% %n ", hasil);
    }
}
