public class Lista {

    private int size;
    private int capacity;
    private Object[] elements;

    public Lista(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    private void aumenteListaSeNecessario(){
        if (this.size == this.capacity) {
            Object[] newElements = new Object[capacity*=2];
            for(int i = 0; i < size; i++) newElements[i] = this.elements[i];
            this.elements = newElements;
            
        }
    }

    public void mostrarLIsta(){
        for (int i = 0; i < this.size; i++) {
            System.out.print(" " + elements[i]);
        }
        System.out.println();
    }

    public void add(Object element){
        aumenteListaSeNecessario();
        this.elements[size] = element;
        this.size++;
    }

    public void add(int index, Object element) {
        if (index < 0 || index > this.size) throw new IndexOutOfBoundsException("Index indefinido");
        for(int i = this.size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }    

        this.elements[index] = element;
        this.size++;
    }

    public int size(){
        if(this.size == 0) return -1;
        return this.size;
    }
}
