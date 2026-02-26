package ExceptionHandling;

public class Exception2 {

     public static void main(String[] args){
         System.out.println("hi");
         try{
             // Compiler is thinking like it might be taking time can cause issue please handle it.
             Thread.sleep(40);   // this is checked exception means compiler is telling this line of code might be casuing issue please handle it.
         }
         catch(Exception e){
             System.out.println("exception occured");
         }
     }
}

/*

🔵 What is a Checked Exception?
A checked exception is:
An exception that compiler forces you to handle.
If you don’t handle it, code won’t compile.


| Feature                  | Checked Exception | Unchecked Exception  |
| ------------------------ | ----------------- | -------------------- |
| Checked at compile time? | ✅ Yes             | ❌ No                 |
| Must handle?             | ✅ Yes             | ❌ No                 |
| When happens?            | Runtime           | Runtime              |
| Caused by?               | External problems | Programming mistakes |
| Example                  | IOException       | NullPointerException |


 */
