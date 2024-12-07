public class Animal {
    static int animalCount=0;
    protected String name;

    public Animal(String name){
        this.name=name;
        animalCount ++;
    }

    public void swim(int distance){
        System.out.println(name+" "+ distance+"m");
    }

    public void run(int distance){
        System.out.println(name+" "+ distance+"m");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
