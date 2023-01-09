package otoparkproje;
import java.util.Random;
import javax.swing.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class GirisAraci extends Arac{
    private Date girisZamani;
    private double ucret;

    public GirisAraci(String marka, String model, String plaka, Date girisZamani) {
        super(marka, model, plaka);
        this.girisZamani = girisZamani;
    }
    public void bilgileriGoster()
    {
        System.out.println("Giriş Aracı");
        System.out.println(super.getMarka()+" ,"+super.getModel()+" ,"+super.getPlaka());
        System.out.println();

    }

    public Date getGirisZamani() {
        return new Date(girisZamani.getTime());
    }

    public void calistir() {
        System.out.println("Arac calistirildi.");
    }

    public void calistir(int hiz) {
        System.out.println("Arac " + hiz + " km/s hizla calistirildi.");
    }

    public void calistir(int hiz, String yon) {
        System.out.println("Arac " + hiz + " km/s hizla " + yon + " yonunde calistirildi.");
    }

    public int ucretHesapla(Date cikisZamani) {
    
        Random randomSure = new Random();
    
        int saat = randomSure.nextInt(100);
     
        
            if (saat!=0)
            ucret =(saat * 14); 
            else
                ucret = 31;
            System.out.println("Aracin otoparktaki sure: " + saat+" Saat" + " Ucret: " + ucret + " TL");
            return (int) ucret;


    }


    @Override
    public double getUcret() {
        return  ucret;
    }

    @Override
    public void setUcret(double ucret) {
        this.ucret = ucret;
    }
}

