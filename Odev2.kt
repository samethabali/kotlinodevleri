package com.samethabali.kotlinexample
import java.lang.IllegalArgumentException

class Odev2 {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    fun dikdortgenCevresi(kenar1: Double, kenar2: Double): Double {
        if (kenar1 < 0 || kenar2 < 0) {
            throw IllegalArgumentException("Dikdörtgen kenar uzunlukları negatif olamaz.")
        }
        return 2 * (kenar1 + kenar2)
    }

    fun faktoriyel(sayi: Int): Long {
        if (sayi < 0) {
            throw IllegalArgumentException("Faktöriyel hesaplanacak sayı negatif olamaz (girilen: $sayi).")
        }
        if (sayi == 0) {
            return 1L
        }

        var sonuc: Long = 1L
        for (i in 1..sayi) {
            try {
                sonuc *= i
            } catch (e: ArithmeticException) {
                throw ArithmeticException("Faktöriyel hesaplaması Long tipinin sınırlarını aştı: $sayi!")
            }
        }
        return sonuc
    }

    fun aHarfiSayaci(kelime: String): Int {

        return kelime.count { it == 'a' }
    }
}
    fun main() {
        val cozumler = Odev2()

        println("--- Ödev 2 Fonksiyon Testleri ---")
        val derece = 100.0
        val fahrenheit = cozumler.celsiusToFahrenheit(derece)
        println("1. $derece°C = $fahrenheit°F")


        val k1 = 5.5
        val k2 = 10.0
        val cevre = cozumler.dikdortgenCevresi(k1, k2)
        println("2. Kenarları $k1 ve $k2 olan dikdörtgenin çevresi: $cevre") // Örnek: 31.0


        val sayi1 = 5
        val fak1 = cozumler.faktoriyel(sayi1)
        println("3. $sayi1! = $fak1")

        val sayi2 = 10
        val fak2 = cozumler.faktoriyel(sayi2)
        println("3. $sayi2! = $fak2")

        val sayi3 = 0
        val fak3 = cozumler.faktoriyel(sayi3)
        println("3. $sayi3! = $fak3")

        try {
            val sayiNegatif = -4
            cozumler.faktoriyel(sayiNegatif)
        } catch (e: IllegalArgumentException) {
            println("3. Faktöriyel hatası (beklenen): ${e.message}")
        }
        val metin1 = "Ankara'dan Adana'ya arabayla aktarma."
        val aSayisi1 = cozumler.aHarfiSayaci(metin1)
        println("4. '$metin1' içinde $aSayisi1 adet 'a' harfi var.")

        val metin2 = "Bu cümlede hiç yok."
        val aSayisi2 = cozumler.aHarfiSayaci(metin2)
        println("4. '$metin2' içinde $aSayisi2 adet 'a' harfi var.")
    }