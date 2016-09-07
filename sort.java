public class sort
{
   public static void main(String[] args)
   {
      int temp =0;
      int [] array = {88,44,66,55,33,22,11,99,77};  
      for(int j = 0; j < array.length-1;j++)
      {
         for(int i = 0; i < array.length-1; i++)
         {
	if(array[i]>array[i+1])
             {
                 temp=array[i];
                 array[i]=array[i+1];
                 array[i+1]=temp;
             }
         }
      }
      for(int j = 0; j < array.length;j++)
      {
         System.out.print(array[j]+" ");
      }	
   }
}