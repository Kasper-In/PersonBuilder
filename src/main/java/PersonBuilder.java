public class PersonBuilder {

    private String name;
    private String surname;
    private int age = -1;
    private String city = null;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname){
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age){
        if (age < 0) {
            throw new IllegalStateException("Возраст не может быть отрицательным!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city){
        this.city = city;
        return this;
    }

    public Person build(){
        if (this.name == null || this.surname == null){
            throw new IllegalStateException("Имя и фамилия должны быть указаны обязательно");
        }
        return new Person(this.name, this.surname, this.age, this.city);
    }

}
