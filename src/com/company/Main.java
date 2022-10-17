package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public void calısanTest() {
        Calisan calisan1 = new Calisan();
        calisan1.setAd("Bugra");
        calisan1.setSoyad("BAYRAM");
        calisan1.setId(1);
        calisan1.bilgileriGoster();

        Calisan calisan2 = new Calisan();
        calisan2.bilgileriGoster();
        calisan2.setAd("Naciye");
        calisan2.setSoyad("Aydın");
        calisan2.setId(2);
        calisan2.bilgileriGoster();

        Calisan calisan3 = new Calisan("Adil", "Onur", 3);
        calisan3.bilgileriGoster();
    }

    public void yazılımcıTest() {
        Yazılımcı yazılımcı1 = new Yazılımcı();
        yazılımcı1.setAd("Şeyma");
        yazılımcı1.setSoyad("Ozkan");
        yazılımcı1.setId(4);
        yazılımcı1.setDiller("Java");
        yazılımcı1.bilgileriGoster();

        Yazılımcı yazılımcı2 = new Yazılımcı("Bugra", "Bayram", 5, "JavaScript");
        yazılımcı2.bilgileriGoster();
        yazılımcı2.formatAt("Ubuntu");
    }

    public  void yonticiTest(){
        Yonetici yonetici1 = new Yonetici("Naciye", "Aydın", 7, 15);
        yonetici1.bilgileriGoster();
        yonetici1.zamYap(50);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Calısanlar Projesine Hoşgeldiniz");
            System.out.println("1 : yazılım işlemleri için  1 i tuslayınız");
            System.out.println("2 : yonetic işlemleri için  2 i tuslayınız");
            System.out.println("3 : çıkış için  3 i tuslayınız");
            System.out.println("**********");
            int secim = scanner.nextInt();
            if(secim==3){
                System.out.println("Calışan programından çıkıldı");
                break;
            }
            else if(secim==1){
                System.out.println("Yazılımcı islemlerine hosgeldiniz");
                Yazılımcı yazılımcı= new Yazılımcı("Şeyma","Ozkan",1,"Java");
                while (true){
                    System.out.println("1 : format işlemleri için  1 i tuslayınız");
                    System.out.println("2 : bilgileri gostemek için  2 i tuslayınız");
                    System.out.println("3 : çıkış için  3 i tuslayınız");
                    System.out.println("**********");
                    int yazılımSecimi= scanner.nextInt();
                    if(yazılımSecimi==3){
                        System.out.println("Yazılımcı panelinden çıkıldı");
                        break;
                    }
                    else if(yazılımSecimi ==1){
                        System.out.println("isletim sistemini yaızınız");
                        String  isletimSistemi = scanner.next();
                        yazılımcı.formatAt(isletimSistemi);
                    }
                   else if(yazılımSecimi ==2){
                        yazılımcı.bilgileriGoster();
                    }
                   else {
                        System.out.println("gecersiz tuslama");
                    }
                }
            }

            else if(secim==2){
                System.out.println("Yonetici islemlerine hosgeldiniz");
                Yonetici yonetici = new Yonetici("Bugra","Bayram",78,16);
                while (true){
                    System.out.println("1 : zam işlemleri için  1 i tuslayınız");
                    System.out.println("2 : bilgileri gostemek için  2 i tuslayınız");
                    System.out.println("3 : çıkış için  3 i tuslayınız");
                    System.out.println("**********");
                    int yoneticiSecimi= scanner.nextInt();
                    if(yoneticiSecimi==3){
                        System.out.println("Yonetici panelinden çıkış yapıldı");
                        break;
                    }
                    else if(yoneticiSecimi ==1){
                        System.out.println("Ne kadar zam yapılacak");
                        int zamMiktarı = scanner.nextInt();
                        yonetici.zamYap(zamMiktarı);
                    }
                    else if(yoneticiSecimi==2){
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("yanlış tuslama");
                    }
                }
            }
            else {
                System.out.println("hatalı tuslama");
            }
        }
    }
}
