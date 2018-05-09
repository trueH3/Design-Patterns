package decoratorPlainCode.forms;

public class Border implements Form {

    protected String borderColor;
    protected Form form;

    public Border(String borderColor, Form form) {
        this.borderColor = borderColor;
        this.form = form;
    }

    @Override
    public String getForm() {
        return form.getForm()+", Border Color: "+this.borderColor;
    }
}
