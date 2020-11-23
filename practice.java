public class practice {
    public static void main(String[] args) {
        int[][] a = {{1,2},{1,3}, {6,7,8}, {2,5,9}};
        // System.out.println(rowSum(a, 2));
        System.out.println(colSum(a, 2));
      }
  
      public static int max(int[][] a) {
        int maxValue = a[0][0];
        for (int row = 0; row < a.length; row++ ) {
          // the code a[row].length sets the size for the row's column to loop thru
          // in the event of different sizes of columns this will loop through the size
          // of that column with no issue.
          for (int col = 0; col < a[row].length; col++) {
            if (a[row][col] > maxValue) {
              maxValue = a[row][col];
            }
          }
        }
        return maxValue;
      }
  
      public static int rowSum(int[][] matrix, int row) {
        int sum = 0;
        for(int i = 0; i < matrix[row].length; i++)
        {
            sum += matrix[row][i];
        }
        return sum;
      }
  
      public static int colSum(int[][] matrix, int colNum) {
        int sum = 0;       
        for (int row = 0; row < matrix.length; row++) {
          for (int col = 0; col < matrix[row].length; col++) {
            if (col == colNum) {
              sum += matrix[row][colNum];
              System.out.println(sum); 
            }
          }
        }
        return sum;
      }
      
}
