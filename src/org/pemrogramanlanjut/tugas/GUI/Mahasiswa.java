package org.pemrogramanlanjut.tugas.GUI;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jenjangpendidikan;
    private String tahunmasuk;
    private String fakultas;
    private String jurusan;
    private String jeniskelamin;
    private String nomorurut;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String jenjangpendidikan, String tahunmasuk, String fakultas, String jurusan, String jeniskelamin, String nomorurut) {
        this.nama = nama;
        this.nim = nim;
        this.jenjangpendidikan = jenjangpendidikan;
        this.tahunmasuk = tahunmasuk;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.jeniskelamin = jeniskelamin;
        this.nomorurut = nomorurut;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangpendidikan() {
        return jenjangpendidikan;
    }

    public void setJenjangpendidikan(String jenjangpendidikan) {
        this.jenjangpendidikan = jenjangpendidikan;
    }

    public String getTahunmasuk() {
        return tahunmasuk;
    }

    public void setTahunmasuk(String tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getNomorurut() {
        return nomorurut;
    }

    public void setNomorurut(String nomorurut) {
        this.nomorurut = nomorurut;
    }


    @Override
    public String toString() {
        return "Mahasiswa{" +
                "Nama='" + nama + '\'' +
                ", NIM='" + nim + '\'' +
                ", Jenjang Pendidikan='" + jenjangpendidikan + '\'' +
                ", Tahun Masuk='" + tahunmasuk + '\'' +
                ", Fakultas='" + fakultas + '\'' +
                ", Jurusan='" + jurusan + '\'' +
                ", Jenis Kelamin='" + jeniskelamin + '\'' +
                ", Nomor Urut='" + nomorurut + '\'' +
                '}';
    }
}
