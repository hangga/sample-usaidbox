# Usaidbox PDF Viewer

<img width="70%" src="https://github.com/hangga/sample-usaidbox/blob/main/usaidbook.png?raw=true"/>

## Pengantar
`Usaidbox PDF Viewer` adalah libray sederhana untuk membuat _PDF embedded-preview_ dalam aplikasi (Swing GUI). Dengan Apache PDFBox sebagai backend untuk rendering PDF, menyediakan kemampuan tampilan dan manipulasi PDF yang mudah untuk aplikasi Anda.

## Features

-	Embedded PDF viewer for Java applications
-	Powered by Apache PDFBox for rendering PDFs
-	Supports page navigation
-	Supports scaling option
-	Supports Print and Save

## System Requirements
- Java 8 atau yang lebih baru.

## Installation

Add the following dependency to your build.gradle file:

```Groovy
repositories {
    maven { url 'https://repo.repsy.io/mvn/hangga/repo' }
}

dependencies {
    implementation 'com.box.usaid:usaidbox:1.0.1'
}
```

## Menggunakan UsaidBox

#### 1. Membuat Objek `UsaidBox`
Untuk menggunakan `UsaidBox`, buat objek baru dan panggil beberapa metode berikut sesuai kebutuhan:
```java
// Membuat instance UsaidBox
UsaidBox usaidBox = new UsaidBox("Viewer PDF");
```

#### 2. Memuat PDF
Untuk menampilkan PDF, gunakan metode `loadPdf()`. Anda bisa memuat PDF baik dari objek `File` atau dengan mengirimkan path dari file PDF sebagai `String`.
```java
// Memuat PDF dari objek File
usaidBox.loadPdf(new File("path/to/your/pdf-file.pdf"));

// Atau memuat PDF dengan path langsung
usaidBox.loadPdf("path/to/your/pdf-file.pdf");
```

#### 3. Menampilkan Dialog `UsaidBox`
Setelah memuat PDF, panggil metode `setVisible(true)` untuk menampilkan dialog `UsaidBox`.
```java
// Menampilkan dialog
usaidBox.setVisible(true);
```

#### 4. Opsi Tambahan

- **Set Custom Size**: Ubah ukuran dialog sesuai keinginan.
  ```java
  usaidBox.setCustomSize(1024, 768);
  ```

- **Set Maksimalkan Ukuran**: Untuk menampilkan dialog dalam ukuran layar penuh.
  ```java
  usaidBox.setMaximized();
  ```

- **Mengatur Nama File Output**: Tentukan nama file untuk output PDF saat diunduh.
  ```java
  usaidBox.setOutputFileName("custom-output-name.pdf");
  ```

#### 5. Tombol & Fitur
`UsaidBox` menyediakan beberapa kontrol dan tombol sebagai berikut:

- **Scaling**: Gunakan kotak kombo di bagian atas untuk menyesuaikan tampilan:
  - `ACTUAL_SIZE`: Menampilkan dalam ukuran asli.
  - `SHRINK_TO_FIT`: Mengecilkan tampilan agar pas di layar.
  - `STRETCH_TO_FIT`: Memperbesar tampilan.
  - `SCALE_TO_FIT`: Menyesuaikan skala agar pas di layar.

- **Navigasi Halaman**: `Next` dan `Previous` untuk menggeser halaman.

- **Print**: Tombol `Print` untuk mencetak file PDF.

- **Save As**: Tombol `Save As` untuk mengunduh PDF dengan nama file yang ditentukan.

- **Close**: Tombol `Close` untuk menutup dialog.

#### 6. Contoh Penggunaan Lengkap
```java
// Membuat instance UsaidBox dengan chaining method
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
