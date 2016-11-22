package com.reza.app12141378;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Tebakangka {
    public static void main(String[] args) {
        ArrayList <String> namauser = new ArrayList<>(); // Membuat array Nama user
        ArrayList <Integer> skor = new ArrayList<>(); // Membuat array Sekor user
        Scanner input1 = new Scanner(System.in); // Input pertama 
        Scanner input2= new Scanner(System.in); // Input kedua
        Random random1=new Random(); // Mengacak angka
        String cariY; // Untuk mencari nilai Y, jika input y, maka otomatis akan keluar
