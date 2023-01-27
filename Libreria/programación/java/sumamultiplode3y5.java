public class sumamultiplode3y5  {
    public static void main(String[] arg) {
        int N = 5;
        int NUM_MUL2 = 3;
        int NUM_MUL1 = 5;
        int resultado = 0;
        int resultado1 = 0;
        int resultado2 = 0;
        for(int i=1; i<=N; i++){
            resultado1 = NUM_MUL1 * i;
            System.out.println("Los multiplo de 5 son:" + resultado1);
            resultado1 = resultado1 + i; 
        }
        for(int j=1; j<=N; j++){
            resultado2 = NUM_MUL2 * j;
            System.out.println("Los multiplo de 3 son:" + resultado2);
            resultado2 = resultado2 + j;
        }
        
         resultado= resultado1 + resultado2;
            System.out.println("El resultado es="+ resultado);
        
    } 
}
