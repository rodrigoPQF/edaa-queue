public class Queue {
    int ultimo;
    int primeiro;
    char[] array1;
    char[] upperCase;
    char[] lowCase;
    int total;
    int totalUpper;
    int totalLow;
    int num = 0;
    private int capacity;

    public Queue(int n){
        array1 = new char[n];
        upperCase = new char[n];
        lowCase = new char[n];
        capacity = n;
        primeiro = 0;
        ultimo = 0;
        total = 0;
        num = n;

    }

    public void push(char letter){
        if(total == capacity){
            ensureCapacity(num);
        }
        array1[total] = letter;
        if(Character.isUpperCase(letter)){
            upperCase[totalUpper] = letter;
            totalUpper++;
        }else {
            lowCase[totalLow] = letter;
            totalLow++;
        }
        total++;
    }
    public void ensureCapacity(int minCapacity){
        char temp[] = new char[capacity*minCapacity];
        char tempUp[] = new char[capacity*minCapacity];
        char tempLow[] = new char[capacity*minCapacity];

        for (int i=0; i< capacity; i++){
            temp[i] = array1[i];
            tempUp[i] = upperCase[i];
            tempLow[i] = lowCase[i];
        }
        array1 = temp;
        upperCase = tempUp;
        lowCase = tempLow;
        capacity = capacity * minCapacity;
    }

    public char front(){
        return array1[0];
    }

    public int size(){
        return ultimo;
    }

    public boolean isEmpty(){
        return total == 0;

    }
    public boolean isEmptyLow(){
        return totalLow == 0;

    }
    public boolean isEmptyUpp(){
        return totalUpper == 0;

    }
    public boolean isFull(){
        return total == array1.length;
    }

    public char pop(){
        if(isEmpty()){
            throw new RuntimeException("Fila vazia! ninguem para ser retirado.");
        }
        char elemento = array1[total - 1];
        total--;
        return elemento;

    }
    public char popLow(){
        if(isEmptyLow()){
            throw new RuntimeException("Fila vazia! ninguem para ser retirado.");
        }
        char elemento = lowCase[totalLow - 1];
        totalLow--;
        return elemento;

    }
    public char popUp(){
        if(isEmptyUpp()){
            throw new RuntimeException("Fila vazia! ninguem para ser retirado.");
        }
        char elemento = upperCase[totalUpper - 1];
        totalUpper--;
        return elemento;

    }
}
