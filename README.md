# Sistem Manajemen Peminjaman Ruang Kelas
Nama : Siti Annida Adzra

NIM : 2309116013

# Penjelasan Program
Pengelolaan ruang kelas dan laboratorium secara manual seringkali kurang efisien dan rawan kesalahan. Untuk mengatasi masalah ini, dibuatlah sebuah aplikasi manajemen ruang yang mampu memudahkan pencatatan, pembaruan, dan penghapusan data ruang kelas serta laboratorium komputer. Sistem ini memanfaatkan konsep pemrograman berorientasi objek (OOP) seperti inheritance, encapsulation, dan abstraction, serta mendukung operasi CRUD (Create, Read, Update, Delete).

Aplikasi ini memungkinkan pengguna untuk menambah, memperbarui, menampilkan, dan menghapus data ruang, serta memastikan bahwa setiap ruangan dikelola secara efisien. Penggunaan interface untuk abstraksi CRUD dan final keyword menjaga integritas data dan struktur program. Dengan sistem ini, manajemen ruang di institusi pendidikan atau organisasi dapat dilakukan secara lebih terstruktur dan akurat, serta menjadi dasar untuk pengembangan lebih lanjut.

# Deskripsi Program
## Menu Utama
![Screenshot 2024-10-14 203509](https://github.com/user-attachments/assets/0d746b74-d78a-42b6-bbe4-6f09c54246f5)

Menu diatas adalah menu utama dari sistem CRUD yang memungkinkan pengguna untuk mengelola data ruang. Setiap opsi dalam menu ini memberikan fungsionalitas tertentu yang berhubungan dengan pengelolaan ruang. Berikut adalah penjelasan setiap opsi yang tertera:
1. Tambah Ruang: Menambahkan ruang baru (kelas atau laboratorium komputer) dengan nomor dan kapasitas yang dimasukkan oleh pengguna. Jika ruang sudah ada, akan muncul pesan bahwa ruang tersebut sudah terdaftar.
2. Tampilkan Semua Ruang: Menampilkan daftar seluruh ruang yang telah terdaftar, lengkap dengan nomor dan kapasitasnya.
3. Update Kapasitas Ruang: Mengubah kapasitas ruangan berdasarkan nomor ruang yang dipilih. Jika nomor ruang tidak ditemukan, akan muncul pesan bahwa ruangan tidak ada.
4. Hapus Ruang: Menghapus ruangan dari sistem berdasarkan nomor ruang yang dimasukkan. Jika nomor tidak ditemukan, akan ada pesan kesalahan.
5. Keluar: Mengakhiri program dan keluar dari sistem.

# 1. Menambah Ruang Kelas (Create)
![Screenshot 2024-10-14 203533](https://github.com/user-attachments/assets/2a161c63-4d89-404d-b39b-91a655b59add)
![Screenshot 2024-10-14 203554](https://github.com/user-attachments/assets/1ba09378-8746-438f-95d1-b21e8dddfada)

Jika pengguna memilih opsi 1. Tambah Ruang, program akan menampilkan submenu untuk memilih jenis ruangan yang ingin ditambahkan, yaitu ruang kelas atau laboratorium komputer. Setelah pengguna memilih salah satu, mereka diminta untuk memasukkan nomor ruang dan kapasitasnya. Jika nomor ruang yang dimasukkan belum ada di sistem, program akan menambahkan ruang baru tersebut dan menampilkan pesan bahwa ruangan berhasil ditambahkan. Namun, jika nomor ruang yang dimasukkan sudah terdaftar, program akan menampilkan pesan bahwa ruang dengan nomor tersebut sudah ada, dan ruang baru tidak akan ditambahkan.

# 2. Menampilkan Ruang Kelas (Read)
![Screenshot 2024-10-14 203613](https://github.com/user-attachments/assets/80cbf51a-40a9-448f-8d2b-555a5777de7e)

Selanjutnya, jika pengguna memilih opsi 2. Tampilkan Semua Ruang, program akan menampilkan daftar seluruh ruang yang sudah terdaftar di sistem. Setiap ruang akan ditampilkan dengan format sederhana, seperti "Ruang Kelas C302 kapasitas 30 orang" atau "Laboratorium Komputer D208 kapasitas 25 orang". Jika ada banyak ruang, semua ruangan akan dicetak secara berurutan. Jika tidak ada ruangan yang terdaftar, program akan memberikan pesan bahwa tidak ada ruang yang tersedia.

# 3. Memperbarui Ruang Kelas (Update)
![Screenshot 2024-10-14 203628](https://github.com/user-attachments/assets/b634daf0-7ec0-4971-a6af-d57724b8dcbe)

Jika pengguna memilih opsi 3. Update Kapasitas Ruang, program akan meminta pengguna memasukkan nomor ruang yang kapasitasnya ingin diperbarui. Setelah itu, pengguna diminta untuk memasukkan kapasitas baru. Jika nomor ruang yang dimasukkan valid dan ditemukan dalam sistem, program akan memperbarui kapasitas ruang tersebut dan memberikan pesan bahwa kapasitas telah diperbarui. Namun, jika nomor ruang yang dimasukkan tidak ditemukan di sistem, program akan menampilkan pesan bahwa ruang dengan nomor tersebut tidak ditemukan.

# 4. Menghapus Ruang Kelas (Delete)
![Screenshot 2024-10-14 203655](https://github.com/user-attachments/assets/dc2c4b75-7deb-4d61-9d2b-304a6446a20b)

Pada opsi 4. Hapus Ruang, pengguna dapat menghapus ruangan dari sistem dengan memasukkan nomor ruang yang ingin dihapus. Jika ruangan tersebut ditemukan, program akan menghapusnya dan menampilkan pesan bahwa ruang berhasil dihapus. Jika nomor ruang yang dimasukkan tidak ditemukan, program akan memberikan pesan bahwa ruang tersebut tidak ada.

# 5. Keluar
![Screenshot 2024-10-14 203710](https://github.com/user-attachments/assets/bf80a3aa-727b-44bc-9dca-9b41cfaf6d62)

Terakhir, jika pengguna memilih opsi 5. Keluar, program akan menampilkan pesan perpisahan dan kemudian menghentikan eksekusi program.

### Secara keseluruhan, program ini memungkinkan pengguna untuk menambah, memperbarui, menghapus, dan menampilkan daftar ruangan yang dikelola, dengan pesan yang jelas dan mudah dipahami untuk setiap langkah, baik saat operasi berhasil maupun gagal. Program juga memiliki pengecekan untuk menghindari duplikasi nomor ruang dan memastikan integritas data ruangan yang ada.
