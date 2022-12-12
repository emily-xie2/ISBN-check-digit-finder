# ISBN-Check-Digit-Finder

ISBN is the International Standard Book Number, which is a special code printed on the books of most countries on earth. The ISBN code consists of 9 digits and a tenth check symbol. This check symbol serves to detect errors if some of the 9 digits are improper, i.e. the ISBN is not valid. The check digit is calculated by multiplying the nine digits by their corresponding weight. The first, leftmost, digit is multiplied by 10, then working from left to right, each successive digit is multiplied by one less than the one before. So the second digit is multiplied by 9, the third by 8, and so on to the last ninth digit which is multiplied by 2. The nine calculated products are added together. The remainder from the division of the resulting weighted sum by 11 is subtracted from 11, to obtain a check symbol.

The goal of this program is to calculate and adds a check symbol to a given 9-digit ISBN code.
Notes:
- The ISBN code may begin with a zero.
- If the check digit is calculated to be 10, then the added check symbol is “X”
