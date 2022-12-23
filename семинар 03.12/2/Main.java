
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) 
    {
        
        int[] integerIntegerList = new int[100000000];
        Random randElement = new Random();


        for (int i = 0; i < IntegerList.length; i++) 
        {
            IntegerList[i] = randElement.nextInt();
        }


        Arrays.sort(IntegerList);

        long start = System.currentTimeMillis();
        System.out.println(perebor(IntegerList, 2000));
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Перебор занял " + elapsed);

        
        start = System.currentTimeMillis();
        System.out.println(binaryRecursive(IntegerList, 2000, 0, IntegerList.length));
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Двоичный поиск занял " + elapsed);
    }




    public static boolean perebor(int[] list, int element) 
    {
        for (int j : list) 
        {
            if (element == j) 
            {
                return true;
            }
        }
        return false;
    }




    public static int binaryRecursive(int[] list, int element, int low, int high) 
    {
        int middle = low  + ((high - low) / 2);


        if (high < low) 
        {
            return -1;
        }

        if (element == list[middle]) 
        {
            return middle;
        } 

        else if (element < list[middle]) 
        {
            return binaryRecursive(list, element, low, middle - 1);
        } 
    
        else 
        {
            return binaryRecursive(list, element, middle + 1, high);
        }
    }
}

