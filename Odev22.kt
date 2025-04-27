package com.samethabali.kotlinexample

class Odev22 {
    fun icAcilarToplamiHesapla(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    fun maasHesapla(calisilanGunSayisi: Int): Int {
        val normalCalismaSaati = calisilanGunSayisi * 8
        return if (normalCalismaSaati <= 160) {
            normalCalismaSaati * 10
        } else {
            val mesaiSaati = normalCalismaSaati - 160
            (160 * 10) + (mesaiSaati * 20)
        }
    }
    fun kotaUcretiHesapla(kullanilanKotaGB: Int): Int {
        return if (kullanilanKotaGB <= 50) {
            100
        } else {
            100 + (kullanilanKotaGB - 50) * 4
        }
    }
}
fun main() {
    val odev = Odev22()

    val kenarSayisi = 6
    val icAcilar = odev.icAcilarToplamiHesapla(kenarSayisi)
    println("$kenarSayisi kenarlı bir çokgenin iç açılar toplamı: $icAcilar°")

    val calisilanGun = 22
    val maas = odev.maasHesapla(calisilanGun)
    println("$calisilanGun gün çalışan birinin maaşı: $maas ₺")

    val kullanilanGB = 60
    val kotaUcreti = odev.kotaUcretiHesapla(kullanilanGB)
    println("$kullanilanGB GB kullanan birinin kota ücreti: $kotaUcreti ₺")
}