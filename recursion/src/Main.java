public class Main {
    public static void main(String[] args) {

        Nrecursion nrecursion = new Nrecursion();

        int recursion = nrecursion.recursionSum(10);
        System.out.println("Recursão N = "+ recursion);

        int recursionSumNatural = nrecursion.recursionSumNatural(20);
        System.out.println("Recursão natural = "+recursionSumNatural);

        int recursionKN = nrecursion.recursionKN(6, 3);
        System.out.println("Recursão KN = "+recursionKN);

    }
}