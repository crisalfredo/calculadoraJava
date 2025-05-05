import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraUI {
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                int opcion = scanner.nextInt();
                if (opcion == 7) {
                    salir = true;
                    System.out.println("¡Hasta luego!");
                } else {
                    procesar(opcion);
                }
            } catch (InputMismatchException ime) {
                System.out.println("Entrada no válida. Por favor ingresa un número de opción.");
                scanner.next(); // descarta la entrada incorrecta
            }
            System.out.println();
        }
    }

    private void mostrarMenu() {
        System.out.println("=== Calculadora ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.println("7. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private void procesar(int opcion) {
        try {
            Operacion op;
            Numero n1, n2;
            switch (opcion) {
                case 1: // Suma
                    System.out.print("Primer número: ");
                    n1 = new Numero(scanner.nextDouble());
                    System.out.print("Segundo número: ");
                    n2 = new Numero(scanner.nextDouble());
                    op = new Suma(n1, n2);
                    break;
                case 2: // Resta
                    System.out.print("Primer número: ");
                    n1 = new Numero(scanner.nextDouble());
                    System.out.print("Segundo número: ");
                    n2 = new Numero(scanner.nextDouble());
                    op = new Resta(n1, n2);
                    break;
                case 3: // Multiplicación
                    System.out.print("Primer número: ");
                    n1 = new Numero(scanner.nextDouble());
                    System.out.print("Segundo número: ");
                    n2 = new Numero(scanner.nextDouble());
                    op = new Multiplicacion(n1, n2);
                    break;
                case 4: // División
                    System.out.print("Primer número: ");
                    n1 = new Numero(scanner.nextDouble());
                    System.out.print("Segundo número: ");
                    n2 = new Numero(scanner.nextDouble());
                    op = new Division(n1, n2);
                    break;
                case 5: // Potencia
                    System.out.print("Base: ");
                    n1 = new Numero(scanner.nextDouble());
                    System.out.print("Exponente: ");
                    n2 = new Numero(scanner.nextDouble());
                    op = new Potencia(n1, n2);
                    break;
                case 6: // Raíz cuadrada
                    System.out.print("Número: ");
                    n1 = new Numero(scanner.nextDouble());
                    op = new RaizCuadrada(n1);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }
            double resultado = op.ejecutar();
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException ime) {
            System.out.println("Debes ingresar un número válido.");
            scanner.next();
        } catch (ArithmeticException ae) {
            System.out.println("Error en la operación: " + ae.getMessage());
        }
    }

    public static void main(String[] args) {
        new CalculadoraUI().iniciar();
    }
}
