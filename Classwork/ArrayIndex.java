public class ArrayIndex{
    public static int evenIndex(int[] arr){
    `   
        int[] even = new int[(arr.length + 1 )/ 2];
        int count = 0;
        
        for (int index = 0; index < arr.length; index++){
            if (index % 2 == 0){
                even[count] = arr[index];
                count++;
            }
        }
        return even;
    }
} 
