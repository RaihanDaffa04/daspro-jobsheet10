import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 1) {
               while (true) {
                System.out.print("Masukkan nama: ");
                nama = input.nextLine();
                System.out.print("Masukkan baris (1-4): ");
                baris = input.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom = input.nextInt();
                input.nextLine();
                for(int i = 0; i< penonton.length; i++){
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j]== null) {
                            penonton[i][j] = "***";
                        }
                    }
                }
                if ((baris > 4) || (kolom > 2)) {
                    System.out.println("Baris/kolom kursi tidak tersedia, silahkan input ulang");
                    continue;
                }
                if(penonton[(baris-1)] [(kolom-1)] != "***"){
                    System.out.println("Kursi sudah ditempati, silahkan input ulang");
                    continue;
                }
                penonton[baris - 1][kolom - 1] = nama;
                System.out.print("Apakah lanjut (y/n): ");
                next = input.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
               }
            } else if (pilihan == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } 
                        }
                    
                }

            } else if (pilihan == 3) {
                break;
            }
        }
    }
}
