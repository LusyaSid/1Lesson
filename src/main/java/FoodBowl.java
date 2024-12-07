public class FoodBowl {
    int amountFood;
    public FoodBowl(int weight){
        this.amountFood=weight;
    }

    public int getAmountFood() {
        return amountFood;
    }

    public void addFood(int amount) {
        amountFood += amount;
        System.out.println("добавлено"+" "+amount+"g"+" "+"в миске"+" "+ amountFood+"g");
    }

    public void removeFood(int amount){
        if(amountFood>=amount) {
            amountFood -= amount;
            System.out.println("съедено"+" "+amount+"g"+" "+"в миске"+" "+ amountFood+"g");
        }else {
            System.out.println("недостаточно еды");
        }
    }
}
