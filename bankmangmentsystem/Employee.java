/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmangmentsystem;

import java.util.ArrayList;

/**
 *
 * @author Mohamed
 */
public  class  Employee {
    
   Client c = new Client();
    ArrayList<Client> cli = new ArrayList<Client>();
    protected String Em_name;
    protected int Em_Age;
    protected int Em_ID;
    protected String Em_Address;
    protected String Em_Phone;
    protected String Department;
    protected String Branch;
    

    public Employee() {
        
    }

    public Employee(String Em_name, int Em_Age, int Em_ID, String Em_Address, String Em_Phone, String Department,String branch) {
        this.Em_name = Em_name;
        this.Em_Age = Em_Age;
        this.Em_ID = Em_ID;
        this.Em_Address = Em_Address;
        this.Em_Phone = Em_Phone;
        this.Department = Department;
        this.Branch=branch;
    }

    public void setEm_name(String Em_name) {
        this.Em_name = Em_name;
    }

    public void setEm_Age(int Em_Age) {
        this.Em_Age = Em_Age;
    }

    public void setEm_ID(int Em_ID) {
        this.Em_ID = Em_ID;
    }

    public void setEm_Address(String Em_Address) {
        this.Em_Address = Em_Address;
    }

    public void setEm_Phone(String Em_Phone) {
        this.Em_Phone = Em_Phone;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getEm_name() {
        return Em_name;
    }

    public int getEm_Age() {
        return Em_Age;
    }

    public int getEm_ID() {
        return Em_ID;
    }

    public String getEm_Address() {
        return Em_Address;
    }

    public String getEm_Phone() {
        return Em_Phone;
    }

    public String getDepartment() {
        return Department;
    }
    
     public void open_account(String Em_name, int Em_Age, int Em_ID, String Em_Address, String Em_Phone, String Department){
        this.Em_name = Em_name;
        this.Em_Age = Em_Age;
        this.Em_ID = Em_ID;
        this.Em_Address = Em_Address;
        this.Em_Phone = Em_Phone;
        this.Department = Department;
     }
     
     public void close_account(int Em_ID){
         if(this.Em_ID==Em_ID){
             cli.remove(Em_ID);
             System.out.println("Done");
         }
         else
             System.out.println("Sorry");
     }
     
      public void Open_Account_ToClient(String C1_Name, int Cl_Age, int Cl_ID, String Cl_Address, String Cl_phone, String Cl_Kind, double Cl_Balance) {
        this.c.C1_Name = C1_Name;
        this.c.Cl_Age = Cl_Age;
        this.c.Cl_ID = Cl_ID;
        this.c.Cl_Address = Cl_Address;
        this.c.Cl_phone = Cl_phone;
        this.c.Cl_Kind = Cl_Kind;
        this.c.Cl_Balance = Cl_Balance;
    }
     
     
       public boolean Search_Client(int Cl_ID){
       if(this.c.Cl_ID==Cl_ID)
          return true;
       else
             return false;
     }
     
     public boolean Search(int Em_ID){
       if(this.Em_ID==Em_ID)
          return true;
       else
       return false;
     }
     
     
    
    @Override
    public String toString() {
        return "Employee{" + "Em_name=" + Em_name + ", Em_Age=" + Em_Age + ", Em_ID=" + Em_ID + ", Em_Address=" + Em_Address + ", Em_Phone=" + Em_Phone + ", Department=" + Department + ", Branch=" + Branch + '}';
    }

 
}
