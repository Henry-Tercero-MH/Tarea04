import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
/*
Inversa de una palabra.
Implemente una clase en Java que tenga un método que reciba una palabra y devuelva
su inversa (por ejemplo: OBMURREDESODOT-> TODOSEDERRUMBO). Utilice una pila de caracteres para
implementar la solución.
 */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
//declaraciones:
        String palabra="OBMURREDESODOT";
        Stack <Character> pila = new Stack<>();
        boolean salir = true;
while (salir){//ciclo para el menu
    System.out.println("Ingrese una palabra");
    palabra=entrada.nextLine();
    for (int i=0;i<palabra.length();i++){//con este for descompusimos la palabra caracter por caracter
        pila.push(palabra.charAt(i));//agregamos a la pila cada caracter que se recorrio
    }
    String palabraInvertida ="";
    while (!pila.isEmpty()) {
        palabraInvertida = palabraInvertida+pila.pop();
    }
    System.out.println("Palabra invertida: " + palabraInvertida);
    System.out.println("Desea Ingresar otra palabra S/N");
    String respuesta = entrada.nextLine().toLowerCase();
    if (respuesta.charAt(0)=='n'){
        salir = false;
    }

}
}

}




