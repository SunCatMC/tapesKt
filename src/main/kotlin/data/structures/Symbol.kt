package me.suncatmc.tapes.data.structures

open class Symbol(open val value: Int) {

    constructor(ch: Char?) : this(charToSymbolValue(ch)!!)

    override fun toString(): String {
        val ch = symbolValueToChar(value)
        return ch?.toString() ?: "[#]"
    }

    companion object {
        protected val charList = ('0'..'9').toMutableList().apply {
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
                in charList -> {
                    charList.indexOf(ch)
                }
                else -> {
                    null
                }
            }
        }

        fun symbolValueToChar(n: Int): Char? {
            val newN = when (n) {
                charList.size -> {
                    null
                }
                in charList.indices -> {
                    n
                }
                else -> {
                    n % 69 + (if (n < 0) charList.size else 0)
                }
            }
            return if (newN == null) null else charList[newN]
        }
    }
}