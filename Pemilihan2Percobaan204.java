import java.util.Scanner;

public class Pemilihan2Percobaan204 {
    public static void main(String[] args) {
        
        // Scanner
        Scanner input04 = new Scanner (System.in);

        // Tipe Data
        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan Sudut Pertama Segitiga Kamu : ");
        sudut1 = input04.nextFloat();

        System.out.print("Masukkan Sudut Kedua Segitiga Kamu : ");
        sudut2 = input04.nextFloat();

        System.out.print("Masukkan Sudut Ketiga Segitiga Kamu : ");
        sudut3 = input04.nextFloat();

        // Total Sudut
        totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println("Total Sudut Segitiga anda : " + totalSudut);

        //if (totalSudut == 180) {
        //    if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
        //        System.out.println("Merupakan Segitiga Siku-Siku");
        //    } else {
        //        System.out.println("Bukan merupakan Segitiga Siku-Siku");
        //    } } else {
        //        System.out.println("Bukan Segitiga");
        //    }

        // Menentukan Macam-Macam Segitiga
        
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("merupakan segitiga siku-siku");
        } else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
                System.out.println("Segitiga sama sisi");
        } else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
                System.out.println("Segitiga sama kaki");
        } else {
                System.out.println("Segitiga sembarang");
        }
            
        } else {
            System.out.println("bukan segitiga");
        }

        }
    }
