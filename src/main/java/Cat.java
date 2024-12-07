public class Cat extends Animal {
    static int catCount = 0;
    boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name +" "+"пробежал"+" "+ distance+"m");
        } else {
            System.out.println(name +" "+ "Не пробежал");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name +" "+ "Не умеет плавать");
    }

    public void checkHunger(){
        if (isFull){
            System.out.println(name+" "+"сыт");
        }else {
            System.out.println(name+" "+"голоден");
        }
    }

    public void eat(FoodBowl bowl) {
        if (bowl.getAmountFood() >= 25 && !isFull) {
            System.out.println(name+" "+"Покушал");
            bowl.removeFood(25);
            isFull = true;
        } else if(isFull){
            System.out.println(name+" "+"уже сыт");
        }else{
            System.out.println(name+" "+"еды нет");
        }
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }
}
