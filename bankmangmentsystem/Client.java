
package bankmangmentsystem;



/**
 *
 * @author Mohamed
 */
public  class  Client {
      myarray<Employee> Em = new myarray<Employee>();
 
    protected String C1_Name;
    protected int Cl_Age;
    protected int Cl_ID;
    protected String Cl_Address;
    protected String Cl_phone;
    protected String Cl_Kind;
    protected double Cl_Balance;
    protected String Branch;
    
    
    public Client(){
    
    }

    public Client(String C1_Name, int Cl_Age, int Cl_ID, String Cl_Address, String Cl_phone, String Cl_Kind, double Cl_Balance,String branch) {
        this.C1_Name = C1_Name;
        this.Cl_Age = Cl_Age;
        this.Cl_ID = Cl_ID;
        this.Cl_Address = Cl_Address;
        this.Cl_phone = Cl_phone;
        this.Cl_Kind = Cl_Kind;
        this.Cl_Balance = Cl_Balance;
        this.Branch=branch;
    }   

   

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }
     public String getBranch() {
        return Branch;
    }

   

    public void setC1_Name(String Name) {
        C1_Name=Name ;
    }

    public void setCl_Age(int Age) {
       Cl_Age= Age ;
    }

    public void setCl_ID(int ID) {
        Cl_ID=ID ;
    }

    public void setCl_Address(String Address) {
        Cl_Address=Address ;
    }

    public void setCl_phone(String phone) {
       Cl_phone= phone  ;
    }

    public void setCl_Kind(String Kind) {
      Cl_Kind=  Kind  ;
    }
    
    
    public void setBalance(double Balance) {
      Cl_Balance=  Balance  ;
    }

    public String getC1_Name() {
        return C1_Name;
    }

    public int getCl_Age() {
        return Cl_Age;
    }

    public int getCl_ID() {
        return Cl_ID;
    }

    public String getCl_Address() {
        return Cl_Address;
    }

    public String getCl_phone() {
        return Cl_phone;
    }

    public String getCl_Kind() {
        return Cl_Kind;
    }
    
    public double getbalance(){
         return Cl_Balance;
    }

        public void Open_Client(String C1_Name, int Cl_Age, int Cl_ID, String Cl_Address, String Cl_phone, String Cl_Kind, double Cl_Balance,String branch) {
        this.C1_Name = C1_Name;
        this.Cl_Age = Cl_Age;
        this.Cl_ID = Cl_ID;
        this.Cl_Address = Cl_Address;
        this.Cl_phone = Cl_phone;
        this.Cl_Kind = Cl_Kind;
        this.Cl_Balance = Cl_Balance;
        this.Branch=branch;
        
    }
    
    public void delete_account(int Cl_ID){
         if(this.Cl_ID==Cl_ID){
           Cl_Balance=0.0;
             System.out.println("Done");
         }
         else
             System.out.println("Sorry");
    }
    
    

    @Override
    public String toString() {
        return "Client{"+ " C1_Name=" + C1_Name + ", Cl_Age=" + Cl_Age + ", Cl_ID=" + Cl_ID + ", Cl_Address=" + Cl_Address + ", Cl_phone=" + Cl_phone + ", Cl_Kind=" + Cl_Kind + ", Cl_Balance=" + Cl_Balance + ", Branch=" + Branch + '}';
    }
    
}
