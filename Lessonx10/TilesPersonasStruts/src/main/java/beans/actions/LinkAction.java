package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name="bienvenidoResult", location="bienvenidoTile", type="tiles"),
    @Result(name="personasResult", location="personasTile", type="tiles")
})
public class LinkAction extends ActionSupport{
    
    @Action("bienvenidoAction")
    public String bienvenido(){
        return "bienvenidoResult";
    }
    
    @Action("personasAction")
    public String personas(){
        return "personasResult";
    }
}