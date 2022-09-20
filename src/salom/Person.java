package salom;

public abstract class Person {

    public static String name;
    public  String surname;

    public static  void info() {

       int s;
        name = "PersonJon"; // bu to'gri

//        surname = "Alishev"; // bu xato.
        // Static metoddan classning static o'zgaruvchilarini ishlatish mumkin.

        detail(); // bu to'g'ri

//        test(); // bu xato
        // static metoddan faqat static metodlar chaqirilishi mumkin
    }

    public static void  detail(){
        //
    }

    public   abstract  void  test();{
        info();

        //
    }
}
