
public class ListaEncadeada {
	
	private ListNode head; // Head aponta para o primeiro item da lista 
	private ListNode tail; // tail aponta para o ultimo item da lista
	private int size;  // Tamanho da lista
	
    
    private class ListNode {
		private Object element;
		private ListNode next;
		
        private ListNode(Object e, ListNode n) {
			element=e; 
		    next=n;
		}
	}
	// Construtores
	public ListaEncadeada () {
		size=0; 
	  	head=tail=null;
	}
	// Métodos
	public int size() {
		return size;
	} 
	public boolean isEmpty() {
	  	return (head==null);        
	}

	public boolean add (Object elem) {
	    ListNode newElement = new ListNode(elem,null);
	    if (head==null)
	         head=newElement;
	    else 
	         tail.next=newElement;
	    tail=newElement;
	    size++;
	    return true;
	}

    
    
	public void clear() {
	    head=tail=null;
	    size=0;
	}
	public void print() {
        if (size==0) 
			System.out.println("<----Lista Vazia---->");			
		else {
			System.out.println("<----Início---->");
			ListNode itr=head;
    		while (itr!=null) {
                System.out.println(itr.element);
                itr=itr.next;
    		}
			System.out.println("<----Fim---->");				
		}
	}
	public Object get (int index) {
	   	if (index<0 || index>size-1)
            throw new IndexOutOfBoundsException("Index="+index+" e Size="+size );
        else {
	 		if (index == 0)
                return head.element;
            ListNode previous=findPrevious(index);   
            return previous.next.element;  			
		}
	}
	private ListNode findPrevious (int index) {
        ListNode itr=head;
		ListNode previous=null;
		for (int i=0;i<index;i++) {
			previous=itr;
			itr=itr.next;
		}
		return previous;
	}
	public int indexOf (Object elem ) {
		ListNode itr=head;
	    for (int i=0;i<size;i++) {
            if (itr.element.equals(elem)) {
	    		return i;
	        }
	        else {
                itr=itr.next;
	        } 
	    }
	    return -1;
	}
        public void add (int index, Object elem){
            if (index<0 || index>size-1) throw new IndexOutOfBoundsException("Index="+index+" e Size="+size );
            ListNode newElement = new ListNode(elem, null);
            
            if(index == 0){
                newElement.next = head;
                head = newElement;
            }
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
    
            newElement.next = current.next;
            current.next = newElement;
        }
    
        public Object remove(int index) {
            if (index<0 || index>size-1) throw new IndexOutOfBoundsException("Index="+index+" e Size="+size );
            Object removed;
    
            if (index == 0) {
                removed = head;
                head = head.next;
            } else {
                ListNode current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
        
                ListNode target = current.next;
                removed = target.element;
                current.next = target.next;
            }
            size--;
            return removed;
        }
    
        public boolean remove(Object elem) {
            if(head.element.equals(elem)) {
                head = head.next;
                size--;
                return true;
            }
    
            ListNode current = head;
            while (current.next != null) { 
                if(current.next.element.equals(elem)){
                    current.next = current.next.next;
                    size--;
                    return true;
                }
                current = current.next;
            }
            return true;
        }
    
        public Object set (int index, Object elem){
            if (index<0 || index>size-1) throw new IndexOutOfBoundsException("Index="+index+" e Size="+size );
            
            if(index == 0){
                head.element = elem;
                return head;
            }
    
            ListNode current = head;
            
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            Object oldElement = current.element;
            current.element = elem;
            return oldElement;
        }
}