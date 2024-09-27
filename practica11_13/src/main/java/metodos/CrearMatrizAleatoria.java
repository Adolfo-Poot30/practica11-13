package metodos;

import java.util.Random;
import javax.swing.JTextArea;

public class CrearMatrizAleatoria extends ArreglosMatrices {

    private Random random = new Random();
    private double matrizAleatoria[][] = new double[5][10];
    private double A[] = new double[5];  //suma de filas
    private double B[] = new double[5];  //promedio de filas
    private double C[] = new double[10]; //suma de columnas
    private double D[] = new double[10]; //promedio de columnas

    public void generaMatrizAleatoria() {
        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                matrizAleatoria[i][j] = random.nextDouble() * 100.0;
            }
        }

        sumar(matrizAleatoria, A, C);
        promediar(matrizAleatoria, A, C, B, D);
    }

    public void imprimirMatriz(JTextArea area) {
        area.setText("\n \n");
        mostrarMatriz(area, matrizAleatoria);
    }

    public void imprimirSumaFilas(JTextArea area) {
        area.append("\nSuma FIlas: \n");
        mostrarArregloVertical(area, A);
    }

    public void imprimirPromedioFilas(JTextArea area) {
        area.append("\nPromedio FIlas: \n");
        mostrarArregloVertical(area, B);
    }

    public void imprimirSumaColumnas(JTextArea area) {
        area.append("Suma columnas: \n");
        mostrarArregloHorizontal(area, C);
    }

    public void imprimirPromedioColumnas(JTextArea area) {
        area.append("\n \nPromedio columnas: \n");
        mostrarArregloHorizontal(area, D);
    }

    //sumas por filas y columnas
    private void sumar(double matriz[][], double sumaF[], double sumaC[]) {
        // Iniciar la recursión para la suma de filas
        sumarFilas(matriz, sumaF, 0);
        // Iniciar la recursión para la suma de columnas
        sumarColumnas(matriz, sumaC, 0);
    }

    private void sumarFilas(double matriz[][], double sumaF[], int i) {
        if (i < matriz.length) {
            double sumaFilas = 0;
            sumarFilasRec(matriz, sumaF, i, 0, sumaFilas);
            sumarFilas(matriz, sumaF, i + 1); // Llamada recursiva para la siguiente fila
        }
    }

    private void sumarFilasRec(double matriz[][], double sumaF[], int i, int j, double sumaFilas) {
        if (j < matriz[0].length) {
            sumaFilas += matriz[i][j];
            sumarFilasRec(matriz, sumaF, i, j + 1, sumaFilas); // Llamada recursiva para la siguiente columna
        } else {
            sumaF[i] = sumaFilas; // Almacenar la suma de la fila
        }
    }

    //promedio por filas y columnas
    private void promediar(double matriz[][], double sumaF[], double sumaC[], double promedioF[], double promedioC[]) {
        // Iniciar la recursión para calcular el promedio de filas
        calcularPromedioFilas(sumaF, promedioF, 0, matriz[0].length);
        // Iniciar la recursión para calcular el promedio de columnas
        calcularPromedioColumnas(sumaC, promedioC, 0, matriz.length);
    }

    private void calcularPromedioFilas(double sumaF[], double promedioF[], int i, int numColumnas) {
        if (i < sumaF.length) {
            promedioF[i] = sumaF[i] / numColumnas; // Calcular el promedio de la fila
            calcularPromedioFilas(sumaF, promedioF, i + 1, numColumnas); // Llamada recursiva para la siguiente fila
        }
    }

    private void calcularPromedioColumnas(double sumaC[], double promedioC[], int j, int numFilas) {
        if (j < sumaC.length) {
            promedioC[j] = sumaC[j] / numFilas; // Calcular el promedio de la columna
            calcularPromedioColumnas(sumaC, promedioC, j + 1, numFilas); // Llamada recursiva para la siguiente columna
        }
    }
}
