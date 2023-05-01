package beans.actions;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
    @Result(name="success", location="/WEB-INF/content/welcome.jsp"),
    @Result(name="input", location="login",type="redirectAction")
})
public class ValidateUserAction extends ActionSupport {
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String user;
    private String password;
    
    @Action("validateUser")
    @Override
    public String execute(){
        if("Arturo".equals(this.user) && "$W044{passwd}".equals(this.password)){
            return SUCCESS;
        }else{
            return INPUT;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String usuario) {
        this.user = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
