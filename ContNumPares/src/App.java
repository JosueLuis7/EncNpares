// Josué Luís Pimenta Alecrim
// 1261948087
public class App {

    public static int contarPares(int[] numeros) {
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {

        int[] valores = {10, 15, 22, 33, 40};

        int total = contarPares(valores);

        System.out.println("Quantidade de números pares: " + total);
    }
}