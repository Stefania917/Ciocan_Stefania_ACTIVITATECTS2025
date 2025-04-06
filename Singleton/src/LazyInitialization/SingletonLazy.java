package LazyInitialization;

public class SingletonLazy {
    private static SingletonLazy instance;
    //mese

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if(instance == null)
            instance = new SingletonLazy();
        return instance;
    }


}