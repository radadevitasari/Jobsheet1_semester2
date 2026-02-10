import java.util.Scanner;

public class Tugas2 {
    
        static Scanner sc = new Scanner(System.in);

        static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
    }
    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("==============================================================");
        System.out.printf("%-25s %-20s %-10s %-15s%n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==============================================================");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s%n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }
    static void tampilHari(String[][] jadwal, int n, String hariCari) {
        boolean ketemu = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Tidak ada jadwal pada hari " + hariCari);
        }
    }
    static void tampilMatkul(String[][] jadwal, int n, String matkulCari) {
        boolean ketemu = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkulCari)) {
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());
        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String matkul = sc.nextLine();
        tampilMatkul(jadwal, n, matkul);
    }
}
    