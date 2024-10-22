public class Pegawai {
    // Private attributes
    private String nama;
    private double gajiPokok;

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    // Method to print employee information
    public void cetakInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Gaji Pokok: " + getGajiPokok());
    }
}
