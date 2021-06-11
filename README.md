# Tapes all the way down
An esolang language that consists of a series of infinite tapes stacked on top of each other

## Features:
* all values that were not initiated within the code start at 69
* all of the tapes are executed till the 69 value is reached, going left to right top to bottom
* output tape is always the lowest one, and starts empty (filled with 69)
* position pointer points to index of 2 tapes below current one, and is kept when execution moves to the lower tape

### list of valid symbols on the tape:
* numbers
* space
* letters (case insensitive])
* everything else
* end-of-tape (signified in code as `#`, use `\#` to save actual #)

### notes about symbols:
* 69 readable symbols, `#` is value 69
* all other symbols are ignored.
* if a line of code for a tape doesn't end on `#`, it continues onto the next line
* to save "#" onto a tape, use `\#`
* to save "\" onto a tape, use `\\`

### list of commands:
* `>`,`<` - move tape position to the right/left
* `>n`, `<n` - move tape by n steps (defined as a symbol value)
* `^` - copy value into memory cell
* `v` - copy value into tape below current one into the same position
* `+`,`-`,`/`,`*`,`%` - modify tape in place using memory cell as second argument
* `[]` - loops code inside until memory cell holds 0
* `o` - output current state of the output tape (with line break), starting from current position
* `i` - put line of input into tape below, starting from current position

comments can be written either after `#`, or after `\`

### output notes:
* if output tape holds any value above 69, it gets capped at % 69
* exactly 69 ends printing of the tape
