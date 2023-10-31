package abstractclass;

public abstract class Person {
    private String name;
    private Integer age;

    public Person() {
        this.name = "TestPerson";
        this.age = 55;
    }

    public Person(String n, Integer a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public abstract void burp();
}
