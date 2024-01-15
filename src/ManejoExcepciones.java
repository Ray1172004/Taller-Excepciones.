import java.util.Scanner;

public class ManejoExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = Integer.parseInt(scanner.nextLine());

            // Intentar dividir por cero
            int resultado = 10 / numero;

            // Intentar acceder a un índice inválido en un array
            int[] arreglo = {1, 2, 3};
            System.out.println("Elemento en la posición 5: " + arreglo[4]);

            // Intentar convertir una cadena a un número
            String cadena = "abc";
            int valor = Integer.parseInt(cadena);

        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de índice de array: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error de formato numérico: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Otro tipo de excepción: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre, haya o no haya excepciones.");
            scanner.close();
        }
    }
}
