import java.util.Scanner;

public class Tugas1Flowchart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalRata2Keseluruhan = 0;
        int[][] nilai = new int[10][6];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Kepuasan Responden ke-" + (i + 1));
            double rata2Responden = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Input Nilai Kepuasan (1-5) Pertanyaan ke-" + (j + 1) + (": "));
                nilai[i][j] = input.nextInt(); 
                rata2Responden += nilai[i][j];
            }
            System.out.println("Rata-rata Nilai Kepuasan Responden ke-" + (i + 1) + ": " + rata2Responden / nilai[0].length);
        }
        for (int j = 0; j < 6; j++) { 
            double Rata2Pertanyaan = 0;
            for (int i = 0; i < nilai.length;i++){
                Rata2Pertanyaan += nilai[i][j];
            }
            System.out.println("Rata-rata Nilai Kepuasan Pertanyaan ke-" + (j+1) + ": " + Rata2Pertanyaan / nilai.length );
            totalRata2Keseluruhan +=  (Rata2Pertanyaan / nilai.length) ;
        }
        System.out.println("Rata-rata keseluruhan :" + (totalRata2Keseluruhan / 6));
    }
}