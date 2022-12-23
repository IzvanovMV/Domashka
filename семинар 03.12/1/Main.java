
public class Main {

    public static void main(String[] args) 
    {
        System.out.println(nums(15));
    }



    public static StringBuilder nums(int num) 
    {
        StringBuilder str = new StringBuilder();
        if (num > 1) 
        {
            str.append(nums(num-1));
            str.append(" ");
            str.append(num);
        } 
        else
        {
            str.append(1);
        }
        return str;

    }
}

