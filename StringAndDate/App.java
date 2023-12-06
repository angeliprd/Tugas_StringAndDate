import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("");

        try (Scanner scanner = new Scanner(System.in)) {
            Date tanggal = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
            String tanggalTransaksi = dateFormat.format(tanggal);

            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");
            String waktuTransaksi = timeFormat.format(tanggal);


            try {
                Member tes1 = new Member(){};
                System.out.print("Input Nama Pelanggan\t: ");
                tes1.namaPelanggan = scanner.nextLine();

                System.out.print("Input Nomor HP\t: ");
                tes1.noHp = scanner.nextLine();

                System.out.print("Input Alamat\t\t: ");
                tes1.alamat = scanner.nextLine();

                System.out.print("Input No. Faktur\t: ");
                tes1.nomorFaktur = scanner.nextLine();

                System.out.print("Input Nama Barang\t: ");
                tes1.namaBarang = scanner.nextLine();

                System.out.print("Input Harga Barang\t: ");
                tes1.hargaBarang = scanner.nextLong();

                System.out.print("Input Jumlah Barang\t: ");
                tes1.jumlahBarang = scanner.nextLong();

                System.out.print("Input Kode Barang\t: ");
                tes1.kodeBarang = scanner.nextLine();

                tes1.totalBayar = tes1.hargaBarang * tes1.jumlahBarang;


                System.out.println("");


                System.out.println("\tAngel's Shop");
                
                System.out.println("Date \t:" + tanggalTransaksi);
                System.out.println("Time \t\t:" + waktuTransaksi);

                System.out.println("------------------------");
                System.out.println("Customer Information");
                System.out.println("------------------------");
                System.out.println("Name\t:" + tes1.namaPelanggan);
                System.out.println("Phone Number\t:"+tes1.noHp);
                System.out.println("Address\t\t:"+tes1.alamat);
                System.out.println("------------------------");

                System.out.println("Purchase Information");
                System.out.println("------------------------");
                System.out.println("Product Code\t:" + tes1.kodeBarang);
                System.out.println("Product Name\t:" + tes1.namaBarang);
                System.out.println("Price\t:" + tes1.hargaBarang);
                System.out.println("Quantity\t:" + tes1.jumlahBarang);
                System.out.println("TOTAL\t:" + tes1.totalBayar);
                System.out.println("========================");

                System.out.println("Kasir\t\t:" + tes1.namaKasir);
                System.out.println("");

                System.out.println("-------------------------");

                System.out.println("Nama Pelanggan: " + tes1.namaPelanggan);

                System.out.println("No. Faktur: " + tes1.nomorFaktur);

                System.out.println("Nama Barang: " + tes1.namaBarang);

                System.out.println("Harga Barang: " + tes1.hargaBarang);

                System.out.println("Jumlah Barang: " + tes1.jumlahBarang);

                System.out.println("Total Bayar: " + tes1.totalBayar);

                System.out.println("-------------------------");

            } catch (java.util.InputMismatchException e) {
                System.out.println("Maaf, input tidak valid. Pastikan Anda memasukkan nilai numerik untuk harga dan jumlah barang.");
            }
        }
    }
}