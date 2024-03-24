import java.util.Scanner;

// Class induk BangunRuang
class BangunRuang {
    private String nama;

    // Constructor
    public BangunRuang(String nama) {
        this.nama = nama;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method inputNilai()
    public void inputNilai() {
        // Default implementation
    }

    // Method luasPermukaan()
    public double luasPermukaan() {
        // Default implementation
        return 0.0;
    }

    // Method volume()
    public double volume() {
        // Default implementation
        return 0.0;
    }
}

// Child class Tabung
// Child class Tabung
class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    // Constructor
    public Tabung(String nama) {
        super(nama);
    }

    // Method inputNilai() overriding
    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        tinggi = scanner.nextDouble();
    }

    // Method luasPermukaan() overriding
    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    // Method volume() overriding
    @Override
    public double volume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}


// Child class Kubus
class Kubus extends BangunRuang {
    private double sisi;

    // Constructor
    public Kubus(String nama) {
        super(nama);
    }

    // Method inputNilai() overriding
    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = scanner.nextDouble();
    }

    // Method luasPermukaan() overriding
    @Override
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    // Method volume() overriding
    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }
}

// Child class Balok
class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    // Constructor
    public Balok(String nama) {
        super(nama);
    }

    // Method inputNilai() overriding
    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = scanner.nextDouble();
    }

    // Method luasPermukaan() overriding
    @Override
    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Method volume() overriding
    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek untuk masing-masing class
        Tabung tabung = new Tabung("Tabung");
        Kubus kubus = new Kubus("Kubus");
        Balok balok = new Balok("Balok");

        // Memanggil method inputNilai(), luasPermukaan(), dan volume() untuk setiap objek
        System.out.println("Masukkan nilai untuk Tabung:");
        tabung.inputNilai();
        System.out.println("\nMasukkan nilai untuk Kubus:");
        kubus.inputNilai();
        System.out.println("\nMasukkan nilai untuk Balok:");
        balok.inputNilai();

        // Menampilkan hasil perhitungan luas permukaan dan volume untuk setiap objek
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Nama: " + tabung.getNama());
        System.out.println("Luas Permukaan Tabung: " + tabung.luasPermukaan());
        System.out.println("Volume Tabung: " + tabung.volume());

        System.out.println("\nNama: " + kubus.getNama());
        System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());
        System.out.println("Volume Kubus: " + kubus.volume());

        System.out.println("\nNama: " + balok.getNama());
        System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());
        System.out.println("Volume Balok: " + balok.volume());
    }
}
