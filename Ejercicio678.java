import java.io.*;
import java.util.*;


// En este primero ejercicio creamos un método al que le pasamos un variable String y el mismo nos la retorna al revés.
public class Ejercicio678 {

    public static void main(String[] args) {
        System.out.println("Resultado cadena Al reves :");
        System.out.println(reverse("Hola mundo"));
        
    }
    public static  String reverse(String texto){

        String cadenaInvertida = "";
        for (int i=texto.length()-1;i>=0;i--) {
            cadenaInvertida = cadenaInvertida + texto.charAt(i);
        }


        return cadenaInvertida;
    }

}
// Creamos un array unidimensional lo recorremos e imprimimos el contenido.
class Array{
    public static void main(String[] args) {
        String cadena[] = {"jorge","Juan","Pedro","Pepe","Adrian"};

        System.out.println("Resultado punto 1 : ");

        for (String nombres : cadena) {
            System.out.println(nombres);
        }
    }
}
//Creamos un array Bidimensional lo recorremos y mostramos las posiciones , y el contenido de cada elemento.
class ArrayBi {
    public static void main(String[] args) {
        int enteros[][]  = new int[3][4];

        enteros[0][0]=2;
        enteros[0][1]=4;
        enteros[0][2]=6;
        enteros[0][3]=8;

        enteros[1][0]=10;
        enteros[1][1]=12;
        enteros[1][2]=14;
        enteros[1][3]=16;

        enteros[2][0]=18;
        enteros[2][1]=20;
        enteros[2][2]=22;
        enteros[2][3]=24;

        System.out.println("Reultado punto 2: ");
        for (int i = 0; i < enteros.length; i++) {

            for (int j = 0; j < enteros[i].length; j++) {

                System.out.println("en la fila "+ i + " columna " + j);
                System.out.println("esta en numero: " +enteros[i][j]);
            }
        }
    }
    }

    // Creamos un vector de 5  elementos , le indicamos que elimine 2  elementos específicos e imprimo el resultado y el punto 4 es la explicaion del problema de usar un vector por defecto.
    class vector{
        public static void main(String[] args) {
            Vector<String> animales = new Vector();

            animales.add("Leon");
            animales.add("Pantera");
            animales.add("Mono");
            animales.add("Cocodrilo");
            animales.add("Tortuga");

            animales.remove(3);
            animales.remove(2);

            System.out.println("Resultado punto 3:");
            System.out.println(animales);
            System.out.println("Resultado punto 4 :");
            System.out.println("El problema de utilizar un vector con la capacidad por defecto es que si se tienen muchos elementos para ser añadidos, el vector se duplica cada vez que se llena y no es eficiente para el programa");
        }
}

//Creamos un ArrayList de String lo copiamos  a una LinkedList  e imprimo el contenido. Al siguiente punto
//Cremamos otro ArrayList pero de int lo llenamos con un bucle del 1 al 10. Lo recorremos y eliminamos los números pares, volvemos a recorrer el ArrayList para imprimir el resultado final.
class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> autos = new ArrayList<>();
        autos.add("Peugeot");
        autos.add("Chevrolet");
        autos.add("Toyota");
        autos.add("Fiat");
        System.out.println("Resultado punto 5:");

        for (String list : autos) {
            System.out.println(list);
        }
        System.out.println("------");
        LinkedList<String> copia = new LinkedList<String>(autos);

        for (String list : copia) {
        }
        System.out.println(copia);


        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0;  i < 10; i++) {
            numeros.add(i);
        }

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
        System.out.println("--------");
        System.out.println("Resultado del punto 6:");

        for (int i = 0; i < numeros.size(); i++) {

        }
        System.out.println(numeros);
    }
}

// Creamos una función para dividir por 0, y hacemos generar una excepción para usar el throws, el try y el catch


class FuncionError{
    public static void main(String[] args) {
        try {
            DividePorCero();
        }catch (ArithmeticException e){
            System.out.println("Resultado punto 7 :");
            System.out.println("Esto no se puede hacerse");
            System.out.println("Demo de codigo");
        }
    }

    public static void DividePorCero() throws ArithmeticException{
        int a = 0;
        int b=0;
        int resultado= a/b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero a evalutar:");
        a = leer.nextInt();
        System.out.println("Ingreso el segundo numero a evaluar:");
        b = leer.nextInt();

        System.out.println("Resultado punto 7 :");
        System.out.println("El resultado es:" + resultado);
        System.out.println("Demo de codigo");

    }

}

// Creamos una función que reciba 2 parámetros,  para que copie el contenido de un archivo a otro utilzando InputStream  y PrintStream

     class CopiarArchivo {
         public static void main(String[] args) throws IOException {
            CopiarArchivo c = new CopiarArchivo();
            c.copiar("C:\\Users\\onga2\\OneDrive\\Escritorio\\input.txt", "C:\\Users\\onga2\\OneDrive\\Escritorio\\output.txt");


         }

             public void copiar (String fileIn, String fileOut) throws IOException {
               int contenido = 0;
               try {
               InputStream in = new FileInputStream(fileIn);

               PrintStream out = new PrintStream(new FileOutputStream(fileOut));

               while ((contenido != -1)) {
                  out.write(contenido);
                  contenido=in.read();
               }
               in.close();
               out.close();
                   System.out.println("Resultado punto 8:");
                   System.out.println("Archivo Copiado con exito!");
           }catch (IOException e ){
               System.out.println("No se encontro el fichero." +  e.getLocalizedMessage());
           }

             }
         }

//Creamos una función de datos, dentro de esa función hay un ArrayList de nombres y un HashMap con el numero de cada persona y el importe de plata que aporto.
// A continuación usamos InputStream  y PrintStream para esos datos meterlos dentro un archivo previamente creado .

         class Punto9{
             public static void main(String[] args) throws IOException {
                 Punto9 date = new Punto9();
                 date.Datos();
             }


                public void Datos() throws IOException {

                       try {
                           int a;

                           int b;

                           ArrayList<String> persona = new ArrayList<>();
                           persona.add("Jorge");
                           persona.add("Adrian");
                           persona.add("Jonathan");


                           HashMap<Integer, Integer> numeros = new HashMap<>();
                           numeros.put(1, 15800);
                           numeros.put(2, 6800);
                           numeros.put(3, 50900);

                           PrintStream dt = new PrintStream("C:\\Users\\onga2\\OneDrive\\Escritorio\\Datos.txt");
                           InputStream d1 = new ByteArrayInputStream(persona.toString().getBytes());
                           InputStream d2 = new ByteArrayInputStream(numeros.toString().getBytes());

                           dt.println("Nombres de los Contribuyentes: ");

                           while ((a = d1.read()) != -1) {
                               dt.print((char) a);
                           }
                           dt.println();

                           dt.println(" ");

                           dt.println("Aportes de los mismos:");

                           while ((b = d2.read()) != -1) {
                               dt.print((char) b);
                           }
                           dt.println();

                           dt.close();
                           d1.close();
                           d2.close();
                       }catch (IOException e){
                           System.out.println("Error con el archivo " +e.getLocalizedMessage());
                       }

             }




         }
















