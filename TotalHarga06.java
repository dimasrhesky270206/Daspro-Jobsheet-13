import java.util.Scanner;

public class TotalHarga06 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000}; 
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem; 

    
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100); // Diskon 50%
            System.out.println("Selamat! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100); // Diskon 30%
            System.out.println("Selamat! Anda mendapatkan diskon 30%.");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid!");
        }

        return hargaTotal; 
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");

        
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer scanner setelah nextInt()

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }
}
