class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        int m=9;

        for(int i=0;i<n;i++){
            int[] freq=new int[10];
            for(int j=0;j<m;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int digit=board[i][j]-'0';
                freq[digit]++;

                if(freq[digit]>1){
                    return false;
                }
            }
        }

        for(int j=0;j<m;j++){
            int[] freq=new int[10];
            for(int i=0;i<n;i++){
                if(board[i][j]=='.'){
                    continue;
                }
                int digit=board[i][j]-'0';
                freq[digit]++;

                if(freq[digit]>1){
                    return false;
                }
            }

        }

        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){
                int[] freq=new int[10];
                for(int i=row;i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]=='.'){
                            continue;
                        }
                        int digit=board[i][j]-'0';
                        freq[digit]++;

                        if(freq[digit]>1){
                            return false;
                        }
                    }
                }
            }
        }

        return true; 
    }
}