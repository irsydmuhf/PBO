package main;

/**
 *
 * @author DELL
 */
public class Grandparent extends Keluarga {
    public Grandparent(String nama, String jenisKelamin, int usia) {
        super(nama, jenisKelamin, usia);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
        System.out.println("Jabatan: Grandparent");
    }
}