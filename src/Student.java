public abstract class Student {
    String name;
    private Student()
        {
            System.out.println("Salom bu constructor");
        }
      Student (String personName){
        this();
        name=personName;
//        System.out.println("djshdsj");
    }


}
