package ss5_Access_modifier_static_method_static_property.bai_tap;

public class Student {
    private String name;
    private String classe=" C02 ";

    public Student() {
    }
    public Student(String name, String classe) {
        this.name = name;
        this.classe = classe;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classe='" + classe + '\'' +
                '}';
    }
}
