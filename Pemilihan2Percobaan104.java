import java.util.Scanner;

public class Pemilihan2Percobaan104 {
    public static void main(String[] args) {
        
        // Scanner
        Scanner input04 = new Scanner(System.in);

        // Tipe Data
        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input04.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        } else {
                System.out.println("Bukan Tahun Kabisat");
        }

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun kabisat");
        } else {
                System.out.println("Tahun tersebut bukanlah tahun kabisat");
        }

        } else {
                System.out.println("Bukan Tahun kabisat");
        }

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun " + tahun + " merupakan Tahun Kabisat"); 
            } else if ((tahun % 400) == 0) {
                System.out.println("Tahun " + tahun + "  merupakan Tahun Kabisat");
            } else {
                System.out.println("Tahun " + tahun + "  bukan merupakan Tahun Kabisat");
            }
                 
        } else {
            System.out.println("Tahun "+ tahun + " bukan Tahun Kabisat");
        }
    }
}
