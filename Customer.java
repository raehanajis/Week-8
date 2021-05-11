/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_beneran;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ASUS
 */
public class Customer extends User{
    
    private String customer_name;
    private String address;
    private String email;
    private HashMap<String, String> CC_info= new HashMap<String,String>();
    private HashMap<String, Integer> shiping_info= new HashMap<String,Integer>();
    
    Customer(String user_id) {
        super(user_id);
    }
    
    //Set
    public void Setcustomer_name(String customer_name)
    {
        this.customer_name = customer_name ;
    }
        
    public void Setaddress(String address)
    {
        this.address = address ;
    }
    
        
    public void Setemail(String email)
    {
        this.email = email ;
    }
    
    //Get
    public String Getcustomer_name()
    {
        return this.customer_name;
    }
    public String Getaddress()
    {
        return this.address;
    }
    public String Getemail()
    {
        return this.email;
    }
    public void bill(){}
    
    public void register(String user_id, String Password)
    {
      Setuser_id(user_id);
      SetPassword(Password);
    }
    
    public void login(boolean login_status)
    {
       Setlogin_status(login_status);
    }
    
    public void update_profile(String user_id, String Password,String customer_name,String address, String email, String CC_info,String shiping_info )
    {
        Setuser_id (user_id);
        SetPassword (Password);
        this.customer_name = customer_name;
        this.address = address ;
        this.email = email;
    }
    //Print Card number bukan valuenya 
    public void update_CC_info(String cardnumber, String validate, String member)
    {
        CC_info.put("Card Number ", cardnumber);
        CC_info.put("Valid Thru  ", validate);
        CC_info.put("Member Since", member);
    }
    //Perulangan untuk menampilkan card credit 
    public void show_CC_Info()
    {
        for(Map.Entry item : CC_info.entrySet())
        {
            System.out.println("   "+item.getKey() + " : "+item.getValue());
        }
    }
    //Print Shiping 
    public void update_shiping_info(Integer subtotal,Integer tax, Integer total)
    {
        
        shiping_info.put("Subtotal", subtotal);
        shiping_info.put("Tax     ", tax);
        shiping_info.put("Total   ", total);
    }
    //Perulangan shiping 
    public void show_shiping_info()
    {
    for(Map.Entry item: shiping_info.entrySet())
        {
            System.out.println("    " + item.getKey() + " : "+ item.getValue());
        }
    }
    //Sesuai Soal
    private int calculate_next_bill_amount()
    {
        return 1;
    }
    //Sesuai Soal
    private void generate_invoice_pdf_version(){ }
    
}
