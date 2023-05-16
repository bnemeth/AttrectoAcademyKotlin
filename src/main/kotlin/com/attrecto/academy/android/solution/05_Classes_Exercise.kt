package com.attrecto.academy.android.solution

/*
Legyél Te is Excel programozó!!
https://exceltitok.hu/excel-fuggveny/

Készíts "Munkalap" osztályt, amit egy String lista paraméterrel lehet példányosítani.

Készítsd el a "Munkalap" osztály "darabUres" függvényét, ami megszámolja a listában az üres elemeket.
*/

class Munkalap(private val strings: List<String>) {
    fun darabUres() = strings.filter { it.isEmpty() }.count()
}

fun main() {
    val m = Munkalap(listOf("", "Alma", "", "Körte", "Barack"))
    println(m.darabUres())
}
