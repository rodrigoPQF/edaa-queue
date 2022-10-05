import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent;

public class Main{
//    Construa um programa que leia n  caracteres digitados pelo usuário,
//    até que o mesmo  pressione a tecla “enter”, e os atribua a uma fila de
//    caracteres conforme forem letras maiúsculas e  minúsculas, fila 1 e fila 2,
//    respectivamente
//    No final  retire o conteúdo de cada fila mostrando-os na tela.


    public static void main(String [] args){

        Queue queu = new Queue(6);
        boolean cont = false;
        Scanner scan = new Scanner(System.in);
        while (!cont){
            System.out.println("DIGITE UM CARACTER: \nPara sair digite 0: ");
            char leter = scan.next().charAt(0);

            if(leter == '0'){
                cont = true;
            }
            queu.push(leter);
        }

        while (!queu.isEmpty()){
            char x = queu.pop();
            System.out.println("Retirei o elemento " + x);
        }


    }
}
