/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_beneran;

/**
 *
 * @author ASUS
 */
public class Admin extends User {
    private String admin_name;
    private String email;
    
    Admin(String user_id)
    {
        super(user_id);
    }
    
    //Set
    
    public void Setemail(String email)
    {
        this.email = email;
    }
    
        
    public void Setadmin_name(String admin_name)
    {
        this.admin_name = admin_name;
    }
    
    //get
    
    public String Getemail()
    {
        return this.email;
    }
    public String Getadmin_name()
    {
        return this.admin_name;
    }
    
    public void update_catalog(){}
}
