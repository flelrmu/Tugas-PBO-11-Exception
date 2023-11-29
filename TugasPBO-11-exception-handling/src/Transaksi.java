class Transaksi {
    private Produk produk;
    private Pembeli pembeli;
    private int jumlah;

    public Transaksi(Produk produk, Pembeli pembeli, int jumlah) {
        this.produk = produk;
        this.pembeli = pembeli;
        this.jumlah = jumlah;
    }

    public int hitungTotal() {
        return produk.getHarga() * jumlah;
    }
}