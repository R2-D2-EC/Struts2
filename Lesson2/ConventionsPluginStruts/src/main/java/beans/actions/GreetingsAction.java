package beans.actions;
import org.apache.logging.log4j.*;

public class GreetingsAction{
    
    Logger log = LogManager.getLogger(GreetingsAction.class);
    
    private static final String GREETING = "Hello ";
    
    private String name;
    private String customGreeting;
    

    public String execute(){
        log.info("Executing 'execute' method from struts, and name=" + name);
        setCustomGreeting(GREETING + getName());
        return "Success";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomGreeting() {
        return customGreeting;
    }

    public void setCustomGreeting(String customGreeting) {
        this.customGreeting = customGreeting;
    }
       
}
