package com.attrecto.academy.android.lesson

fun main() {
    // Egyszerű for ciklus, kitalálja a típust,
    for (a in 1..100) {
        println(a)
    }

    // Ez a fenti igazából egy bejárható IntRange osztály
    val numbers: IntRange = 1..100
    for (a in numbers) {
        println(a)
    }

    // Sőt, ez a .. pedig igazából egy Int.rangeTo függvény :-D
    // Itt semmi sem az, mint aminek látszik? Melyik olvasható könnyebben?
    val numbers2: IntRange = 1.rangeTo(100)
    for (a in numbers2) {
        println(a)
    }

    // Ez "működik" visszafelé is, csak nem csinál semmit (mert ez üres)
    for (a in 100..1) {
        println(a)
    }

    // Persze néha szeretnénk visszafelé is számolni, ezért
    // helyette van downTo, ami pedig igazából egy IntProgression osztály
    for (a in 100 downTo 1) {
        println(a)
    }

    // Listákat is hasonlóan tudjuk bejárni
    val cities = listOf("Győr", "Budapest", "Tótkomlós")
    for (a in cities) {
        println(a)
    }

    // De így jobban olvasható, ez itt egyébként egy érdekes dolog: a forEach függvény, vagy nyelvi elem?
    cities.forEach {
        println(it)
    }

    // Szintén a jobb olvashatóság miatt átnevezhetjük az it paramétert
    cities.forEach { city ->
        println(city)
    }

    // Elöltesztelős ciklus
    var i = 100
    while (i > 0) {
        println(i)
        i--
    }

    // Hátultesztelős ciklus
    do {
        i++
        println(i)
    } while (i < 100)
}