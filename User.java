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
public class User {
    private String user_id;
    private String Password;
    private Boolean login_status = false ;
    
    User(String user_id)
    {
        this.user_id = user_id ;
    }
    
    public void Setuser_id(String user_id)
    {
        this.user_id = user_id ;
    }
    public void SetPassword(String Password)
    {
        this.Password = Password ;
    }
    public void Setlogin_status(Boolean login_status)
    {
        this.login_status = true ;
    }
    
    //Get mehod
    
    public String Getuser_id()
    {
        return user_id;
    }
      
    public String GetPassword()
    {
        return Password;
    }
    //Test Login 
    public String verify_login()
    {
        if(login_status){
            return "berhasil login";
        }
        return "coba lagi";
    }
    
}
