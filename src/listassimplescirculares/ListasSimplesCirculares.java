package listassimplescirculares;

public class ListasSimplesCirculares {

    public static void main(String[] args) {
        // TODO code application logic 
        
        ListaCircular lista = new ListaCircular();
        
        lista.inserta(new Persona(3, "Manuel"));
        lista.inserta(new Persona(2, "Alex"));
        lista.inserta(new Persona(4, "Jose"));
        lista.inserta(new Persona(8, "SOfia"));
        lista.inserta(new Persona(1, "Enrique"));
        lista.inserta(new Persona(6, "Joss"));
        
        System.out.println(lista.toString());
        
        System.out.println(lista.existe(6));
        
    }
    
}
