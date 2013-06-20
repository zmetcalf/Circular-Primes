public class CircularPrimesTest
{
    public static void main(String[] args)
    {
        CircularPrimes circPrime = new CircularPrimes(1000000);
        circPrime.findCirclePrimes();
        circPrime.printAnswer();
    }
}
