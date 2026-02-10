class Birdd {
    String name = "Default";
    String color;
}

class FlyingBird extends Birdd {
    String name = "peacock";
}

public class Inhertance2 {
    public static void main(String[] args){
       Birdd bird = new FlyingBird();
       System.out.println(((FlyingBird) bird).name);
    }
}
