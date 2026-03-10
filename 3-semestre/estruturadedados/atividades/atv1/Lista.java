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

    public void get(){
        for (int i = 0; i < this.size; i++) {
            System.out.println(elements[i]);
        }
        
    }

    public boolean isEmpyt(){
        return (this.size == 0);
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

    public int indexOf(Object elemt) {
        for (int i = 0; i < this.size; i++) {
            if(elements[i].equals(elemt)){
                return i;
            }
        }
        return -1;
    }

    public Object get(int index) {
        if (index < 0 || index > this.size - 1) throw new IndexOutOfBoundsException("Index="+index + "eSize=" + this.size);
        return elements[index];
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }

    public Object remove(int index){
        Object removed = elements[index];
        
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null; 
        size--;
        return removed;
    }

    public boolean remove(Object elemnt){
        
        return true;
    }
}
