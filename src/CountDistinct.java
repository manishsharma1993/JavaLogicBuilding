import java.util.HashSet;

public class CountDistinct {
    //your method (parameter)
    //main() array, input from user and pass that to method and return result

    public static int countDistinct(int[] numArray)
    {
        HashSet<Integer> uniqueNumberHashSet = new HashSet<Integer>();
        for(int num: numArray)
        {
           uniqueNumberHashSet.add(num);
        }
        return uniqueNumberHashSet.size();
    }

    public static void main(String[] args)
    {
        int[] numbers = { 1,2,1,3,4,7,2 };
        System.out.println("Unique number count: " +countDistinct(numbers));
    }

}
