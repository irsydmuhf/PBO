/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Grandfather grandfather = new Grandfather("Sadirman", 'L', 65);
        Grandmother grandmother = new Grandmother("Suwarni", 'P', 63);
        Father father = new Father("Arbain", 'L', 58);
        Mother mother = new Mother("Widowati", 'P', 47);
        Child child = new Child("Irsyad", 'L', 21);

        grandfather.tampilkanInfo();
        System.out.println();
        grandmother.tampilkanInfo();
        System.out.println();
        father.tampilkanInfo();
        System.out.println();
        mother.tampilkanInfo();
        System.out.println();
        child.tampilkanInfo();
    }
}