import java.util.Random;

public class Vetores {
    public static void main(String[] args){
        int[] numbers = new int[10];
        Random rand = new Random();
        int aux = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
            System.out.println(numbers[i]);

            if(numbers[i] > aux){
                aux = numbers[i];
            }
        }

        System.out.println("Maior numero do vetor: "+ aux);
    }
}