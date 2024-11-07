import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mahasiswa = 0, mataKuliah = 0;
        System.out.print(" Masukkan jumlah Mahasiswa: ");
        mahasiswa = input.nextInt();
        System.out.print(" Masukkan Jumlah Mata Kuliah : ");
        mataKuliah = input.nextInt();
        int[][] nilai = new int[mahasiswa][mataKuliah];
        
        for (int i = 0; i < mahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerMahasiswa = 0;
            for (int j = 0; j < mataKuliah; j++) {
                System.out.println("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
                totalPerMahasiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerMahasiswa / mahasiswa);
        }
        
        System.out.println("\n=====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < mataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < mahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / mataKuliah);
        }
    }
}
