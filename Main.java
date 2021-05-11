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
public class Main {
    public static void main(String[] args) {
        //Set User
        User users = new User("Ajis");
        users.SetPassword("123");
        users.Setlogin_status(true);
        
        //Print User
        System.out.println("Inheritance");
        System.out.println("=========================================");
        System.out.println("User ID      = " + users.Getuser_id());
        System.out.println("Password     = " + users.GetPassword());
        System.out.println("Login status = " + users.verify_login());

        //set Customer
        Customer customers = new Customer("Balmond");
        customers.register("Balmond", "Balmond123");
        customers.Setcustomer_name("Balmond2");
        customers.Setaddress("Glogor Carik");
        customers.Setemail("Balmond@gmail.com");
        customers.update_CC_info("32132121312321", "2021-03-01", "21");
        customers.update_shiping_info(500000, 30000,70000);
        customers.Setlogin_status(true);
        
        //Print Customer
        System.out.println("\n=========================================");
        System.out.println("Customer Name = " + customers.Getcustomer_name());
        System.out.println("User ID       = " + customers.Getuser_id());
        System.out.println("Password      = " + customers.GetPassword());
        System.out.println("Login status  = " + customers.verify_login());
        System.out.println("Address       = " + customers.Getaddress());
        System.out.println("Email         = " + customers.Getemail());
        System.out.println("=========================================");
        System.out.println("Credit card info :");
        customers.show_CC_Info();
        System.out.println("=========================================");
        System.out.println("Shipping info :");
        customers.show_shiping_info();
        System.out.println("=========================================\n");
        
        //Set ADMIN
        Admin admins = new Admin("Komang");
        admins.Setadmin_name("Komang Putra");
        admins.Setemail("Komang@gmail.com");
        admins.SetPassword("adm01");
        admins.Setlogin_status(true);
        
        //Print Admin
        System.out.println("User ID      = " + admins.Getuser_id());
        System.out.println("Password     = " + admins.GetPassword());
        System.out.println("Email        = " + admins.Getemail());
        System.out.println("Login status = " + admins.verify_login());
        System.out.println("Admin name   = " + admins.Getadmin_name());
        System.out.println("=========================================");

    }
    
}
