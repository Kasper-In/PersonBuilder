public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;


    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() { return age >= 0; }
    public boolean hasAddress() { return city != null; }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
            System.out.println("C Днем Рождения, " + name + "! Исполнилось " + age);
        } else {
            System.out.println("Возраст неизвестен. День Рождение не отпразднуешь (((");
        }
    }

    public void setCity(String city) { this.city = city; }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(4)
                .setCity(this.city);
    }

    @Override
    public String toString() {
        return name + " " + surname + ", возраст: " + (hasAge() ? age : "неизвестен") + ", город: " + (hasAddress() ? city : "неизвестен");
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getAge() { return age; }
    public String getCity() { return city; }
}
