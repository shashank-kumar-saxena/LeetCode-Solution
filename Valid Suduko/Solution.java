/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
    
    for(let i =0; i<board.length;i++){
        let rowMap = {}
        let colMap = {}
        let boxMap = {}
        for(let j=0; j<board[i].length;j++){

            let box = board[3* Math.floor(i/3) +Math.floor(j/3)][3*(i%3)+(j%3)]
            
            if(board[i][j] != '.'){
                if(rowMap[board[i][j]]) return false;
                rowMap[board[i][j]] = 1;
            }
            if(board[j][i] != '.') {
                if(colMap[board[j][i]]) return false;
                colMap[board[j][i]] = 1;
            }
            if(box!= '.'){
                if(boxMap[box]) return false;
                boxMap[box] = 1;
            }
        }
    }
    return true;
};