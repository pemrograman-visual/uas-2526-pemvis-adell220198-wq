import java.util.*;
import java.lang.Math;

public class soal3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahOrang, i, jumlahBarang, totalOrang, totalKamar;
        String nama;

        totalKamar = 0;
        jumlahOrang = Integer.parseInt(input.nextLine());
        System.out.println("Total konsumsi:");
        for (i = 1; i <= jumlahOrang; i++) {
            nama = input.nextLine();
            jumlahBarang = Integer.parseInt(input.nextLine());
            totalOrang = hitungTotalBarang(jumlahBarang);
            System.out.println(nama + " = " + totalOrang + " wh");
            totalKamar = totalKamar + totalOrang;
        }
        System.out.println("");
        System.out.println("Total konsumsi kamar = " + totalKamar + " wh");
        if (totalKamar <= 1200) {
            System.out.println("Konsumsi masih dalam batas wajar.");
        } else {
            System.out.println("Konsumsi melebihi batas wajar!");
        }
    }
    
    public static int hitungTotalBarang(int banyakItem) {
        int j, nilai, total;

        total = 0;
        for (j = 1; j <= banyakItem; j++) {
            nilai = Integer.parseInt(input.nextLine());
            total = total + nilai;
        }
        
        return total;
    }
}
