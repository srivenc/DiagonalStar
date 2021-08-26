# DiagonalStar
Creates a rectangular set of asterixes based on what number is entered into the method.

Directions:
Write a method named printSquareStar with one parameter of type int named number. 

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).


The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

* In the first or last row

* In the first or last column

* When the row number equals the column number

* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)


Example Input/Ouput: https://pastebin.com/DN75CRJq
