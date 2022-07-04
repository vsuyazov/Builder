public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Неверный формат возраста");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) throw new IllegalStateException("Недостаточно данных");
        Person person;
        if (age != 0)
            person = new Person(name, surname, age);
        else person = new Person(name, surname);

        person.setAddress(address);

        return person;
    }
}
