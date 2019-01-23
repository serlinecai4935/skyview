public class skyview {
    public skyview (int numRows,int numCols, double[]scanned) {
       view = new double [numRows][numCols];
       int k = 0;

       for (int r=0; r<numRows; r++){
           if(r%2 == 0){
               for (int c=0; c<numCols; c++){
                   view[r][c]=scanned [k];
                   k++;
               }
           }
           else{
               for (int c=numCols-1; c>=0; c--){
                   view[r][c]=scanned[k];
                   k++;
               }
           }
       }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        int width = endCol-startCol+1;
        int height= endRow-startRow+1;
        int numValues= width*height;
        int sum=0;

        for (int r=startRow; r<=endRow; r++){
            for (int c=startCol; c<=endCol; c++){
                sum+=view[r][c];
            }
        }
        return sum/numValues;
    }
}
