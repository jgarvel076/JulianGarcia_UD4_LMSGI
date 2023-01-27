public class Numalt {
    public static void main(String[] args) {
        int numSalir= 3;
        int max= 10 ;
        int random= (int)(Math.random()*max);
        while (random!=numSalir){
            random= (int)(Math.random()*max);
            System.out.println("i: "+random);
            if (random==numSalir){
                System.out.println("viva er betih");
            }
        }

    }
}