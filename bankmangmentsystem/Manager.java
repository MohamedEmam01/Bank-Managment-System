/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmangmentsystem;

/**
 *
 * @author Mohamed
 */
public class Manager extends Employee {
    myarray<Employee> E = new myarray<Employee>();
     myarray<Manager> M = new myarray<Manager>();


//    public Manager(String Manager, String Em_name, int Em_Age, int Em_ID, String Em_Address, String Em_Phone, String Department) {
//        super(Em_name, Em_Age, Em_ID, Em_Address, Em_Phone, Department);
//        this.Manager = Manager;
//    }

    public Manager() {
        
    }

public Manager ( String Em_name, int Em_Age, int Em_ID, String Em_Address, String Em_Phone, String Department){
        this.Em_name = Em_name;
        this.Em_Age = Em_Age;
        this.Em_ID = Em_ID;
        this.Em_Address = Em_Address;
        this.Em_Phone = Em_Phone;
        this.Department = Department;
        
}

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    
    
    
    public void Add_Employee(String Em_name, int Em_Age, int Em_ID, String Em_Address, String Em_Phone, String Department){
      this.Em_name=Em_name;
      this.Em_Address=Em_Address;
      this.Em_Age=Em_Age;
      this.Em_ID=Em_ID;
      this.Department=Department;
      this.Em_Phone=Em_Phone;
    }
     public void Delete_Employee(int Em_ID){
     if(this.Em_ID==Em_ID)
         E.remove(this.Em_ID);
     else
             System.out.println("Sorry you can not");
     }

  
  }
     

