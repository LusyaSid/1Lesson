public class Dog extends Animal{
    static int dogCount=0;

    public Dog(String name){
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance<=500){
            System.out.println(name+" "+"пробежал"+" "+distance+"m");
        }else {
            System.out.println(name+" "+"Не может пробежать");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance<=10){
            System.out.println(name+" "+"проплыл"+" "+distance+"m");
        }else {
            System.out.println(name+" "+ "не может проплыть");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
