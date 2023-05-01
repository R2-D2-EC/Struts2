package beans.actions;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String user; 
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String execute(){
        
        return SUCCESS;
    }
    
    
    public String getFormTitle(){
        return getText("form.title");
    }
   
    public String getFormUser(){
        return getText("form.user");
    }
    
    
    public String getFormPassword(){
        return getText("form.password");
    }
    
    
    public String getFormButton(){
        return getText("form.button");
    }
    
    public String getFormValues(){
        return getText("form.values");
    }
    
}


