// public class Mobil  {
//     private String noPlat;
//     private String warna;
//     private String manufaktur;
//     private int kecepatan;
   

//     public void setNoPlat(String s){
//         noPlat = s;
//     }

//     public void setWarna(String s){
//         warna = s;
//     }

//     public void setManufaktur(String s){
//         manufaktur = s;
//     }

//     public void setKecepatan(int i){
//         kecepatan = i;
//     }
//     public void displayMessage(){
//         System.out.println("Mobil anda adalah bermerk " + manufaktur);
//         System.out.println("mempunyai nomor plat " + noPlat);
//         System.out.println("serta memiliki warna " + warna);
//         System.out.println("dan mampu menempuh kecepatan " + kecepatan);
//     }
// }


public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;   // tambahan variabel waktu

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }

    public void setManufaktur(String s){
        manufaktur = s;
    }

    public void setKecepatan(int i){
        kecepatan = i;
    }

    // method tambahan soal nomor 4
    public void setWaktu(double w){
        waktu = w;
    }
    
    // kode tambahan nomor 5
    public double rubahSekon(double jam){
        return jam * 3600;}
    
    // method nomor 6
    public void rubahKecepatan(){
        kecepatan = kecepatan * 1000 / 3600};
    
    // method nomor 7
    public double hitungJarak(){
        return kecepatan * waktu;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerk " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
        System.out.println("dengan waktu perjalanan " + waktu + " jam");
        
        double jarak = hitungJarak()/1000;
    System.out.println("Jarak yang dapat ditempuh adalah " + jarak + " km");
    }
}
