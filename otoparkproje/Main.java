package otoparkproje;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Date girisZamani = new Date();

        GirisAraci arac1 = new GirisAraci("Ford", "Focus", "34 ABC 123", girisZamani);

        arac1.calistir();


        arac1.calistir(60);


        arac1.calistir(60, "Sag");
        //Fiyat için sistemi uyutmak
        Thread.sleep(1000);
        Date cikisZamani = new Date();

        double ucret = arac1.ucretHesapla(cikisZamani);


        Otopark otopark = new Otopark("My Parking Lot", 10);
        Otopark otoparkk = new Otopark("My Parking Lot", 10);

        Arac arac3 = new Arac("Ford", "Focus", "34 ABC 123") {
            @Override
            public double getUcret() {
                return ucret;
            }

            @Override
            public void setUcret(double ucret) {
                ucret = this.getUcret();
            }
        };
        Arac arac4 = new Arac("Toyota", "Camry", "12 DEF 456") {
            @Override
            public double getUcret() {
                return ucret;
            }

            @Override
            public void setUcret(double ucret1) {
                ucret1 = ucret;
            }
        };


        otopark.aracGiris(arac3);

        otopark.aracGiris(arac4);


        otopark.aracCikis(arac4);



    }






    }

