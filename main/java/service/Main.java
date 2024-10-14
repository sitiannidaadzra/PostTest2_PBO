/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.LaboratoriumKomputer;
import model.RuangKelas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RuangKelasService ruangKelasService = new RuangKelasService();

        // Tambahkan data default
        ruangKelasService.tambahRuang(new LaboratoriumKomputer("D208", 25));
        ruangKelasService.tambahRuang(new LaboratoriumKomputer("D209", 25));

        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;

            do {
                // Tampilkan Menu CRUD dengan kotak ASCII
                System.out.println("===============================================");
                System.out.println("|     Selamat Datang di Sistem CRUD Ruangan  |");
                System.out.println("===============================================");
                System.out.println("| 1. Tambah Ruang                            |");
                System.out.println("| 2. Tampilkan Semua Ruang                   |");
                System.out.println("| 3. Update Kapasitas Ruang                  |");
                System.out.println("| 4. Hapus Ruang                             |");
                System.out.println("| 5. Keluar                                  |");
                System.out.println("===============================================");
                System.out.print("Pilih opsi: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // membersihkan buffer scanner

                switch (pilihan) {
                    case 1 -> tambahRuangMenu(ruangKelasService, scanner); // Submenu untuk tambah ruang
                    case 2 -> {
                        System.out.println("===============================================");
                        System.out.println("|           Tampilkan Semua Ruang             |");
                        System.out.println("===============================================");
                        ruangKelasService.tampilkanRuang();
                    }
                    case 3 -> {
                        System.out.println("===============================================");
                        System.out.println("|            Update Kapasitas Ruang           |");
                        System.out.println("===============================================");
                        System.out.print("Masukkan nomor ruang yang akan di-update: ");
                        String nomorRuang = scanner.nextLine();
                        System.out.print("Masukkan kapasitas baru: ");
                        int kapasitasBaru = scanner.nextInt();
                        ruangKelasService.updateRuang(nomorRuang, kapasitasBaru);
                    }
                    case 4 -> {
                        System.out.println("===============================================");
                        System.out.println("|              Hapus Ruang                    |");
                        System.out.println("===============================================");
                        System.out.print("Masukkan nomor ruang yang akan dihapus: ");
                        String nomorUntukDihapus = scanner.nextLine();
                        ruangKelasService.hapusRuang(nomorUntukDihapus);
                    }
                    case 5 -> {
                        System.out.println("===============================================");
                        System.out.println("|            Keluar dari Program              |");
                        System.out.println("===============================================");
                        System.out.println("Terima kasih, sampai jumpa!");
                    }
                    default -> {
                        System.out.println("===============================================");
                        System.out.println("|               Pilihan Tidak Valid           |");
                        System.out.println("===============================================");
                    }
                }
            } while (pilihan != 5);
        }
    }

    // Method untuk menampilkan submenu tambah ruang
    public static void tambahRuangMenu(RuangKelasService ruangKelasService, Scanner scanner) {
        System.out.println("===============================================");
        System.out.println("|              Tambah Ruang Baru              |");
        System.out.println("===============================================");
        System.out.println("| 1. Tambah Ruang Kelas                       |");
        System.out.println("| 2. Tambah Laboratorium Komputer             |");
        System.out.println("===============================================");
        System.out.print("Pilih opsi: ");
        int pilihanTambahRuang = scanner.nextInt();
        scanner.nextLine(); // Bersihkan buffer

        switch (pilihanTambahRuang) {
            case 1 -> {
                System.out.println("===============================================");
                System.out.println("|           Tambah Ruang Kelas                |");
                System.out.println("===============================================");
                System.out.print("Masukkan nomor ruang kelas: ");
                String nomorRuang = scanner.nextLine();
                System.out.print("Masukkan kapasitas: ");
                int kapasitas = scanner.nextInt();
                boolean berhasil = ruangKelasService.tambahRuang(new RuangKelas(nomorRuang, kapasitas));
                if (!berhasil) {
                    System.out.println("Ruang Kelas dengan nomor tersebut sudah ada.");
                } else {
                    System.out.println("Ruang Kelas berhasil ditambahkan.");
                }
            }
            case 2 -> {
                System.out.println("===============================================");
                System.out.println("|      Tambah Laboratorium Komputer           |");
                System.out.println("===============================================");
                System.out.print("Masukkan nomor laboratorium: ");
                String nomorLab = scanner.nextLine();
                System.out.print("Masukkan kapasitas: ");
                int kapasitas = scanner.nextInt();
                boolean berhasil = ruangKelasService.tambahRuang(new LaboratoriumKomputer(nomorLab, kapasitas));
                if (!berhasil) {
                    System.out.println("Laboratorium Komputer dengan nomor tersebut sudah ada.");
                } else {
                    System.out.println("Laboratorium Komputer berhasil ditambahkan.");
                }
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }
}
