public class StringBasic {

    public static void main(String[] args){
        System.out.println("Hi how r u?");
        // if we declare the string using String data type then whatever you are assigning that is immutable
        String name = "Appu";
        String name1 = new String("Appu");
        //name[2] = 'c';  can't directly change the string okay it is immutable
//        String ans = name.concat(" raju");  // original name would not be impacted
        System.out.println(name);


        // now String "Appu" is mutable okay you can change the value
        StringBuilder sb = new StringBuilder("Appu");
        sb.setCharAt(2,'c');
        System.out.println(sb);


        // some important method in string
        String fn = "Appu";
        String s2 = "Appu";
        String text = "I love Java";
        System.out.println(fn.length()); // it returns length of the string
        System.out.println(fn.charAt(0));  // it is used to access the element from the string from particular index
        System.out.println(fn.toUpperCase());
        System.out.println(fn.toLowerCase());

        if(fn.equals(s2)){   // equals is used to compare the values in the string
             System.out.println("value of both the strings are same::");
        }

        if(fn.equalsIgnoreCase(s2)){
            System.out.println("case does not matter okay");
        }

        if(text.contains("love")){
            System.out.println("Yes it is containing the love");
        }

        String substr = fn.substring(0,2);
        System.out.println(substr);
        // many more methods, use according to your requirements
    }
}


// Theory

/*
📌 What is a String?
    A String is just:
    A collection of characters (letters, numbers, symbols).

    In java
    whatever inside the "" is string in java
    eg. "Appu", "", "Car" etc.

    String name = "Appu";   // in this case right hand side is not mutable(immutable)
    name[2]=5; // not allowed

    StringBuilder sb = "Appu";




 */