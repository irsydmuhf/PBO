/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author DELL
 */
public abstract class Keluarga {
    protected String nama;
    protected String jenisKelamin;
    protected int usia;

    public Keluarga(String nama, String jenisKelamin, int usia) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public abstract void tampilkanInfo();
}