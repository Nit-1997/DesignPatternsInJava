package com.nitin;


// only 1 instance of the class is created

public class Singleton {

    //static private class instance of the singleton
     private static Singleton obj;

    // private constructor with no args
    private Singleton(){
    }

    // static method that returns a singleton instance if exists else creates one
    public static Singleton getInstance(){
        // only create object if obj is null
        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }

    public static void main(String[] args) {
        Singleton s1  = Singleton.getInstance();
        Singleton s2  = Singleton.getInstance();
        if(s1.hashCode() == s2.hashCode()){
            System.out.println("Same Objects");
        }
    }
}


