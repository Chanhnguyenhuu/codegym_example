package SS05_Access_modifier_static_method_static_property.Thuc_hanh;

public class Student {

    private int rollno;
    private String name;
    private static String college = "BBDIT";

     Student(int r, String n) {
         rollno = r;
         name = n;
     }

     static void change() {
         college = "CODEGYM";
     }

     void display() {
         System.out.println(rollno + " " + name + " " + college);
     }
}
