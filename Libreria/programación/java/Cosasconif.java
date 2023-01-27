public class Cosasconif {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int mayor;
        int menor;

        if (a>=b) {
            System.out.println("A");
        }else{
            System.out.println("B");
        }
        
        mayor = (a>=b)? a:b;
        menor = (a<=b)? b:a;
        
    }

}
