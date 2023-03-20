package Clase02ejercicio02y03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

      /*2. Haga una main donde en variable se escriba la ruta de un archivo.
         Ese archivo debe contener números. El programa debe escribir por consola la suma de esos números.
            a. Al programa anterior agreguele un parámetro para que la operación pueda ser suma o multiplicación.
      3. Llamar la función del ejercicio 2 y que por parámetro se pueda elegir si es una
       codificación o decodificación, si suma o multiplica, y 2 archivos, uno para la
       entrada y otro para la salida. Que por pantalla solo indique si terminó o no correctamente,
       los resultados deben estar en el archivo de salida. */

    public static void main(String[] args){
        String archivoEntrada = "src/Clase02ejercicio02y03/archivo.txt"; //19-12-2-7-8-15-3-12-4-9

        char operacion = '+'; // Cambiar para realizar la operación de Sumar '+' y Multiplicar '*'

        if(operacion == '+'){
            suma(archivoEntrada);
        }else {
            multiplicacion(archivoEntrada);
        }
    }

    public static void suma(String archivo){
        int total = 0;

        try {
            for(String linea : Files.readAllLines(Paths.get(archivo))){
                total += Integer.parseInt(linea);
            }
            Files.writeString(Paths.get("src/Clase02ejercicio02y03/suma.txt"),Integer.toString(total));
            System.out.println("Terminó Correctamente...");
        } catch (Exception e){
            System.out.println("No pudo leer el archivo...");
        }


    }

    public static void multiplicacion(String archivo){
        long total;
        total = 1;

        try{
            for(String linea : Files.readAllLines(Paths.get(archivo))){
                total *= Integer.parseInt(linea);
            }
            Files.writeString(Paths.get("src/Clase02ejercicio02y03/multiplicacion.txt"),Long.toString(total));
            System.out.println("Terminó Correctamente...");
        } catch (Exception e){
            System.out.println("No pudo leer el archivo...");
        }

    }
}