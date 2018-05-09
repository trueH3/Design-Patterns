package decoratorPlainCode.forms;

public class Main {

    public static void main (String []args){
        Form square = new FormInstance("mySquare");
        System.out.println(square.getForm());

        square = new Border("black", square);
        System.out.println(square.getForm());
    }
}
