package sample;

/**
 * Created by Akado on 29/11/2017.
 */
public class Árbol {
    public Nodo nodo;

    public boolean IsLeft() {
        if (!nodo.getIzq().equals(null)) {
            return true;
        } else {
            return false;
        }
    }

    public  boolean Isright(){
        if(!nodo.getDer().equals(null)){
            return true;
        } else {
            return false;
        }
    }




    public static void preOrden(Nodo raiz) {
        if(raiz != null) {
            System.out.print("| "+raiz.getRaiz()+" ");
            preOrden(raiz.getIzq());
            preOrden(raiz.getDer());
        }
    }


    public static void InOrden(Nodo raiz) {
        if (raiz != null) {
            InOrden(raiz.getIzq());
            System.out.print("| " +raiz.getRaiz()+" ");
            InOrden(raiz.getDer());
        }
    }
    public static void PostOrden(Nodo raiz) {
        if (raiz != null) {
            PostOrden(raiz.getIzq());
            PostOrden(raiz.getDer());
            System.out.print("| "+raiz.getRaiz()+" ");
        }
    }
}