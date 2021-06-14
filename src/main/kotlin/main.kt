package me.suncatmc.tapes

import me.suncatmc.tapes.data.structures.MutableSymbol
import me.suncatmc.tapes.data.structures.Symbol

fun main(args: Array<String>) {
    val test = MutableSymbol(60)
    test += Symbol(9)
    println(test)
}