/*
final class Uni {

}

// final class can not be inherited okay
class Clg extends Uni {

}
 */

class MTS {
   public static final float PI = 3.14f;

   final void display(){

   }
}

class MTSExam extends MTS {

  void print(){
      System.out.println(PI);
  }

  // can not override becasue it is final method okay
//  void display(){
//
//  }
}


public class FinalKeyword {

    public static void main(String[] args) {
        MTS mts = new MTSExam();
        mts.display();
    }
}

/*

🏆 How To Explain To Students (Simple Line)
You can say:
“final means STOP – no further change allowed.”
final variable → stop changing value
final method → stop overriding, but inheritence is allowed okay
final class → stop inheritance

 */
