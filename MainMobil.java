
// public class MainMobil {

//     public static void main(String[] args) {

//         // instan objek bernama m1
//         Mobil m1 = new Mobil();

//         m1.setKecepatan(50);
//         m1.setManufaktur("Toyota");
//         m1.setNoPlat("AB 1231 UA");
//         m1.setWarna("Merah");
//         m1.displayMessage();

//         System.out.println("========================");

//         // instan objek baru bernama m2
//         Mobil m2 = new Mobil();

//         m2.setKecepatan(100);
//         m2.setManufaktur("Mitsubishi");
//         m2.setNoPlat("N 1134 AG");
//         m2.setWarna("Pink");
//         m2.displayMessage();

//         System.out.println("========================");

//         // merubah warna dari objek m1
//         System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");

//         m1.setWarna("Hijau");

//         // menampilkan hasil perubahan
//         m1.displayMessage();
//     }
// }


// import java.util.Scanner;

// public class MainMobil {

//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         Mobil m1 = new Mobil();

//         System.out.print("Masukkan Manufaktur Mobil : ");
//         String manufaktur = input.nextLine();

//         System.out.print("Masukkan No Plat : ");
//         String noPlat = input.nextLine();

//         System.out.print("Masukkan Warna : ");
//         String warna = input.nextLine();

//         System.out.print("Masukkan Kecepatan : ");
//         int kecepatan = input.nextInt();

//         m1.setManufaktur(manufaktur);
//         m1.setNoPlat(noPlat);
//         m1.setWarna(warna);
//         m1.setKecepatan(kecepatan);

//         System.out.println("\nData Mobil:");
//         m1.displayMessage();
//     }
// }



import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mobil m1 = new Mobil();

        System.out.print("Masukkan Manufaktur Mobil : ");
        String manufaktur = input.nextLine();

        System.out.print("Masukkan No Plat : ");
        String noPlat = input.nextLine();

        System.out.print("Masukkan Warna : ");
        String warna = input.nextLine();

        System.out.print("Masukkan Kecepatan : ");
        int kecepatan = input.nextInt();

        System.out.print("Masukkan Waktu Perjalanan (jam) : ");
        double waktu = input.nextDouble();

        m1.setManufaktur(manufaktur);
        m1.setNoPlat(noPlat);
        m1.setWarna(warna);
        m1.setKecepatan(kecepatan);
        m1.setWaktu(waktu); // pemanggilan method baru

        System.out.println("\nData Mobil:");
        m1.displayMessage();
    }
}
