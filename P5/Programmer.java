public class Programmer extends Pegawai {
    // Private attribute
    private double bonus;

    // Setter method
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Getter method
    public double getBonus() {
        return bonus;
    }

    // Override method to print programmer information
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus: " + getBonus());
    }
}
