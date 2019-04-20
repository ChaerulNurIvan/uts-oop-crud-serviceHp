import service.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static ServiceHp service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new ServiceHp();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            callMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("inputan salah, coba untuk memilih sesuai menu");
                opsi = 0;
            } catch(NoSuchElementException e) {
                System.err.println("Inputnya exhausted");
                opsi = 0;
            } catch(IllegalStateException e) {
                System.err.println("Scanner ketutup");
                opsi = 0;
            }
            seleksi(opsi);
        } while(opsi != 5);
    }

    private static void seleksi(int opsi) {
        switch(opsi) {
            case 1:
                callFormTambahData();
                break;
            case 2:
                callFormEditData();
                break;
            case 3:
                callDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan");
                System.out.println("Aplikasi kami.");
        }
    }

    private static void callDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\n=--= Form Hapus Data =--=");
        System.out.print("ID : ");
        String id = scanner.nextLine();
        service.deleteData(id);
    }

    private static void callFormEditData() {
        scanner = new Scanner(System.in);
        String id, nama, merk, nohp;

        System.out.println("\n=--= Form Ubah Data =--=");
        System.out.print("ID   : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("MERK : ");
        merk = scanner.nextLine();
        System.out.print("NOHP : ");
        nohp = scanner.nextLine();
        service.updateData(new Hp(id, nama, merk, nohp));
    }

    private static void callFormTambahData() {
        scanner = new Scanner(System.in);
        String id, nama, merk, nohp;

        System.out.println("\n=--= Form Entry Data =--=");
        System.out.print("ID   : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("MERK : ");
        merk = scanner.nextLine();
        System.out.print("NOHP : ");
        nohp = scanner.nextLine();
        service.addData(new Hp(id, nama, merk, nohp));
    }

    private static void callMenu() {
        //System.out.println("Nama  : Chaerul Nur Ivan");
        //System.out.println("Nim   : 17090056");
        //System.out.println("Kelas : 4a");
        System.out.println("=---= Aplikasi Service Hp =---=");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("-------------------");
        System.out.print  ("pilihan > ");

    }

}