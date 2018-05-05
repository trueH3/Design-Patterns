package factoryMethodPlainCode;

public abstract class DrinksMachine {

    public abstract Drink dispenseDrink ();

    public String displayMessage (){

        System.out.println("Thank for your custom.");
        return "Thank for your custom.";
    }
}
