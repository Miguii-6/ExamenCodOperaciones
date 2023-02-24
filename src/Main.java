public class Main {
    public static void main(String[] args) {
        int opcion;
        Float resultado;
        opcion = EntradaSaida.entradaInt("1 --> Hacer suma\n2 --> Hacer resta\n3 --> Hacer multiplicación\n4 --> Hacer división\n5 --> Saír do programa\n6 --> Hacer raiz cuadrada\n7 --> Hacer raiz cubica");
        if(opcion > 0 && opcion < 5) {
            resultado = OperacionesBasicas.operacions(opcion, EntradaSaida.entradaFloat("Teclee o primer número da operación"), EntradaSaida.entradaFloat("Teclee o segundo número da operación"));
            if (resultado==null){
                EntradaSaida.salida("Error", EntradaSaida.SALIDA_CONSOLA);
            }
            else {
                EntradaSaida.salida(("O resultado da operación é " + resultado), EntradaSaida.SALIDA_WINDOW);
            }
        }
    }
}
