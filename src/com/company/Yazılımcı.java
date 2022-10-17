package com.company;

public class Yazılımcı extends Calisan {

    private String diller;

    public Yazılımcı(){

    }
    public Yazılımcı(String  ad,String soyad,int id,String diller){
        //setAd(ad);
        //setSoyad(soyad);
       // setId(id);
        super(ad,soyad,id);
        this.diller=diller;
    }

    public String getDiller() {
        return diller;
    }

    public void setDiller(String diller) {
        this.diller = diller;
    }

    public void formatAt(String isletimSistemi) {
        // System.out.println("adil bilgisara format attı ve windows 11 işletim sistemi kurdu");
        System.out.println(getAd() + " bilgisayara format attı ve " + isletimSistemi + " işletim sistemi kurdu ");
    }

    //overloadin aynı method ismi ancak parametreler farklı
    // overriding atasıdan olan aynı isimde method olusturma
    public void bilgileriGoster() {
        super.bilgileriGoster();
        // System.out.println("*************");
        //   System.out.println("Yazılımcının Ad = " + getAd());
        //  System.out.println("Yazlımcının Soyadı = " + getSoyad());
        // System.out.println("Yazlımcının Id = " + getId());
        System.out.println("Yazlımcının bildiği diller = " + getDiller());
        System.out.println("*************");
    }

}
