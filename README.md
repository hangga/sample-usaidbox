# Usaidbox PDF Viewer

Usaidbox PDF Viewer is a Java library for displaying PDF files embedded within applications. It uses Apache PDFBox as the backend for PDF rendering, providing easy PDF viewing and manipulation capabilities for your app.

## Features

-	Embedded PDF viewer for Java applications
-	Powered by Apache PDFBox for rendering PDFs
-	Supports page navigation
-	Supports zooming and scaling

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

## Usage

Basic example to display a PDF file:
```Java
String path = System.getProperty("user.dir") + "/Programming in Python 3 - A Complete Introduction to the Python Language, Second Edition (2010) 1.pdf";
new UsaidBox()
    .loadPdf(path)
    .setMaximized()
    .setVisible(true);
```

## License

This library uses <a href="https://pdfbox.apache.org/">Apache PDFBox</a>, which is licensed under the Apache License, Version 2.0. You are free to use, modify, and distribute this library under the following conditions:

1.	Attribution: You must give appropriate credit to the Apache PDFBox project.
2.	License: This library adheres to the Apache License 2.0, which allows both commercial and non-commercial use. You can read the full license <a href="https://www.apache.org/licenses/LICENSE-2.0">here</a>.

Ensure you include this license in any distribution of your application if you use Usaidbox PDF Viewer.

This README outlines the usage of your library and the necessary licensing terms related to the use of PDFBox.
