package com.attrecto.academy.android.solution

/*
Legyél Te is Excel programozó!!
https://exceltitok.hu/excel-fuggveny/

Készítsd el a "SZUMHA" függvény megfelelőjét, számold ki egy listában lévő 3-nál nagyobb egész számok összegét
*/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    var result = 0
    numbers.forEach {
        if (it > 3) {
            result += it
        }
    }

    println(result)

    // Aztán persze valaki már megelőzött, ne búsulj most már tényleg nem kell sokat várni hogy készítünk
    // ilyesmi (extension) függvényt is!
    println(numbers.filter { it > 3 }.sum())
}