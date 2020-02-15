public class Main
{
  public static void main (String[]args)
  {
    int rows=3;
    int columns=3;
    
    int arr[][] = new int[rows][columns];
    
    int c=1;
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            arr[i][j]=c;
            c++;
        }
    }

    printBorder(arr);
    
  }

  public static void printBorder (int arr[][])
  {
    int lr = arr[0].length;
    int lc = arr.length;
    
    if(lc==1 && lr==1){
        System.out.print(arr[0][0]);
        return;
    }
    
    for (int i = 0; i < lr - 1; i++)
      {
	    System.out.print (arr[0][i]);
	    System.out.print(' ');
      }


    for (int i = 0; i < lc - 1; i++)
      {
	    System.out.print (arr[i][lr - 1]);
	    System.out.print(' ');
      }

    for (int i = lc - 1; i > 0; i--)
      {
	    System.out.print (arr[lr - 1][i]);
	    System.out.print(' ');
      }

    for (int i = lr - 1; i > 0; i--)
      {
	   System.out.print (arr[i][0]);
	   System.out.print(' ');
      }
    
    
    int new_arr[][] = new int [lr-2][lc-2];
   
    int x=0;
    int y=0;
    for(int i=1;i<lr-1;i++){
        for(int j=1;j<lc-1;j++){
            new_arr[x][y] = arr[i][j];
            y++;
        }
        x++;
        y=0;
    }
    if(lr-2==0 || lc-2==0)
        return;
    printBorder(new_arr);
  }
}
