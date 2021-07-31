package com.projectundikamobile.a19410100076_m_fadil_muhtarom_laoegi;

public class Mahasiswa {

    private String nama, nim, matkul;
    private double uts, uas, tugas;

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

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getNilaiAkhir() {

        double NilaiAkhir = (0.3 * uts ) + (0.3 * uas ) + (0.4 * tugas );
        String huruf;

        return NilaiAkhir;
    }
}
