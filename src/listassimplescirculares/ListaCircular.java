/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listassimplescirculares;

/**
 *
 * @author Usuario
 */
public class ListaCircular {

    Nodo cabeza;
    Nodo ultimo;

    public void inserta(Persona p) {

        if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
        } else {
            if (p.getId() < cabeza.getDato().getId()) {
                Nodo aux = new Nodo(p);
                aux.setNext(cabeza);
                cabeza = aux;
                ultimo.setNext(cabeza);
            } else {
                if (ultimo.getDato().getId() < p.getId()) {
                    Nodo aux = new Nodo(p);
                    ultimo.setNext(aux);
                    ultimo = aux;
                    ultimo.setNext(cabeza);
                } else {
                    Nodo aux = cabeza;
                    while (aux.getNext().getDato().getId() < p.getId()) {
                        aux = aux.getNext();
                    }
                    Nodo temporal = new Nodo(p);
                    temporal.setNext(aux.getNext());
                    aux.setNext(temporal);
                }
            }
        }
    }

    public boolean existe(int id) {

        boolean esta = false;

        if (cabeza != null) {
            if (id >= cabeza.getDato().getId() && id <= cabeza.getDato().getId()) {
                Nodo aux = cabeza;

                while (aux != ultimo && aux.getDato().getId() <= id) {
                    aux = aux.getNext();
                }
                esta = (aux.getDato().getId() == id);
            }
        } else {
            System.out.println("La lista está vacía");
        }
        return esta;
    }

    public void modifica(Persona p) {
        if (cabeza != null) {

            if (cabeza != null) {
                if (p.getId() >= cabeza.getDato().getId() && p.getId() <= cabeza.getDato().getId()) {
                    Nodo aux = cabeza;

                    while (aux != ultimo && aux.getDato().getId() <= p.getId()) {
                        aux = aux.getNext();
                    }
                    if (aux.getDato().getId() == p.getId()){
                        aux.getDato().setName(p.getName());
                    }
                }
            }

        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public void elimina(int id){
        if (cabeza != null) {
            if(cabeza.getDato().getId() >= id && ultimo.getDato().getId() <= id){
                if(cabeza.getDato().getId() == id){
                    cabeza.getNext();
                    ultimo.setNext(cabeza);
                } else {
                    Nodo aux = cabeza;
                    while (aux.getNext() != cabeza && aux.getDato().getId() < id){
                        aux = aux.getNext();
                    }
                    
                    if (aux.getDato().getId() == id){
                        if (aux.getNext() == ultimo){
                            ultimo = aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                    }
                }  
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    
    public void extrae(int id){
        Persona p = null ;
        
        if (cabeza != null){
            
            if(cabeza.getDato().getId() <= id && ultimo.getDato().getId() <= id){
                if (cabeza.getDato().getId() == id){
                    p = cabeza.getDato();
                    cabeza = cabeza.getNext();
                    ultimo.setNext(cabeza);
                } else {
                    Nodo aux = cabeza; 
                    while (aux.getNext() != cabeza && aux.getNext().getDato().getId() < id){
                        aux = aux.getNext();
                    }
                    
                    if (aux.getNext().getDato().getId() == id) {
                        p = aux.getNext().getDato();
                        if (aux.getNext() == ultimo){
                            ultimo = aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                    }
                }
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    

    public String toString() {
        String resp = "Lista circular\n\n";

        Nodo aux = cabeza;

        if (aux != null) {
            resp += aux.toString() + "\n";
            aux = aux.getNext();

            while (aux != cabeza) {
                resp += aux.toString() + "\n";
                aux = aux.getNext();
            }
        } else {
            resp += "La lista está vacía";
        }
        return resp;
    }
}
