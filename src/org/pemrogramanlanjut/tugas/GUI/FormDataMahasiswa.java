package org.pemrogramanlanjut.tugas.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormDataMahasiswa {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textJenjangpendidikan;
    private JTextField textTahunmasuk;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJeniskelamin;
    private JTextField textNomorurut;
    private JButton buttonsave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormDataMahasiswa() {
        buttonsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textNama
                String nama = textNama.getText();

                //Mengambil data dari textNim
                String nim = textNim.getText();

                //Mengambil data dari textJenjangpendidikan
                String jenjangpendidikan = textJenjangpendidikan.getText();

                //Mengambil data dari  textTahunmasuk
                String tahunmasuk = textTahunmasuk.getText();

                //Mengambil data dari textFakultas
                String fakultas = textFakultas.getText();

                //Mengambil data dari textJurusan
                String jurusan = textJurusan.getText();

                //Mengambil data dari textJeniskelamin
                String jeniskelamin = textJeniskelamin.getText();

                //Mengambil data dari textNomorurut
                String nomorurut = textNomorurut.getText();

                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                mhs.setJenjangpendidikan(jenjangpendidikan);
                mhs.setTahunmasuk(tahunmasuk);
                mhs.setFakultas(fakultas);
                mhs.setJurusan(jurusan);
                mhs.setJeniskelamin(jeniskelamin);
                mhs.setNomorurut(nomorurut);

                System.out.println(mhs.toString());

                //Tampilkan output ke Form
                labelHasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
