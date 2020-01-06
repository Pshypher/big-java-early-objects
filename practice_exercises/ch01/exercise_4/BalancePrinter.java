public class BalancePrinter
{
    public static void main(String[] args)
    {
        System.out.println(1000 * 0.05 + 1000);
        System.out.println((1000 * 0.05 + 1000) * 0.05 + (1000 * 0.05 + 1000));
        System.out.println(((1000 * 0.05 + 1000) * 0.05 + (1000 * 0.05 + 1000)) * 0.05 +
                ((1000 * 0.05 + 1000) * 0.05 + (1000 * 0.05 + 1000)));
    }
}
