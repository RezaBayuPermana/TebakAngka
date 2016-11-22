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
        
        do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            cariY=input1.nextLine();
            namauser.add(cariY);
            int Nilai = 0; // Variabel nilai 
            int CekGameOver=0; // Cek Game over. bernilai 1 jika GameOver
            int aKumulasi[]= new int[6]; // Membuat array nilai tiap level permainan
            int NilaiPasJalan=0; // Varibel nilai
            // Mulai Ngegame
            if(!("y").equals(cariY)){  
              // ------------------- START SCRIPT TEBAK DISINI --------------------------  
                String nextLevel; // untuk Menaikkan Level
                int PilihLevel=1;   // Untuk menentukan Level Pertama dan selanjutnya akan dinaikkan nilainya 
                System.out.println("Selamat Datang " + cariY); // Untuk memberikan sambutan kepada Pemain
                do{
