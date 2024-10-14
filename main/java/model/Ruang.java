/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public abstract class Ruang {
    private String nomorRuang;
    private int kapasitas;

    // Constructor
    public Ruang(String nomorRuang, int kapasitas) {
        this.nomorRuang = nomorRuang;
        this.kapasitas = kapasitas;
    }

    // Getter dan Setter (Encapsulation)
    public String getNomorRuang() {
        return nomorRuang;
    }

    public void setNomorRuang(String nomorRuang) {
        this.nomorRuang = nomorRuang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Metode abstrak yang akan diimplementasikan oleh subclass
    public abstract void deskripsi();
}






























