package factoryMethodPlainCode;

public class CoffeeMachine extends DrinksMachine {

    @Override
    public Drink dispenseDrink() {
        return new Coffee();
    }
}
