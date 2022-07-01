public class PersonBuilder {

    public String name;
    public String surname;
    public int age;
    public String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (age < 0) throw new IllegalArgumentException("Неверный формат возраста");
        if (name == null || surname == null) throw new IllegalStateException("Недостаточно данных");
        Person person;
        if (age != 0)
            person = new Person(name, surname, age);
        else person = new Person(name, surname);

        person.setAddress(address);

        return person;
    }
}
