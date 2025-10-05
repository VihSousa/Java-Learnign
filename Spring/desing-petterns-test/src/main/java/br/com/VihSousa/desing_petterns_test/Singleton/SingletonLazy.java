package br.com.VihSousa.desing_petterns_test.Singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() { 
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
