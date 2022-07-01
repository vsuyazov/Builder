public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    public String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAdress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        if (hasAdress())
            return address;
        else return "Адрес неизвестен";
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public void happyBirthday() {
        if (hasAge())
            age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(1)
                .setAddress(address);
    }

    @Override
    public String toString() {
        if (!hasAge() && !hasAdress())
            return "name: " + name +
                    " surname: " + surname;
        else if (!hasAdress()) return
                "name: " + name +
                        " surname: " + surname +
                        " age: " + age;
        else if (!hasAge()) return
                "name: " + name +
                        " surname: " + surname +
                        " address: " + address;
        else return
                    "name: " + name +
                            " surname: " + surname +
                            " age: " + age +
                            " address: " + address;
    }
}
