import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Produk produk = inputProduk(scanner);
            Pembeli pembeli = inputPembeli(scanner);
            int jumlah = inputJumlah(scanner);

            Transaksi transaksi = new Transaksi(produk, pembeli, jumlah);

            System.out.println("\nDetail Transaksi:");
            System.out.println("Produk: " + produk.getHarga());
            System.out.println("Pembeli: " + pembeli.getNama());
            System.out.println("Jumlah: " + jumlah);
            System.out.println("Total Harga: " + transaksi.hitungTotal());
        } catch (InputMismatchException e) {
            System.out.println("Error: Masukkan input yang valid (angka).");
        } catch (Exception e) {
            System.out.println("Error: Terjadi kesalahan.");
        } finally {
            scanner.close();
        }
    }

    private static Produk inputProduk(Scanner scanner) {
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga produk: ");
        int harga = scanner.nextInt();
        return new Produk(nama, harga);
    }

    private static Pembeli inputPembeli(Scanner scanner) {
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.next();
        return new Pembeli(nama);
    }

    private static int inputJumlah(Scanner scanner) {
        System.out.print("Masukkan jumlah pembelian: ");
        return scanner.nextInt();
    }
}