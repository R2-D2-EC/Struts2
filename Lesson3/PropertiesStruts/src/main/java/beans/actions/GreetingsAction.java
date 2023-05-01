package beans.actions;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class GreetingsAction  extends ActionSupport{
    
    Logger log = LogManager.getLogger(GreetingsAction.class);
    
    private static final String GREETING = "Hello ";
    
    private String name;
    private String customGreeting;
    

    @Override
    public String execute(){
        
        log.info("Executing 'execute' method from struts, and name=" + name);
        String nameNull = name != null ? name : "stranger";
        setCustomGreeting(GREETING + nameNull);
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
      
    
    public String getTitle(){
        return getText("collector.title");
    }
    
    public String getHeading(){
        return getText("collector.heading");
    }
    
    public String getSubmitted(){
        return getText("collector.submitted");
    }
    
    public String getButton(){
        return getText("collector.button");
    }
}
