package br.com.VihSousa.desing_petterns_test.Singleton;

public class SingletonLazyHolder {

    private SingletonLazyHolder() {
        super();
    }

    private static class Holder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.INSTANCE;
    }

}
