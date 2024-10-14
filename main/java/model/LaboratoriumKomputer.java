/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class LaboratoriumKomputer extends Ruang {
    // Constructor
    public LaboratoriumKomputer(String nomorRuang, int kapasitas) {
        super(nomorRuang, kapasitas);
    }

    @Override
    public void deskripsi() {
        System.out.println("Laboratorium Komputer " + getNomorRuang() + " kapasitas " + getKapasitas() + " orang.");
    }
}
