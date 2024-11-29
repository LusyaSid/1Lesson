public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(
                "Макаров Денис Петрович",
                "инженер",
                "Makarov@mail.ru",
                "+7768543567",
                5000,
                28);
        person1.printInfo();
        System.out.println("ДАЛЕЕ МАССИВ");



        Person[] persons = new Person[4];
        persons[0] = new Person("Королёва Светлана Васильевна", "бухгалтер", "Koroleva@mail.com", "+7 734 89 02", 75000, 34);
        persons[1] = new Person("Поляков Сергей Петрович", "инженер", "Polyakov@mail.com", "+7 986 45 60 ", 90000, 39);
        persons[2] = new Person("Мороз Игорь Иванович", "Мастер", "Moroz@mail.com", "+7 934 87 90", 70000, 32);
        persons[3] = new Person("Светлая Королина Андреевна", "менеджер", "SvetlayaKoroleva@mail.com", "+7 945 09 34", 87000, 28);

        for (Person person : persons) {

            person.printInfo();
        }
    }


}




