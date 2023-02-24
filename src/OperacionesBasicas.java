public class OperacionesBasicas {

        private static float resultado;
        static final int SUMA=1;
        static final int RESTA=2;
        static final int MULTIPLICACION=3;
        static final int DIVISION=4;
    static final int RAIZ=6;



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
                     * o num1 e o numero a raiz e o num2 e o numero do indice
                     */


                case RAIZ:
                    try{

                        resultado= (float)  Math.pow(num1, 1.0 / num2);

                    }catch (NumberFormatException e){
                        System.out.println("Error");
                    }




            }
            return resultado;
        }

}
