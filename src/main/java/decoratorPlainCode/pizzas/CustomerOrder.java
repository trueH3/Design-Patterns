package decoratorPlainCode.pizzas;

public class CustomerOrder {

    public static void main (String []args){

        Order fourSeasonsPizza = new Pizza("Four Seasons Pizza", 10);
        fourSeasonsPizza = new RegularExtra("Pepperoni", 4, fourSeasonsPizza);
        fourSeasonsPizza = new DoubleExtra("Mozzarella", 2, fourSeasonsPizza);
        fourSeasonsPizza = new NoCostExtra("Chili", fourSeasonsPizza);

        System.out.println(fourSeasonsPizza.getPrice());
        System.out.println(fourSeasonsPizza.getLabel());
    }
}
