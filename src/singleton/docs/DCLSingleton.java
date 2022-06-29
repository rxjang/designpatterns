package singleton.docs;

import singleton.Singleton;

public class DCLSingleton {

    private volatile static DCLSingleton uniqueInstance;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DCLSingleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }

}
