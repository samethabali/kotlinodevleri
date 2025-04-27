package com.samethabali.kotlinexample
import java.util.Date

class PersonData {
    val sehirad: String = "Konya"
    val ulke: String = "TURKIYE"
    var telefon: String = "444 1 444"
    var postaKodu: String = "34378"
    var email: String = "example@example.com"
    var meslek: String = "Marangoz"
    var stokMiktari: Int = 4200
    var urunYorumu: String = "Magnifik"
    var musteriAdi: String = "Volkan"
    var bakiye: Double = 128.000
    var dogumGunu: String = "01.29.2005"
    var maas: Double = 45.000
    val medeniDurum: String = "Ecele Kadar Bekar"
    var odemeTarihi: Date? =java.sql.Date.valueOf("2010-10-10")
    var odeme: Double = 4206.34
    var siparisAdeti: Int = 100
    val arabaModeli: String = "MX-5"
    var kitapAdi: String = "Olasılıksız"
    var yayinlamaTarihi: Date? = java.sql.Date.valueOf("2005-01-29")
    var indirimMiktari: Double = 120.021
    var odaSayisi: Int = 4
    var enlem: Int = 36
    var boylam: Int = 26
    var urunAdi: String = "Dodik"
    var yemekFiyati: Double = 255.50
    val marka: String = "Mazda"
    var muzikAdi: String = "Я Скажу"
    var videoSuresi: Double = 2.54
    var urunPuani: Int = 5
    val resimAdi: String = "Cenacolo"
    var dosyaformati: String = "PDF"
    var renk: String = "Kırmızı"
    val renkkodu: String = "255.255.225"
    var telefonmodeli: String = "Nokia"
    var ekranboyutu: Double = 13.5
    var agirlik: Int = 78
    val ulusalgun: String = "23 Nisan"
    var tatilgunu: Date? = java.sql.Date.valueOf("2025-01-29")
    val rezdate:Date? = java.sql.Date.valueOf("2025-06-08")
    var sokakadi: String="Candostum sk"
    val otobushatti: String="19F"
    var kalandk: Int= 5
    val takipkodu: Int= 420634
    var kuponsure: Int= 126
    var kuponkodu: Int=424134681
    val faturadres:String="candostum sk no9 evdeyokuz"
}

    fun main() {
        val personData = PersonData()

        println("şehir: ${personData.sehirad}")
        println("ülke: ${personData.ulke}")
        println("telefon: ${personData.telefon}")
        println("posta kodu: ${personData.postaKodu}")
        println("email: ${personData.email}")
        println("meslek: ${personData.meslek}")
        println("stok miktarı: ${personData.stokMiktari}")
        println("müşteri adı: ${personData.musteriAdi}")
        println("bakiye: ${personData.bakiye}")
        println("doğum günü: ${personData.dogumGunu}")
        println("maaş: ${personData.maas}")
    }

