public class Mushroom extends Toppings {
    private  BasePizza  basePizza;
    Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 60;  // extra cost for mushroom
    }
}
