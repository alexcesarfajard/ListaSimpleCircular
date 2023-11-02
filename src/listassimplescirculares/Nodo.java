package listassimplescirculares;

public class Nodo {
    
    private Persona dato;
    private Nodo next;
    
    public Nodo(Persona dato){
        this.dato = dato;
    }
    
    public String toString(){
        return "Nodo {" + " Dato = " + dato + "}";
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
