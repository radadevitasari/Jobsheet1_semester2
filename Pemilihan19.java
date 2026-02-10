import java.util.Scanner;

public class Pemilihan19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();
        System.out.println("==============================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
        } else {

            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
            String nilaiHuruf;
            String keterangan;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                keterangan = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA " + keterangan);
        }

        sc.close();
    }
}

