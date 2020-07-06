//Objective is to flip an image - reverse every row then invert every tile.

let matrix = 
[[1,0,0],
 [0,1,0],
 [0,0,1]]


//O(n) solution that reverses each row than inverts each tile.

//Reverse each row
for (let i = 0; i < matrix.length; i++) {
    matrix[i] = matrix[i].reverse()
}

//Invert each tile
for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = !matrix[i][j]
    }
}

return matrix