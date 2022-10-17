package com.company;

public class Yonetici extends Calisan {
    private int sorunlulugundaki_kişi_sayisi;

    public Yonetici() {

    }

    public Yonetici(String ad, String soyad, int id, int sorunlulugundaki_kişi_sayisi) {
        super(ad, soyad, id);
        this.sorunlulugundaki_kişi_sayisi = sorunlulugundaki_kişi_sayisi;
    }

    public int getSorunlulugundaki_kişi_sayisi() {
        return sorunlulugundaki_kişi_sayisi;
    }

    public void setSorunlulugundaki_kişi_sayisi(int sorunlulugundaki_kişi_sayisi) {
        this.sorunlulugundaki_kişi_sayisi = sorunlulugundaki_kişi_sayisi;
    }

    public void zamYap(int zamMiktarı){
       // System.out.println("Adil calısanlara 50$ zam yaptı");
        System.out.println(super.getAd() + " calısanlara " + zamMiktarı + "$ zam yaptı" );
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yoneticinin sorumlu oldugu kişi sayısı = " + getSorunlulugundaki_kişi_sayisi());
        System.out.println("***********");
    }

}
