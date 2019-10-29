package id.ac.polinema.tugasrecyclerview1dan2.models;

public class KatalogBaju {
    public String namaBaju;
    public String warnaBaju;
    public String ukuranBaju;
    public int baju;

    public KatalogBaju(String namaBaju, String warnaBaju, String ukuranBaju, int baju){
        this.namaBaju = namaBaju;
        this.warnaBaju = warnaBaju;
        this.ukuranBaju = ukuranBaju;
        this.baju = baju;
    }

    public String getNamaBaju() {
        return namaBaju;
    }

    public void setNamaBaju(String namaBaju) {
        this.namaBaju = namaBaju;
    }

    public String getWarnaBaju() {
        return warnaBaju;
    }

    public void setWarnaBaju(String warnaBaju) {
        this.warnaBaju = warnaBaju;
    }

    public String getUkuranBaju() {
        return ukuranBaju;
    }

    public void setUkuranBaju(String ukuranBaju) {
        this.ukuranBaju = ukuranBaju;
    }

    public int getBaju() {
        return baju;
    }

    public void setBaju(int baju) {
        this.baju = baju;
    }
}
