public class Surat15 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat15() {}

    Surat15(String id, String nama, String kelas, char jenis, int durasi) {
        this.idSurat = id;
        this.namaMahasiswa = nama;
        this.kelas = kelas;
        this.jenisIzin = jenis;
        this.durasi = durasi;
    }

    void tampil() {
        System.out.println("ID Surat: " + idSurat);
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jenis Izin: " + jenisIzin);
        System.out.println("Durasi: " + durasi + " hari");
        System.out.println("----------------------");
    }
}
