//Java Solution

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            row = reverse(row);
        }
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = A[i][j] == 1 ? 0 : 1;
            }
        }
        
        return A;
    }
    
    public int[] reverse(int[] row) {
        int left = 0;
        int right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left++] = row[right];
            row[right--] = temp;
        }
        
        return row;
    }
}