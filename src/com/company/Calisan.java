package com.company;

public class Calisan {
    private String ad;
    private String soyad;
    private int id;

    public Calisan(){
     this.ad="ad atanmadı";
     this.soyad="soyad atanmadı";
     this.id = -1;
    }

    public Calisan(String ad,String soyad,int id){
        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  void  bilgileriGoster(){
        System.out.println("***************");
        System.out.println("Calısan ozelleri");
        System.out.println("calisan Ad= " + this.getAd());
        System.out.println("calisan Soayadı= " + this.getSoyad());
        System.out.println("calisan id= " + this.getId());
        System.out.println("***************");
    }
}
