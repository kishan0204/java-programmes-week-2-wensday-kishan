package javaprogrammesweek2;

/*
 *Write a java programme using following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 declare one static method.
 * 3.4 call both instance and static variable into both instance and static methods inside the print statement.
 * 3.4 Declare the main methods.
 *3.6 Call both instance and static method into the main method and run the programme.
 */
public class Programme_3 {
    //3.1 Declare one instance and one static variable.
    String name = "prime";
    static String surname = "Testing";

    //3.2 Declare one instance method.
    ////3.4 Call both instance and static variables into both instance and static methods inside the print statement.

    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme_3.surname);
    }
    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.

    public static void staticMethod() {
        Programme_3 programme_3 = new Programme_3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }

    //3.5 Declare the main method.
    //3.6 Call instance and static methods into the main method and run the programme.
    public static void main(String[] args) {
        Programme_3 programme_3 = new Programme_3();
        programme_3.instanceMethod();
        staticMethod();
    }

}
