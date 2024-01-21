public class Main {
    public static void main(String[] args) {
        // Display the header of the table
        System.out.printf("%-10s%-10s%-5s%-10s%-10s\n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("-------------------------------------------");

        // Display the conversion table
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5.0) {
            System.out.printf("%-10.1f%-10.3f%-5s%-10.1f%-10.3f\n", feet, Conversion.footToMeter(feet), "|", meters, Conversion.meterToFoot(meters));
        }
    }
}