import java.util.*;
import java.lang.Math;

public class soal1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, rating, sum, min, max, countHigh;
        double rata;
        String daftarRating;

        n = Integer.parseInt(input.nextLine());
        sum = 0;
        countHigh = 0;
        min = 100;
        max = -1;
        daftarRating = "Daftar rating:";
        for (i = 1; i <= n; i++) {
            rating = Integer.parseInt(input.nextLine());
            daftarRating = daftarRating + " " + rating;
            sum = sum + rating;
            if (rating > max) {
                max = rating;
            }
            if (rating < min) {
                min = rating;
            }
            if (rating >= 4) {
                countHigh = countHigh + 1;
            }
        }
        rata = (double) sum / n;
        System.out.println(daftarRating);
        System.out.println("Rata-rata: " + toFixed(rata,2));
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah: " + min);
        System.out.println("Reviewer rating >=4: " + countHigh + " orang");
        System.out.println(cekstatus(rata));
    }
    
    public static String cekstatus(double nilaiRata) {
        String pesan;

        if (nilaiRata >= 3.0) {
            pesan = "Kondisi cukup, masih perlu peningkatan.";
        } else {
            pesan = "Kondisi kurang, perlu perbaikan segera.";
        }
        
        return pesan;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
