package metodos;

import javax.swing.JTextArea;

public class resumirVentas extends ArreglosMatrices {

    private final double ventas[][] = {
        {5, 16, 10, 12, 24},
        {40, 55, 10, 11, 18},
        {15, 41, 78, 14, 51},
        {35, 22, 81, 15, 12},
        {50, 12, 71, 10, 20},
        {70, 40, 60, 28, 22},
        {50, 50, 50, 36, 25},
        {40, 70, 40, 11, 20},
        {20, 20, 30, 12, 18},
        {10, 40, 32, 13, 16},
        {50, 3, 24, 15, 82},
        {40, 46, 15, 46, 22}
    };
    private final String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private final String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

    public void verMatriz(JTextArea area){
        mostrarMatriz(area, ventas);
    }
    public void verVentaMenor(JTextArea area) {
        double menor = ventas[0][0];
        int fila = 0, columna = 0;

        Valor resultado = encontrarValorMenor(menor, fila, columna);
        
        area.append("La menor venta realizada es de: $" + resultado.valor + " Día: " + dias[resultado.columna] + " Mes: " + meses[resultado.fila]);
    }

    public void verVentaMayor(JTextArea area) {
        double mayor = ventas[0][0];
        int fila = 0, columna = 0;

        Valor resultado = encontrarValorMayor(mayor, fila, columna);
        
        area.append("La mayor venta realizada es de: $" + resultado.valor + " Día: " + dias[resultado.columna] + " Mes: " + meses[resultado.fila]);
    }
    public void verSumaTodosLosELementos(JTextArea area){
        area.append("La venta total es: "+sumarElementos(ventas, 0, 0));        
    }
    
    double sumaDias[] = new double[5];
    public void verSumaPorDias(JTextArea area){
        sumarColumnas(ventas, sumaDias, 0);
        area.append("Lunes: Martes: Miercoles: Jueves: Viernes: \n");
        mostrarArregloHorizontal(area,sumaDias);
    }

    private Valor encontrarValorMenor(double menor, int fila, int columna) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                // Actualizar el menor valor si se encuentra uno más pequeño
                if (ventas[i][j] < menor) {
                    menor = ventas[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        Valor resultado = new Valor(menor, fila, columna);
        return resultado;
    }

    private Valor encontrarValorMayor(double mayor, int fila, int columna) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                // Actualizar el mayor valor si se encuentra uno más grande
                if (ventas[i][j] > mayor) {
                    mayor = ventas[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        Valor resultado = new Valor(mayor, fila, columna);
        return resultado;
    }
    private double sumarElementos(double[][] arreglo, int fila, int columna) {
        // Caso base: Si hemos recorrido todas las filas
        if (fila == arreglo.length) {
            return 0;
        }

        // Caso: Si hemos llegado al final de la columna actual, pasamos a la siguiente fila
        if (columna == arreglo[fila].length) {
            return sumarElementos(arreglo, fila + 1, 0);
        }

        // Sumar el valor actual y hacer la llamada recursiva al siguiente elemento de la columna
        return arreglo[fila][columna] + sumarElementos(arreglo, fila, columna + 1);
    }
}
