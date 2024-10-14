/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class RuangKelas extends Ruang {
    // Constructor
    public RuangKelas(String nomorRuang, int kapasitas) {
        super(nomorRuang, kapasitas);
    }

    @Override
    public void deskripsi() {
        System.out.println("Ruang Kelas " + getNomorRuang() + " kapasitas " + getKapasitas() + " orang.");
    }
}

