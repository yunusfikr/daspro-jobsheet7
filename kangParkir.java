import java.util.Scanner;

public class kangParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;

        do {
        System.out.print("Masukkan jenis kenadaraan (1 mobil, 2 motor, 0 keluar): ");
        jenis = sc.nextInt();
        if (jenis == 1 || jenis == 2) {
            System.out.print("input durasi: ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            }else if (jenis == 1) {
                total += durasi*3000;
            }else if (jenis == 2) {
                total += durasi*2000;
            }
        }else if (jenis == 0) {
            break;
        }
        } while (jenis != 0);
        
        System.out.println("total: "+total);
    }
}
