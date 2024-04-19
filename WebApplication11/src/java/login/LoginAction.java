/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author anany
 */
public class LoginAction extends ActionSupport{
    String name;
    public String getName(){
        return name;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public String execute(){
        if(name=="me")
            return "success";
        else
            return "error";
    }
    
}
