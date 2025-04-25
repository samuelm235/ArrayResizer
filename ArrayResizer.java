public class ArrayResizer
{

public static boolean isNonZeroRow(int[][] array2D, int r)
{
     for(int i : array2D[r])
     {
        if(i== 0)return false;
     }
     return true;

}


public static int numNonZeroRows(int[][] array2D)
{ 
   int k = 0;
   for(int i = 0; i < array2D.length; i++)
   {
   if(isNonZeroRow(array2D, i)) k ++;
   }
   return k;
}


public static int[][] resize(int[][] array2D)
{ 
   int nonzero = numNonZeroRows(array2D);
   int[][] smaller = new int[nonzero][array2D[0].length];
   for(int i = 0; i < array2D.length; i++)
   {
      if(isNonZeroRow(array2D, i))
      {
         for(int k : array2D[i])
         {
            smaller[k] = array2D[]
         }
      }
   }
 }
}