package com.bangunDatar;


public class Lingkaran {
    public double r, K, L;
    public final double phi = 3.14;

    public Lingkaran(double r){
        this.r = r;
    }

    public void LuasLingkaran(){
        L = phi * r * r;
        System.out.printf("luas = %.2f%n", L);
    }

    public void KelilingLingkaran(){
        K = phi*r*2;
        System.out.printf("keliling = %.2f%n", K);
    }
}


