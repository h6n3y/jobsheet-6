import java.util.Scanner;

public class Pemilihan2Percobaan304 {
    public static void main(String[] args) {
        
        // Scanner
        Scanner input04 = new Scanner(System.in);

        // Tipe Data
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = input04.next();

        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input04.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih = " + gajiBersih);

        } else if(kategori.equals("Pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if(penghasilan <= 3500000){
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Gaji Bersih = " + gajiBersih);

        } else {
            System.out.println("Masukkan Kategori Salah");
        } 
    
    }
}
