package ss5_Access_modifier_static_method_static_property.bai_tap;

public class Main2 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Phan Van A");
        System.out.println(student.toString());
        student.setName("Phan Van B");
        student.setClasse("B02");
        System.out.println(student.toString());
    }
}
