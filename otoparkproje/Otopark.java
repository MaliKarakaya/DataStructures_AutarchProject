package otoparkproje;

import java.util.ArrayList;
import java.util.Date;

public class Otopark implements AracIslemleri{
    private String isim;
    private int kapasite;
    private int mevcutYerler;
    private final ArrayList<Arac> araclar;

    public Otopark(String isim, int kapasite) {
        this.isim = isim;
        this.kapasite = kapasite;
        this.mevcutYerler = kapasite;
        this.araclar = new ArrayList<>();
    }

    public void aracGiris(Arac arac) {
        if (mevcutYerler > 0) {
            araclar.add(arac);
            mevcutYerler--;
            arac.bilgileriGoster();
            System.out.println(" otoparka giris yapti. Mevcut yerler: " + mevcutYerler);
        } else {
            System.out.println("Otopark dolu. Lütfen bekleyiniz.");
        }
    }

    public void aracCikis(Arac arac) {
        if (araclar.contains(arac)) {
            araclar.remove(arac);
            mevcutYerler++;
            arac.bilgileriGoster();
            System.out.println(" otoparktan cikis yapti. Mevcut yerler: " + mevcutYerler);
        } else {
            System.out.println("Arac otoparkta bulunamadi.");
        }
    }
}
