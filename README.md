Tentu! Ini versi yang lebih santai dan tetap informatif:

---

# Usaidbox PDF Viewer

<img width="70%" src="https://github.com/hangga/sample-usaidbox/blob/main/usaidbook.png?raw=true"/>

## Pengantar
`Usaidbox PDF Viewer` adalah library ringan untuk nambahin tampilan _preview_ PDF di aplikasi kamu (dengan Swing GUI). Library ini pake Apache PDFBox buat nge-render PDF, jadi bisa bantu kamu tampilkan dan atur file PDF dengan gampang.

## Fitur

- Tampil PDF langsung di aplikasi Java (Swing GUI)
- Backend rendering pake Apache PDFBox
- Navigasi halaman
- Pilihan skala tampilan
- Fitur Print dan Save

## Persyaratan Sistem
- Java 8 atau lebih baru

## Instalasi

Tambahin dependency berikut di file `build.gradle` kamu:

```Groovy
repositories {
    maven { url 'https://repo.repsy.io/mvn/hangga/repo' }
}

dependencies {
    implementation 'com.box.usaid:usaidbox:1.0.1'
}
```

## Cara Pakai UsaidBox

### 1. Buat Objek `UsaidBox`
Untuk mulai, cukup bikin objek `UsaidBox` baru dan siap-siap pakai metode yang ada sesuai kebutuhan:
```java
UsaidBox usaidBox = new UsaidBox("Viewer PDF");
```

### 2. Muat PDF
Gunakan metode `loadPdf()` untuk nampilin PDF. Bisa pakai path `String` atau objek `File`.
```java
usaidBox.loadPdf("path/to/your/pdf-file.pdf");

// Atau pakai objek File
File pdfFile = ...
usaidBox.loadPdf(pdfFile);
```

### 3. Tampilkan Dialog `UsaidBox`
Setelah file PDF dimuat, panggil `setVisible(true)` buat nampilin dialog `UsaidBox`.
```java
usaidBox.setVisible(true);
```

### 4. Opsi Tambahan

- **Ubah Ukuran Dialog**: Atur ukuran dialog sesukamu.
  ```java
  usaidBox.setCustomSize(1024, 768);
  ```

- **Maksimal Ukuran**: Tampilkan dialog dalam ukuran full screen.
  ```java
  usaidBox.setMaximized();
  ```

- **Nama File Output**: Tentukan nama file saat di-save.
  ```java
  usaidBox.setOutputFileName("custom-output-name.pdf");
  ```

### 5. Tombol & Fitur
`UsaidBox` juga punya kontrol seperti:

- **Scaling**: Pilih tampilan di kotak kombo:
  - `ACTUAL_SIZE`: Ukuran asli.
  - `SHRINK_TO_FIT`: Pas di layar.
  - `STRETCH_TO_FIT`: Membesar di layar.
  - `SCALE_TO_FIT`: Skala sesuai layar.

- **Navigasi Halaman**: Tombol `Next` dan `Previous`.

- **Print**: Tombol buat cetak file PDF.

- **Save As**: Tombol buat unduh PDF.

- **Close**: Tutup dialog.

### 6. Contoh Penggunaan
```java
UsaidBox usaidBox = new UsaidBox("PDF Viewer")
        .loadPdf("path/to/your/pdf-file.pdf")
        .setCustomSize(1024, 768)
        .setOutputFileName("OutputFile.pdf")
        .setVisible(true);
```

## License

This library uses <a href="https://pdfbox.apache.org/">Apache PDFBox</a>, which is licensed under the Apache License, Version 2.0. You are free to use, modify, and distribute this library under the following conditions:

1.	Attribution: You must give appropriate credit to the Apache PDFBox project.
2.	License: This library adheres to the Apache License 2.0, which allows both commercial and non-commercial use. You can read the full license <a href="https://www.apache.org/licenses/LICENSE-2.0">here</a>.

Ensure you include this license in any distribution of your application if you use Usaidbox PDF Viewer.

This README outlines the usage of your library and the necessary licensing terms related to the use of PDFBox.
