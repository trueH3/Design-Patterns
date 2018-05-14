package InterceptorEE.usingCDI;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Secure
public class SimpleBean {

    public String simpleBeanMessage (){

        return "This is message from SimpleBean";
    }
}
