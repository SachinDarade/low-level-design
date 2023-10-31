package abstractclass;

public class FatPerson extends Person {
    public FatPerson(String n, Integer a) {     // We can either have this constructor or can use the default no args constructor directly
        super(n, a);
    }

    @Override
    public void burp() {    // Need to override this method because it was abstract
        System.out.println("Fat " + getName() + " burped loudly");
    }

    public String getName() {   // We can either override this method or use from super like getAge()
        return "Another name";
    }
}
