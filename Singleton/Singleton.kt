

// Singleton in Java
//public class SingletonDemo {
//    private volatile static SingletonDemo INSTANCE;
//    
//    private SingletonDemo(){}
//    
//    public static SingletonDemo getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new SingletonDemo();
//        }
//        return INSTANCE;
//    }
//}

// Singleton in Kotlin

public class Singleton private constructor() {
    init { 
    // define in constructor
    }    

    private object Holder { val INSTANCE = Singleton() }

    companion object {
        @JvmStatic
        fun getInstance(): Singleton{
          return Holder.INSTANCE
        }
    }
}


object SingletonDemo{
    fun singleton(){
           println("Singleton")
    }
}