package decoratorPlainCode.forms;

public class FormInstance implements Form {

    private String formName;

    public FormInstance(String formName) {
        this.formName = formName;
    }

    @Override
    public String getForm() {
        return this.formName;
    }
}
