package com.binusprogram.bilanganprima;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka bulat: ");
        int angka = input.nextInt();

        BilanganBulat bilanganBulat = new BilanganBulat();
        if (bilanganBulat.bilanganPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima karena bisa dibagi dengan " + bilanganBulat.pembagi(angka) + ".");
        }
    }
}

class BilanganBulat {
    public boolean bilanganPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i < angka; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int pembagi(int angka) {
        for (int i = 2; i < angka; i++) {
            if (angka % i == 0) {
                return i;
            }
        }
        return -1;
    }
}