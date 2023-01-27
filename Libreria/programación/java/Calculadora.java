public class Calculadora {
    public static void main(String[] args){
        System.out.println("") ;
            Integer a,b,c ;
            a = 2 ;
            b = 3 ;
            c = 4 ;
            System.out.println((a+b)*c) ;
            Double pot= Math.pow (a,b) ;
            System.out.println (pot);
    }
    final static int MAX = Integer.MAX_VALUE ;
    public static void secondly(String[] args){
        Integer a,b,c;
        a = 2;
        b = 3;
        c = 4;
        System.out.println(MAX);
        Double resultado = Math.max ((double)a, MAX);
        System.out.println(resultado);
    }
}