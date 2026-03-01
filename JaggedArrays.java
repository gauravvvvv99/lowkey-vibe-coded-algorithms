import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
class JaggedArrays 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int row_size=0;
        while(true) 
        {
            try 
            {
                System.out.print("Enter the row size : ");
                row_size=sc.nextInt();
                if (row_size<=0) 
                {
                    System.out.println("Row size must be greater than 0");
                    continue;
                }
                break;
            } 
            catch(InputMismatchException e) 
            {
                System.out.println("Invalid input! Please enter an integer value");
                sc.next();
            }
        }
        int arr[][]=new int[row_size][];
        for(int i=0;i<arr.length;i++) 
        {
            int column_size=0;
            while(true) 
            {
                try 
                {
                    System.out.print("Enter the column size for row "+i+" : ");
                    column_size=sc.nextInt();
                    if (column_size<=0) 
                    {
                        System.out.println("Column size must be greater than 0");
                        continue;
                    }
                    break;
                } 
                    catch(InputMismatchException e) 
                    {
                    System.out.println("Invalid input! Please enter an integer value");
                    sc.next();
                }
            }
            arr[i]=new int[column_size];
            System.out.println("Enter the elements in row "+i);
            for(int j=0;j<arr[i].length;j++) 
            {
                while(true) 
                {
                    try 
                    {
                        arr[i][j]=sc.nextInt();
                        break;
                    } 
                    catch(InputMismatchException e) 
                    {
                        System.out.println("Invalid input! Please enter an integer value");
                        sc.next();
                    }
                }
            }
        }
        System.out.println("\nJagged Array: "+Arrays.deepToString(arr));
        int total_sum=0;
        for (int i=0;i<arr.length;i++)
        {
            int sum = 0;
            for (int j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("Aggregate sum of row "+i+ " : "+sum);
            total_sum+=sum;
        }
        System.out.println("Total sum of all elements : "+total_sum);
        System.out.println("\nWould you like to find an element position inside a matrix ? [Y/N]");
        char choice = sc.next().toUpperCase().charAt(0);
        switch (choice) 
        {
            case 'Y':
                try 
                {
                    System.out.println("Enter the element to search : ");
                    int element=sc.nextInt();
                    boolean status=false;
                    for (int i=0;i<arr.length;i++)
                     {
                        for (int j=0;j<arr[i].length;j++) 
                        {
                            if (element==arr[i][j]) 
                            {
                                status=true;
                                System.out.println("Element found at position : "+i+" , "+j);
                            }
                        }
                    }
                    if(!status)
                    {
                        System.out.println("No such element present inside the matrix");
                    }
                } 
                catch (InputMismatchException e) 
                {
                    System.out.println("Invalid input! Please enter a valid integer");
                }
                break;
            case 'N':
                System.out.println("Program terminated");
                break;
            default:
                System.out.println("Invalid choice! Please enter Y or N");
        }
        sc.close();
    }
}