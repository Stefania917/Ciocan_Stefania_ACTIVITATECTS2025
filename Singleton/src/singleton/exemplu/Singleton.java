package singleton.exemplu;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance = null;

    //blocuri statice
    //initalizare statica
    //se executa o singura data inainte de clasa
    //doar exemplificare
    static{
        System.out.println("Inainte de a incarca clasa");
    }
//initializare
    //vedem cand se executa fiecare bloc
    //inainte de fiecare constuctor
    {
        System.out.println("Inainte de creare obiecte");
    }

    //constructor privat
    //masura de siguranta suplimentara
    private Singleton() throws  Exception{
        if(instance!=null)
            throw new Exception("Singleton deja creat! ");
    }

    //metoda publica statica
    public static synchronized Singleton getInstance() throws Exception{
        if( instance == null) {
            instance = new Singleton();
        }
        return  instance;
    }
    //Pentru deserializare singleton
    private Object readResolve() throws Exception {
        return  Singleton.getInstance();
    }
}
