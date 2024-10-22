public class Manager extends Pegawai {
    // Private attribute
    private double tunjangan;

    // Setter method
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter method
    public double getTunjangan() {
        return tunjangan;
    }

    // Override method to print manager information
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
