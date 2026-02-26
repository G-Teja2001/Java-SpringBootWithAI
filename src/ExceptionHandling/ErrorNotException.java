package ExceptionHandling;

public class ErrorNotException {

    public static void test(){
        test();
    }

    public static void main(String[] args){

           test();
    }
}

/*
🧠 Important Concept
StackOverflowError is NOT an Exception.
It is an Error.

🧠 Very Important Rule
👉 Handle Exceptions
👉 Fix Errors

Never design code to handle Errors.

| Exception                   | Error                     |
| --------------------------- | ------------------------- |
| Recoverable                 | Serious system problem    |
| Can handle safely           | Usually should NOT handle |
| Caused by application logic | Caused by JVM / system    |
 */