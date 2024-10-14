/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import model.Ruang;

public interface CRUDService {
    void tambahRuang(Ruang ruang);
    void tampilkanRuang();
    void hapusRuang(String nomorRuang);
    void updateRuang(String nomorRuang, int kapasitasBaru);
}
