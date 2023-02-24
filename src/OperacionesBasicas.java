public class OperacionesBasicas {

        private static float resultado;
        static final int SUMA=1;
        static final int RESTA=2;
        static final int MULTIPLICACION=3;
        static final int DIVISION=4;
    static final int RAIZ=6;

    static final int RAIZCUBICA=7;

    /**
     * @param device --> operación a realizar (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)
     * @param num1 --> primer numero de la operación
     * @param num2 --> segundo numero de la operación (divisor en caso de division)
     * @return resultado o null en caso de fallo.
     */




        public static float operacions(int device, float num1, float num2){
            switch (device){
                case SUMA:
                    try{
                        resultado=num1+num2;
                    }catch (Exception e){
                        System.out.println("Error");
                    }
                    break;

                case RESTA:
                    try{
                        resultado=num1-num2;
                    }catch (Exception e){
                        System.out.println("Error");
                    }
                    break;
                case MULTIPLICACION:
                    try{
                        resultado=num1*num2;
                    }catch (Exception e){
                        System.out.println("Error");
                    }
                    break;
                case DIVISION:
                    try{
                        resultado=num1/num2;
                    }catch (Exception e){
                        System.out.println("Error");
                    }
                    /**
                     * Examen
                     * Usamos o num1 para facer a raiz cuadrada
                     */

                case RAIZ:
                    try{
                        resultado= (float) Math.sqrt(num1);
                    }catch (Exception e){
                        System.out.println("Error");
                    }

                    /**
                     * Usamos o num2 para facer a raiz cubica
                     */
                case RAIZCUBICA:
                    try{
                        resultado= (float) Math.cbrt(num2);
                    }catch (Exception e){
                        System.out.println("Error");
                    }
            }
            return resultado;
        }

}
