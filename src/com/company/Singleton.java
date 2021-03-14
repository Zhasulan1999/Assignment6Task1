package com.company;

class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        if(Singleton.instance ==null)
            Singleton.instance =new Singleton();
        return Singleton.instance;
    }
}