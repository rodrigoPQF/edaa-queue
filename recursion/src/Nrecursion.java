public class Nrecursion {
    int c = 0;

    public Nrecursion(){
    }
    public int recursionSum(int numero){
        if(numero <= 0){
            return 0;
        }
        return numero + recursionSum(numero - 1);
    }

    public int recursionSumNatural(int numero){
        if(numero <= 1){
            return numero + c;
        }
        c = (numero + c) - (numero - 1);
        System.out.println("Recursão natural = "+c);
        return recursionSumNatural(numero - 1);

    }

    public int recursionKN(int k, int n){
        if (n == 0){
            return 1;
        }

        return k * recursionKN(k , n - 1);
    }
}
