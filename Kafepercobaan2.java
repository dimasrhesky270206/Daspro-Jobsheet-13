public class Kafepercobaan2 {
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50% dengan kode promo: " + kodePromo);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30% dengan kode promo: " + kodePromo);
        } else {
            System.out.println("Kode promo tidak valid!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }

    public static void main(String[] args) {
        // Memanggil method menu dengan argumen
        menu("Andi", true, "DISKON50"); // Contoh pemanggilan dengan kode promo DISKON50
        System.out.println(); // Baris kosong untuk pemisah
        menu("Budi", false, "DISKON30"); // Contoh pemanggilan dengan kode promo DISKON30
        System.out.println(); // Baris kosong untuk pemisah
        menu("Citra", true, "PROMO20"); // Contoh pemanggilan dengan kode promo tidak valid
    }
}
