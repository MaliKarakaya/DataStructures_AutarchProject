package otoparkproje;

import java.util.Date;

public class OtoparkIslemleri {
    private Otopark otopark;

    public OtoparkIslemleri(Otopark otopark) {
        this.otopark = otopark;
    }

    public void aracGiris(GirisAraci arac) {
        otopark.aracGiris(arac);
    }

    public void aracCikis(GirisAraci arac) throws InterruptedException {
        Date simdi = new Date();
        Thread.sleep(1000);
        long fark = simdi.getTime() - arac.getGirisZamani().getTime();
        int dakika = (int) (fark / (60 * 1000));
        int ucret = dakika * 1;
        arac.setUcret(ucret);
        otopark.aracCikis(arac);
    }
}

