public class Recursividade {
    public static void main(String[] args) {
        int num = soma(10);
    }
    
    public static int soma(int num) {
        System.out.println(num);
        if (num == 3) {
            return 0;
        }
        return soma(num - 1);

    }

}