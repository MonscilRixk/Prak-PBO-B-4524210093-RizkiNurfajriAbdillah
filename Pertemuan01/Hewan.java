class Hewan {
    String jenis;
    String warna;

    public void lari() {
        System.out.println(this.jenis + " warna " + this.warna + " sedang lari.");
    }

    public void jalan() {
        System.out.println(this.jenis + " warna " + this.warna + " sedang jalan.");
    }

    public void terbang() {
        System.out.println(this.jenis + " warna " + this.warna + " sedang terbang.");
    }

    public static void main(String[] args) {
        Hewan anjing = new Hewan();
        Hewan kucing = new Hewan();
        Hewan burung = new Hewan();

        anjing.jenis = "Anjing";
        kucing.jenis = "Kucing";
        burung.jenis = "Burung";

        anjing.warna = "Coklat";
        kucing.warna = "Putih";
        burung.warna = "Biru";

        System.out.println();

        anjing.lari();
        kucing.jalan();
        burung.terbang();

        System.out.println();
    }
}
