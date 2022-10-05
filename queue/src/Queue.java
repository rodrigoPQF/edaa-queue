public class Queue {
    int ultimo;
    int primeiro;
    char[] array1;
    int total;
    int num = 0;
    private int capacity;

    public Queue(int n){
        array1 = new char[n];
        capacity = n;
        primeiro = 0;
        ultimo = 0;
        total = 0;
        num = n;

    }

    public void push(char letter){

        System.out.println(total);
        if(total == capacity){
            ensureCapacity(num);
        }
        array1[total] = letter;
        total++;
    }
    public void ensureCapacity(int minCapacity){
        char temp[] = new char[capacity*minCapacity];
        for (int i=0; i< capacity; i++){
            temp[i] = array1[i];
        }
        array1 = temp;
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
}
