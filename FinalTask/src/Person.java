// describes a person and contains his main characteristics
public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // not used
        this.name = name;
    }

    public String getSurname() { // not used
        return surname;
    }

    public void setSurname(String surname) { // not used
        this.surname = surname;
    }

    public int getAge() { // not used
        return age;
    }

    public void setAge(int age) { // not used
        this.age = age;
    }
}