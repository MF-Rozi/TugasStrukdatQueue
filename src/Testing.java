import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Queue a = new Queue(3);
        Scanner scan = new Scanner (System.in);
        System.out.println(" Masukkan Pesannan Anda ( Format Penulisan kode banyak)");
        a.enqueue(new Order(scan.nextInt(),scan.nextInt()));
        System.out.println(" Masukkan Pesannan Anda ( Format Penulisan kode,banyak)");
        a.enqueue(new Order(scan.nextInt(),scan.nextInt()));
        System.out.println(" Masukkan Pesannan Anda ( Format Penulisan kode,banyak)");
        a.enqueue(new Order(scan.nextInt(),scan.nextInt()));

        System.out.println(a.dequeue());
        System.out.println("=====================");

        a.print();


    }
}
