package thessarx;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String hasil;

            if (in.equals("")) {
                System.out.println("Masukan kembali Infix !");
            } else {
                Penghitungan theTrans = new Penghitungan(in.next());
                hasil = theTrans.doTrans();
                System.out.println(hasil);
            }
        }
    }

