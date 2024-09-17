package com.bangunDatar;

public class SegiTiga {
    public double alas, tinggi, L, K;

    public SegiTiga(int alas, int tinggi){
       this.alas = alas;
       this.tinggi = tinggi;
    }

    public void LuasSegitiga(){
        L = 0.5 * alas * tinggi;
        System.out.printf("luas segitiga = %.2f%n", L);
    }



}
