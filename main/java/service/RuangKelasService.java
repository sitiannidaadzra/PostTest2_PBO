/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Ruang;
import model.RuangKelas;
import model.LaboratoriumKomputer;
import java.util.ArrayList;

public class RuangKelasService {
    private final ArrayList<Ruang> daftarRuang = new ArrayList<>();

    // Constructor untuk menambahkan data default
    public RuangKelasService() {
        // Tambahkan Ruang Kelas default
        daftarRuang.add(new RuangKelas("C302", 30));
        daftarRuang.add(new RuangKelas("C303", 30));
        daftarRuang.add(new RuangKelas("C304", 30));
        daftarRuang.add(new RuangKelas("C305", 30));
        daftarRuang.add(new RuangKelas("C402", 40));
        daftarRuang.add(new RuangKelas("C403", 40));
        daftarRuang.add(new RuangKelas("C404", 40));
        daftarRuang.add(new RuangKelas("C405", 40));

        // Tambahkan Laboratorium Komputer default
        daftarRuang.add(new LaboratoriumKomputer("D208", 25));
        daftarRuang.add(new LaboratoriumKomputer("D209", 25));
    }

    public boolean tambahRuang(Ruang ruang) {
        // Cek apakah nomor ruang sudah ada
        for (Ruang r : daftarRuang) {
            if (r.getNomorRuang().equalsIgnoreCase(ruang.getNomorRuang())) {
                return false; // Ruang sudah ada
            }
        }
        daftarRuang.add(ruang);
        return true; // Ruang berhasil ditambahkan
    }

    public void tampilkanRuang() {
        if (daftarRuang.isEmpty()) {
            System.out.println("Tidak ada ruang yang tersedia.");
        } else {
            for (Ruang ruang : daftarRuang) {
                ruang.deskripsi(); // Memanggil deskripsi ruang
            }
        }
    }

    public void updateRuang(String nomorRuang, int kapasitasBaru) {
        for (Ruang ruang : daftarRuang) {
            if (ruang.getNomorRuang().equalsIgnoreCase(nomorRuang)) {
                ruang.setKapasitas(kapasitasBaru);
                System.out.println("Kapasitas ruang " + nomorRuang + " telah diperbarui menjadi " + kapasitasBaru + " orang.");
                return;
            }
        }
        System.out.println("Ruang dengan nomor " + nomorRuang + " tidak ditemukan.");
    }

    public void hapusRuang(String nomorRuang) {
        for (Ruang ruang : daftarRuang) {
            if (ruang.getNomorRuang().equalsIgnoreCase(nomorRuang)) {
                daftarRuang.remove(ruang);
                System.out.println("Ruang " + nomorRuang + " telah dihapus.");
                return;
            }
        }
        System.out.println("Ruang dengan nomor " + nomorRuang + " tidak ditemukan.");
    }
}
