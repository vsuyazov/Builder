public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Екатерина")
                .setSurname("Романова")
                .setAge(33)
                .setAddress("Санкт-Петербург")
                .build();

        System.out.println(mom);
        System.out.println(mom.getAdress());
        mom.setAddress("Москва");
        mom.happyBirthday();
        System.out.println(mom);

        Person daughter = mom.newChildBuilder()
                .setName("Елизавета")
                .build();

        System.out.println(daughter);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
