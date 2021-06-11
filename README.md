# Tapes all the way down
An esolang language that consists of a series of tapes stacked on top of each other

all out of bounds values are equal to 69

all of the tapes are executed till the 69 value is reached, going left to right top to bottom

output tape is always the lowest one, and starts empty (filled with 69)

list of valid symbols on the tape:
* numbers
* space
* letters (case insensitive])
* everything else
* end-of-tape (signified in code as `#`, use `\#` to save actual #)

69 readable symbols, `#` is value 69

list of commands:
* `>`,`<` - move tape position to the right/left
* `>n`, `<n` - move tape by n steps (defined as a symbol value)
* `^` - copy value into memory cell
* `v` - copy value into tape below current one into the same position
* `+`,`-`,`/`,`*`,`%` - modify tape in place using memory cell as second argument
* `[]` - loops code inside until memory cell holds 0
* `o` - output current state of the output tape (with line break), starting from current position
* `i` - put line of input into tape below, starting from current position

if output tape holds value above 69, it gets capped at % 69
exactly 69 ends printing of the tape
