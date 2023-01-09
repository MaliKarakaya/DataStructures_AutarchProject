package otoparkproje;

public abstract class  Arac {
    private String marka;
    private String model;
    private String plaka;

    public Arac(String marka, String model, String plaka) {
        this.marka = marka;
        this.model = model;
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }
    public void bilgileriGoster()
    {

        System.out.print(" "+this.marka+" ,"+this.model+" ,"+this.plaka);
    }

    public abstract double getUcret();



    public abstract void setUcret(double ucret);


}

