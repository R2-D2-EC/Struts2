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
        
        log.info("Executing 'execute' method from struts, and name=" + user);
        
        if("Arturo".equals(this.user) && "$W044{passwd}".equals(this.password)){
            return SUCCESS;
        }else{
            return INPUT;
        }
    }
    
}