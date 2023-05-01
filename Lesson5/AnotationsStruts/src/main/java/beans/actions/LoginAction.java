package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Result(location="/WEB-INF/content/login.jsp")
public class LoginAction extends ActionSupport {
    /*
    @Action("login")
    public String execute(){
        return SUCCESS;
    }*/
    
}