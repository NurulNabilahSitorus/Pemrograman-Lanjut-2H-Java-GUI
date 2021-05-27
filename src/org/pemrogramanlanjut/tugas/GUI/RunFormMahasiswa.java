package org.pemrogramanlanjut.tugas.GUI;

import javax.swing.*;

public class RunFormMahasiswa {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("BIODATA MAHASISWA");
        jFrame.setContentPane(new FormDataMahasiswa().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600, 400);
        jFrame.setVisible(true);
    }
}
