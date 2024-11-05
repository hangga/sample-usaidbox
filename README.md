# Usaidbox PDF Viewer

<img width="70%" src="https://github.com/hangga/sample-usaidbox/blob/main/usaidbook.png?raw=true"/>

## Overview
`Usaidbox PDF Viewer` is a lightweight library to add an embedded PDF preview in your app (Swing GUI). Using Apache PDFBox for rendering, it makes displaying and interacting with PDFs easy in Java.

## Features

- Embedded PDF viewer for Java (Swing GUI) apps
- PDF rendering powered by Apache PDFBox
- Page navigation
- Scaling options
- Print and Save options

## System Requirements
- Java 8 or newer

## Installation
### Gradle

Add this dependency to your `build.gradle` file:

```Groovy
repositories {
    maven { url 'https://repo.repsy.io/mvn/hangga/repo' }
}

dependencies {
    implementation 'com.box.usaid:usaidbox:1.0.1'
}
```
### Maven
```xml
<repositories>
  <repository>
    <id>repsy</id>
    <url>https://repo.repsy.io/mvn/hangga/repo</url>
  </repository>
</repositories>
<dependencies>
  <dependency>
    <groupId>com.box.usaid</groupId>
    <artifactId>usaidbox</artifactId>
    <version>1.0.1</version>
  </dependency>
</dependencies>
```

## How to Use UsaidBox

### 1. Create a `UsaidBox` Object
To get started, create a new `UsaidBox` object and call its methods as needed:
```java
UsaidBox usaidBox = new UsaidBox("PDF Viewer");
```

### 2. Load a PDF
Use the `loadPdf()` method to load your PDF. You can load a PDF either with a `String` path or a `File` object.
```java
usaidBox.loadPdf("path/to/your/pdf-file.pdf");

// Or use a File object
File pdfFile = ...
usaidBox.loadPdf(pdfFile);
```

### 3. Show the `UsaidBox` Dialog
Once your PDF is loaded, use `setVisible(true)` to show the `UsaidBox` dialog.
```java
usaidBox.setVisible(true);
```

### 4. Extra Options

- **Custom Size**: Set the dialog size as you like.
  ```java
  usaidBox.setCustomSize(1024, 768);
  ```

- **Maximize**: Show the dialog in full-screen mode.
  ```java
  usaidBox.setMaximized();
  ```

- **Set Output File Name**: Specify the file name for PDF downloads.
  ```java
  usaidBox.setOutputFileName("custom-output-name.pdf");
  ```

### 5. Controls & Features
`UsaidBox` also comes with a few controls:

- **Scaling**: Use the combo box at the top to adjust view scale:
  - `ACTUAL_SIZE`: Actual size.
  - `SHRINK_TO_FIT`: Shrinks to fit the screen.
  - `STRETCH_TO_FIT`: Stretches to fit.
  - `SCALE_TO_FIT`: Scales to fit the screen.

- **Page Navigation**: `Next` and `Previous` buttons for page flipping.

- **Print**: Print the PDF file.

- **Save As**: Download the PDF with your chosen file name.

- **Close**: Close the dialog.

### 6. Full Usage Example
```java
UsaidBox usaidBox = new UsaidBox("PDF Viewer")
        .loadPdf("path/to/your/pdf-file.pdf")
        .setCustomSize(1024, 768)
        .setOutputFileName("OutputFile.pdf")
        .setVisible(true);
```

## License

This library is a proprietary, closed-source library with restrictions on redistribution and modification.

It is free to use, but if you find it valuable, you are welcome to make a donation or become a sponsor. For more information, please contact me.


[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/F1F215NPV4)

[![Support via PayPal](https://cdn.rawgit.com/twolfson/paypal-github-button/1.0.0/dist/button.svg)](https://www.paypal.me/hanggaajisayekti/)
