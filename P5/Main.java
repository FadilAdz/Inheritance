public class Main {
    public static void main(String[] args) {
        // Creating a Manager object
        Manager manager = new Manager();
        manager.setNama("Reza Cihuy");
        manager.setGajiPokok(5000);
        manager.setTunjangan(1000);
        manager.cetakInfo();

        // Creating a Programmer object
        Programmer programmer = new Programmer();
        programmer.setNama("Jefri Ahay");
        programmer.setGajiPokok(4000);
        programmer.setBonus(500);
        programmer.cetakInfo();
    }
}
