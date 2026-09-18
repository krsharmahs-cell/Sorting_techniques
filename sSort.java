import java.util.Scanner;



public class sSort{
    public static class selection_sort
    {
        public selection_sort(int [] arr)
        {
            sort(arr);
        }

        public void sort(int [] arr)
        {
            for (int i = 0; i < arr.length - 1; i++)
            {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[j] < arr[minIndex])
                    {
                        minIndex = j;
                    }
                }

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int [] arr = new int [size];
        for(int i=0; i < size ; i++)
        {
            arr[i]=s.nextInt();
        }
        selection_sort sort = new selection_sort(arr);
        System.out.print("Sorted array is: ");
        for(int i=0; i < size ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}