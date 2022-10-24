public class Main {
    public static void main(String[] args) {

// заполнены все поля
        Person mom = new PersonBuilder()
                .setName("Инна")
                .setSurname("Пацюк")
                .setAge(35)
                .setCity("Калуга")
                .build();
        Person daughter = mom.newChildBuilder()
                .setName("Вика")
                .build();
        System.out.println("У " + mom + " есть дочь, " + daughter);

// празднуем ДР мамы
        mom.happyBirthday();

// заполнены не все поля
        Person sister = new PersonBuilder()
                .setName("Ольга")
                .setSurname("Удалова")
                .build();
        System.out.println("У " + mom + " есть сестра, " + sister);

// празднуем ДР сестры
        sister.happyBirthday();

// не хватает обязательного поля
        try {
            Person dad = new PersonBuilder()
                    .setSurname("Пацюк")
                    .build();
            System.out.println("У " + mom + " есть муж, " + dad);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

// неправильный возраст
        try {
            Person son = new PersonBuilder()
                    .setName("Максим")
                    .setSurname("Пацюк")
                    .setAge(-6)
                    .build();
            System.out.println("У " + mom + " есть сын " + son);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }



}
