import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        
        int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];

        
        System.out.println("\nInput Nilai Tugas");
        System.out.println("-----------------");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai tugas " + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        
        System.out.println("\nData Nilai Tugas");
        System.out.println("-----------------");
        tampilkanDataNilai(nilai, jumlahMahasiswa, jumlahTugas);

        
        System.out.println("\nRata-Rata Nilai Tugas Setiap Mahasiswa");
        System.out.println("------------------------------------");
        tampilkanRataRataNilai(nilai, jumlahMahasiswa, jumlahTugas);
    }

    public static void tampilkanDataNilai(int[][] nilai, int jumlahMahasiswa, int jumlahTugas) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static void tampilkanRataRataNilai(int[][] nilai, int jumlahMahasiswa, int jumlahTugas) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilai += nilai[i][j]; 
            }
            double rataRata = totalNilai / (double)jumlahTugas; 
            System.out.println("Rata-rata Mahasiswa " + (i + 1) + ": " + rataRata);
        }
    }
}
