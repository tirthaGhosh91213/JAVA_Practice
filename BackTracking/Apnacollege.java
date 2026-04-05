



public class Apnacollege {

  //Back tracking in an array and change the array by -2 

  public static void changeArray(int arr[],int i,int val){
    if(i==arr.length){
      printArr(arr);
      return;
    }
    arr[i]=val;
    changeArray(arr, i+1, val+1);
    arr[i]=arr[i]-2; //backtracking step 
  }


  public static void printArr(int arr[]){
    for(int i=0; i<arr.length ; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

// Find all subset of a string 

  public static void subSets0FString(String str,String res, int i){
    if(i==str.length()){
      if(res.length()==0){
        System.out.println("Null");
        return;
      }
      System.out.println(res);
      return;
    }
    subSets0FString(str, res+str.charAt(i), i+1);
    subSets0FString(str, res, i+1);

  }
// Find all permitation a string 
  public static void permutation(String str, String res){
    if(str.length()==0){
      System.out.println(res);
      return;
    }
    for(int i=0;i<str.length();i++){
      char curr=str.charAt(i);
      String newStr=str.substring(0,i)+str.substring(i+1); // ** Remove element(i) from string 
      permutation(newStr, res+curr);
    }
  }

  //Grid ways problem  (Brout Force)
  public static int gridWays(int i,int j,int n, int m){
    if(i==n-1 && j==m-1){ // Last and base case 
      return 1;
    } else if(i==n-1 || j==n-1){ // corner case 
      return 1;
    }
    int w1=gridWays(i+1, j, n, m);
    int w2=gridWays(i, j+1, n, m);
    return w1+w2;
  }

  public static int factorial(int num){
    int fact=1;
    for(int i=1;i<=num;i++){
      fact*=i;
    }
    return fact;
  }

  // Grid ways optimize solution 
  public static int gridWaysOptimize(int n,int m){
    int totalWays=n-1+m-1;
    int downMove=n-1;
    int rightMOve=m-1;
    return factorial(totalWays)/(factorial(downMove)*factorial(rightMOve));
  }

    public static boolean isTrue(int sudoku[][],int row,int col,int digit){
      for(int i=0;i<=8;i++){
        if(sudoku[i][col]==digit){
          return false;
        }
      }
      for(int j=0;j<=8;j++){
        if(sudoku[row][j]==digit){
          return false;
        }
      }
      int sr=(row/3)*3;
      int sc=(col/3)*3;
      for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
          if(sudoku[i][j]==digit){
            return false;
          }
        }
      }
      return true;
    }

  // Sudoku solving 
  public static boolean sudokuSolver(int sudoku[][],int row,int col){
  
    // Base case 
    if(row==9 ){
      return true;
    }

    // Calculate next column and next row 
    int nextRow=row,nextCol=col+1;
    if(col==8){
      nextRow=row+1;
      nextCol=0;
    }

    // When any digit is already exist in the sudoku .
    if(sudoku[row][col]!=0){
      return sudokuSolver(sudoku, nextRow,nextCol);
    }

    for(int digit=1;digit<=9;digit++){
      if(isTrue(sudoku,row,col,digit)){
        sudoku[row][col]=digit;
        if(sudokuSolver(sudoku, nextRow,nextCol)){
          return true;
        }
        sudoku[row][col]=0;
      }  
    }
    return false;
  }
  public static void printSudoku(int sudoku[][]){
    for(int i=0;i<sudoku.length;i++){
      for(int j=0;j<sudoku.length;j++){
        System.out.print(sudoku[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int arr[]=new int [5];
    String str="abc";
    int[][] sudoku = {
    {5, 3, 0, 0, 7, 0, 0, 0, 0},
    {6, 0, 0, 1, 9, 5, 0, 0, 0},
    {0, 9, 8, 0, 0, 0, 0, 6, 0},
    
    {8, 0, 0, 0, 6, 0, 0, 0, 3},
    {4, 0, 0, 8, 0, 3, 0, 0, 1},
    {7, 0, 0, 0, 2, 0, 0, 0, 6},
    
    {0, 6, 0, 0, 0, 0, 2, 8, 0},
    {0, 0, 0, 4, 1, 9, 0, 0, 5},
    {0, 0, 0, 0, 8, 0, 0, 7, 9}
};
     printArr(arr);
    // changeArray(arr, 0, 1);
    // subSets0FString(str, "", 0);
    // permutation(str, "");
    // System.out.println(gridWays(0, 0, 3, 3));
    // System.out.println(gridWaysOptimize(3, 3));
    if(sudokuSolver(sudoku, 0, 0)==true){
      System.out.println("Solution exist ");
      printSudoku(sudoku);
    }
    else{
      System.out.println("Solution dose not exist");
    }
    
   
  }
}
