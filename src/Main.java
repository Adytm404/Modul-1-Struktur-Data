import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        try {
            System.out.print("-=== HITUNG LUAS ===- \n \nPilih tampilan hasil:  \n 1. Hasil to Integer \n 2. Hasil to Double \nInput pilihan menu (1/2): ");
            int menu = input.nextInt();
            switch (menu) {
                case 1 -> inputValue();
                case 2 -> inputValueDouble();
                default -> System.out.println("Menu tidak ada");
            }
        } catch (Exception e) {
            System.err.print("Input bukan angka!");
        }
    }

    public static void inputValue() {
        System.out.println("Masukkan nilai Alas dan Tinggi secara berurutan: ");
        Segitiga<Integer, Integer> luasInt = new Segitiga<>(input.nextInt(), input.nextInt());
        System.out.print("Hasilnya adalah: " + luasInt.hitungInteger());
    }

    public static void inputValueDouble() {
        System.out.println("Masukkan nilai Alas dan Tinggi secara berurutan: ");
        Segitiga<Double, Double> luasDouble = new Segitiga<>(input.nextDouble(), input.nextDouble());
        System.out.print("Hasilnya adalah: " + luasDouble.hitungDouble());
    }
}
