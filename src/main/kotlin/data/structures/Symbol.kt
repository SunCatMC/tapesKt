package me.suncatmc.tapes.data.structures

open class Symbol(open val value: Int) {

    constructor(ch: Char?) : this(charToSymbolValue(ch)!!)

    override fun toString(): String {
        val ch = symbolValueToChar(value)
        return ch?.toString() ?: "[#]"
    }

    companion object {
        val supportedCharList = ('0'..'9').toMutableList().apply {
            add(' ')
            addAll('A'..'Z')
            addAll('!'..'/')
            addAll(':'..'@')
            addAll('['..'`')
            addAll('{'..'~')
        }.toList()

        fun charToSymbolValue(ch: Char?): Int? {
            return when (ch) {
                null -> {
                    69
                }
                in supportedCharList -> {
                    supportedCharList.indexOf(ch)
                }
                else -> {
                    null
                }
            }
        }

        fun symbolValueToChar(n: Int): Char? {
            val newN = when (n) {
                supportedCharList.size -> {
                    null
                }
                in supportedCharList.indices -> {
                    n
                }
                else -> {
                    n % 69 + (if (n < 0) supportedCharList.size else 0)
                }
            }
            return if (newN == null) null else supportedCharList[newN]
        }
    }
}