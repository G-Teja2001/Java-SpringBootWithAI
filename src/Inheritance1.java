class Person {
    String name;
    int age;

    void canSpeak(){
        System.out.println("yes it can speak");
    }

    void canWalk(){
        System.out.println("yes he can work");
    }

}
// Students is child class and Person is parent class
class Students extends Person {

    // canSpeak method is here but not visible okay this is called inherited method

    // overriden method okay
    void canWalk(){
        System.out.println("yes he can work with 2x speed");
    }

    ///  child class specialized method okay.
    void study() {
        System.out.println("Student can read");
    }

}


public class Inheritance1 {

    public static void main(String[] args){
        System.out.println("hi");
        Students st = new Students();
//        System.out.println(st.name);
        st.canSpeak();
        st.study();
    }
}

/*
1)private members never inherited okay.
2)for inheritance in java we use extends keyword.
3) By default every class in java inherit the Object class but if extends any other class then does
not extend the Object class because multiple inheritance not allowed in java

4) a) A child class inherits accessible members (methods & variables) of the parent and may override parent methods to provide its own implementation.
   b) Inheritance gives access to parent methods; overriding is optional and done explicitly by the child.
 */
