package com.Berhitung;
import java.util.Scanner;
public class Kalkulator {
    public int angkaPertama, angkaKedua, hasil;
    public String operator;
    public Kalkulator(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka pertama : ");
        angkaPertama = input.nextInt();

        System.out.println("masukkan operator : ");
        operator = input.next();

        System.out.println("masukkan angka kedua : ");
        angkaKedua = input.nextInt();

        input.close();
    }

    public void Process(){
        switch(operator){
            case "+":
                hasil = angkaPertama + angkaKedua;
                System.out.printf("%d + %d = %d \n",angkaPertama, angkaKedua, hasil);
                break;
            case "-":
                hasil = angkaPertama - angkaKedua;
                System.out.printf("%d - %d = %d \n",angkaPertama, angkaKedua, hasil);
                break;
            case "x":
                hasil = angkaPertama * angkaKedua;
                System.out.printf("%d x %d = %d \n");
                break;
            case ":":
                if(angkaKedua == 0){
                    System.out.printf("angka pembagian tidak boleh nol");
                }else{
                    hasil = angkaPertama / angkaKedua;
                    System.out.printf("%d : %d = %d \n", angkaPertama, angkaKedua, hasil);
                }
                break;
            default:
                hasil = 0;
        }
    }
}
