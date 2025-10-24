package poo.estatico.atividade2;

import java.util.Random;

public class Aplicacao {
    public static void main(String[] args) {
        Random rand = new Random();
        
        System.out.println(MathUtility.add(rand.nextInt(10), rand.nextInt(10)));
        System.out.println(MathUtility.add(rand.nextInt(10), rand.nextInt(10)));
        System.out.println(MathUtility.add(rand.nextInt(10), rand.nextInt(10)));
        System.out.println(MathUtility.add(rand.nextInt(10), rand.nextInt(10)));
        System.out.println(MathUtility.add(rand.nextInt(10), rand.nextInt(10)));
    }
    
}
