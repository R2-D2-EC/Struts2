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
    @Result(name="input", location="/WEB-INF/content/login.jsp")
})

public class ValidateUserAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String user; 
    private String password;

    @Override
    @Action("validateUser")
    public String execute(){
        
        if("Arturo".equals(this.user) && "$W044{passwd}".equals(this.password)){
            
            addActionMessage(getText("valid.user"));
            
            return SUCCESS;
        }else{
            return INPUT;
        }
    }
    
    @Override
    public void validate(){
        
        if(this.user == null || "".equals(this.user.trim())){
            
            addFieldError("user", getText("user.value.required"));
            
        }else if(!isValidUser()){
            addActionError(getText("invalid.user"));
        }
        
        if(this.password == null || "".equals(this.password.trim())){
        
            addFieldError("password", getText("password.value.required"));
        
        }else if (this.password.length() < 3){
            
            addFieldError("password", getText("val.pass.min.len"));
            
        }
    }
    
    private boolean isValidUser(){
        return "Arturo".equals(this.user) && "$W044{passwd}".equals(this.password);
    }
    
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
   
}
