import java.util.Scanner;

public class SuratDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat15 stack = new StackSurat15(10);

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Teratas");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();

                    Surat15 s = new Surat15(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat15 keluar = stack.pop();
                    if (keluar != null) {
                        System.out.println("Surat diproses:");
                        keluar.tampil();
                    }
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    System.out.print("Cari nama: ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;
            }
        } while (pilih != 0);
    }
}