package metodos;

import javax.swing.JTextArea;

public class ArreglosMatrices {

    public void mostrarMatriz(JTextArea area, double arreglo[][]) {
        for (double[] fila : arreglo) {
            for (double valor : fila) {
                area.append(String.format(" [%.2f] ", valor));
            }
            area.append("\n");
        }
    }

    public void mostrarArregloVertical(JTextArea area, double arreglo[]) {
        for (double d : arreglo) {
            area.append(" [" + (double) Math.round(d * 100d) / 100d + "] \n");
        }
    }

    public void mostrarArregloHorizontal(JTextArea area, double arreglo[]) {
        for (double d : arreglo) {
            area.append("[" + (double) Math.round(d * 100d) / 100d + "] ");
        }
    }

    public void sumarColumnas(double matriz[][], double sumaC[], int i) {
        if (i < matriz[0].length) {
            double sumaColumnas = 0;
            sumarColumnasRec(matriz, sumaC, i, 0, sumaColumnas);
            sumarColumnas(matriz, sumaC, i + 1); // Llamada recursiva para la siguiente columna
        }
    }

    private void sumarColumnasRec(double matriz[][], double sumaC[], int i, int j, double sumaColumnas) {
        if (j < matriz.length) {
            sumaColumnas += matriz[j][i];
            sumarColumnasRec(matriz, sumaC, i, j + 1, sumaColumnas); // Llamada recursiva para la siguiente fila
        } else {
            sumaC[i] = sumaColumnas; // Almacenar la suma de la columna
        }
    }

}
