// Abstract class Produk
public abstract class Produk {

    // Abstract method
    abstract void hitungHarga();

    // Method main
    public static void main(String[] args) {

        // Membuat object dari class Makanan
        Makanan makanan = new Makanan();

        // Memanggil method hitungHarga()
        makanan.hitungHarga();
    }
}

// Class Makanan merupakan turunan dari Produk
class Makanan extends Produk {

    // Override method hitungHarga()
    @Override
    void hitungHarga() {
        System.out.println("Harga makanan: Rp25000");
    }
}