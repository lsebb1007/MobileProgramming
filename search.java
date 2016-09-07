public class search
{

   public static void main(String[] args)
   {
      int [] array = {1,2,3,4,5,6,7,8,9,10,22,33,44,55,66,77,88};
      int first=0;
      int last=array.length-1;
      int mid = (first+last)/2;
      int find = 10;
      while(first<=last)
      {
         if(array[mid]>find)
         {
            last = mid-1;
            mid = (first+last)/2;
         }
         else if(array[mid]<find)
         {
            first = mid+1;
            mid = (first+last)/2;
         }  
         else
         {      
            break;
         }
      }
      if(array[mid]==find)
      {
         System.out.println("Find!");
      }
      else if(array[mid]!=find)
      {
         System.out.println("Fail!");
      }
   }
}