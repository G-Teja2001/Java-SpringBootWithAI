package ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandling1 {
     public static void main(String[] args){
         System.out.println("start app");
         int xy;
         int mn;

         Scanner scn = new Scanner(System.in);
         System.out.println("enter numerator");
         int x = scn.nextInt();
         System.out.println("enter denominator");
         int y = scn.nextInt();
         // handle the exception with the help of the try-catch excetpion handler
         try{
             int res = x/y;  // risky code, at run time might be causing issue for x=1 and y=0
             System.out.println("calc:: "+res); // if exception occured non of the the line below line 16 will be executed oaky
         }
         catch(Exception e) {  // exception handler
              System.out.println("Excetion handle"+e);
         }

         System.out.println("End the of the program");
     }
}

/*
Topics that can be covered?
try-catch
throw
throws
finally
try resource
custom exception
checked and unchecked exception
Exception hierarchy

  compile-time-error, run-time-error, exception
  // compile-time-error --> before executing error and it is a syntax error that compiler does not allow to compile.

  | Type               | When It Happens | Can We Fix Before Running? | Real-Life Example                |
| ------------------ | --------------- | -------------------------- | -------------------------------- |
| Compile-time error | Before running  | Yes                        | Form validation error            |
| Runtime error      | During running  | No (unexpected crash)      | Tyre burst while driving         |
| Exception          | During running  | Yes (using try-catch)      | ATM showing insufficient balance |

🧠 Important Interview Point

All exceptions are runtime issues.
But not all runtime errors are handleable.
Example:
OutOfMemoryError → serious runtime error
NullPointerException → exception (can handle)
 */
