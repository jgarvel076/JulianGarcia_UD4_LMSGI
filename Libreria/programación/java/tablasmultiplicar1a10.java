public class tablasmultiplicar1a10 {
    public static void main(String[] arg) {
        int N = 10;
        for(int i=1; i<=N; i++){
            System.out.println("tabla"+i);
            for(int j=1; j<=N; j++)
                System.out.println("El resultado es:" + j * i);
        }
    }
}
