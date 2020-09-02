class Solution {
    
    public int countNegativeRowRec(int grid[][],int row,int start,int end)
    {
        if(start>=end)
        {
            return 0;
        }
        
        int mid=(start+end)/2;
        int midV=grid[row][mid]
        if(midV<0)
        {
            return (end-mid)+countNegativeRowRec(grid,row,start,mid);
        }
        else{
            return countNegativeRowRec(grid,row,mid+1,end);
        }   
        
    }
    
    public int countNegativeRec(int grid[][],int startRow,int endRow,int start,int end)
    {
        if(startRow>=endRow)
        {
            return 0;
        }
        int midRow=(startRow+endRow)/2;
        int countNeg=countNegativeRowRec(grid,midRow,start,end);
        int midPoint=end-countNeg;
        int lowerCount=countNeg*(endRow-midRow);
        
        return ( lowerCount+countNegativeRec(grid,startRow,midRow,midPoint,end)+
            countNegativeRec(grid,midRow+1,endRow,start,midPoint));
        
        
        
        
    }
    
    
    public int countNegatives(int[][] grid) {
        return countNegativesRec(grid,0,grid.length,0,grid[0].length);
    }
}