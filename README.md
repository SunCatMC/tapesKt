# Tapes all the way down.kt
Interpreter for an esolang language Tapes all the way down
This esolang's code consists of a series of infinite tapes stacked on top of each other

## Features:
* each line of code defines a tape
* all values that were not initiated within the code start at 69
* all of the tapes (excluding output tape) are executed till the 69 value is reached, going left to right top to bottom
* output tape is always the lowest one, and starts empty (filled with 69). You don't get to change that.
* position pointer points to index of the tape below current one, and the index is kept when execution moves to the lower tape (but the tape that it points to changes)

### list of valid symbols on the tape:
* numbers
* space
* letters (case insensitive])
* everything else printable within ASCII
* end-of-tape (signified in code as `#`, use `\#` to save actual "#")

### notes about symbols:
* 69 readable symbols, end-of-tape (`#`) is value 69
* all other symbols are ignored.
* if a line of code for a tape doesn't end on `#`, it continues onto the next line
* to save "#" onto a tape, use `\#`
* to save "\\" onto a tape, use `\\`

### list of commands:
* `>`,`<` - move tape position to the right/left
* `>n`, `<n` - move tape by n steps (defined as a symbol value)
* `^` - store a value: copy current value into memory cell
* `v` - stamp a value: copy current value into tape below current one into the same position
* `+`,`-`,`/`,`*`,`%` - modify tape in place using memory cell as second argument
* `[]` - loops code inside until memory cell holds 0 (almost like in b\*\*\*\*fuck)
* `o` - output current state of the output tape (with line break), starting from current position
* `i` - put line of input into tape below, starting from current position

comments can be written either after `#`, or after `\`

### output notes:
* if output tape holds any value above 69 or below 0, it gets capped via performing unsigned mod 69 of the value
* exactly 69 ends printing of the tape
