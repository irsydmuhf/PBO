/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author DELL
 */
public class Father extends Keluarga {
    public Father(String nama, char jenisKelamin, int usia) {
        super(nama, String.valueOf(jenisKelamin), usia);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: Laki-Laki");
        System.out.println("Usia: " + usia);
        System.out.println("Jabatan: Ayah");
    }
}