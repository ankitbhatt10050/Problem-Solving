package Recurrsion;

class Solution {
    
    public static boolean haswon(char[][] gameboard,char player)
    {
       
        for(int i=0;i<3;i++)
        {
            if(gameboard[i][0]==player && 
               gameboard[i][1]==gameboard[i][0] && 
               gameboard[i][2]==gameboard[i][1])
                {
                   
                    return true;
                }
            
            if(gameboard[0][i]==player &&
               gameboard[1][i]==gameboard[0][i] && 
               gameboard[2][i]==gameboard[1][i])
                {
                   
                    return true;
                }
            
              if (player == gameboard[0][0] && 
                gameboard[0][0] == gameboard[1][1] && 
                gameboard[1][1] == gameboard[2][2]) 
              {
               
                return true;
              }
            
            if (player == gameboard[0][2] && 
                gameboard[1][1] == gameboard[0][2] && 
                gameboard[1][1] == gameboard[2][0]) 
            {
                
                return true;
            }
            
            
            
        }
        
        return false;
    }
    

    
    
    public static boolean validTicTacToe(String[] board) {
        char gameboard[][]=new char[3][3];
        for(int i=0;i<3;i++)
        {
            gameboard[i]=board[i].toCharArray();
        }
        
        int numx=0;
        int numo=0;
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                char c=gameboard[i][j];
                if(c=='X')
                { 
                    numx++;
                }
                else if(c=='O')
                {
                  numo++;  
                }                     
            }
        }
        
        int diff=numx-numo;

        if((numx==numo)||(diff==1))
        {
            
            if(haswon(gameboard,'O'))
            {
               
                if(haswon(gameboard,'X'))
                {
                    
                    return false;
                }
                
                return (numx==numo);
            }
            
            
            if(haswon(gameboard,'X') && (diff!=1))
            {   
                
                return false;
            }
            return true;
         }
        return false;
    }


    public static void main(String[] args)
    {
        String [] ttt={"XXX","OOX","OOX"};
        System.out.println(validTicTacToe(ttt));
    }
}