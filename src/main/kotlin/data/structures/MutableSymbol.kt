package me.suncatmc.tapes.data.structures

class MutableSymbol : Symbol {
    constructor(value: Int) : super(value)
    constructor(ch: Char?) : super(ch)

    override var value = super.value
        private set

    operator fun plusAssign(sym: Symbol) {
        value += sym.value
    }

    operator fun minusAssign(sym: Symbol) {
        value -= sym.value
    }

    operator fun timesAssign(sym: Symbol) {
        value *= sym.value
    }

    operator fun divAssign(sym: Symbol) {
        value /= sym.value
    }

    operator fun remAssign(sym: Symbol) {
        value %= sym.value
    }
}