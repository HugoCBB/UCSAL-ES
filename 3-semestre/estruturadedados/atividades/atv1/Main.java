
public class Main {
    public static void main(String[] args) {
        Lista li  = new Lista(1);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.mostrarLIsta();
        System.out.println("==========");
        
        li.add(4, 0);
        li.mostrarLIsta();

        
    }    
}
