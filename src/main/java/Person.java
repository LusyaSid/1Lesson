public class Person {
    String fio;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Person(String fio,String position,String email,String phoneNumber, int salary, int age){
        this.fio=fio;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }
    public void printInfo (){
        System.out.println("ФИО:"+fio);
        System.out.println("Должность:"+position);
        System.out.println("Email:"+email);
        System.out.println("Телефон:"+phoneNumber);
        System.out.println("Зарплата:"+salary+"р");
        System.out.println("Возраст:"+age);
        System.out.println();

    }

}
