package cn.simon.patters.creational;

public class Singleton {
    private static volatile Singleton instance = null;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance; // To avoid multiple direct reads of the memory
        if (result == null) { // this can be solved applying theDouble-checked locking idiom
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }
}
