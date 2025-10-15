import java.util.Scanner;

public class pengelolaBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket=50000, jml, tot=0, terjual=0;

        do {
        System.out.print("jumlah tiket yang dibeli (input 0 untuk berhenti): ");
        jml = sc.nextInt();
        if (jml > 4) {
            if (jml > 10) {
                tot += jml*hargaTiket*(1-0.15);
            }else{
                tot += jml*hargaTiket*(1-0.1);
            }
        }else if (jml > 0){
            tot += jml*hargaTiket;
        }else if (jml == 0) {
            break;
        }else{
            System.out.println("Tidak valid, input ulang!");
            continue;
        }
        terjual += jml;
        } while (jml != 0);
        
        System.out.println("total penjualan tiket: "+terjual);
        System.out.println("total pendapatan: Rp"+tot);
    }

}
