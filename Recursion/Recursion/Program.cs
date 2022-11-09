class Program
{
    static void Main(string[] args)
    {

        // Test: 
        Console.WriteLine("Rekursive Lösung");
        Console.WriteLine(RecursiveFactorial(4));
        Console.WriteLine();
        Console.WriteLine(IterativeFactroial(4));

    }


    public static int RecursiveFactorial(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }
        else
        {
            return n * RecursiveFactorial(n - 1);
        }
    }

    public static String IterativeFactroial(int n)
    {   
        int sum = 1;
        while(n > 1)
        {
            sum = sum * n;
            n--;
        }
        return "Iterative Lösung " + sum;
    }
}