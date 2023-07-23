package bankmangmentsystem;
import java.util.Scanner;
import java.util.List;
public class BankMangmentSystem {

    public static void main(String[] args) {
       myarray A = new myarray();
       myarray <Employee>Array = new myarray<>();
       
        MyQueueList<Client> Queue = new MyQueueList<>();
        MyQueueList <Trancaction>trancaction =new MyQueueList<>();
        Trancaction T =new Trancaction();
        Scanner cin = new Scanner(System.in);
        
//        MyArrayList <Employee> employee =new MyArrayList<Employee>();
//        MyArrayList <Manager> manager =new MyArrayList<Manager>();
//        MyQueueList <Client> client =new MyQueueList<Client>();
Manager m = new Manager();
Manager m1 = new Manager("Hesham",55,1,"01144403911","Old Egype"," Manager General");
Manager m2 = new Manager("AbuShama",50,2,"01021730424","Suadi"," Manager Teller");
Manager m3 = new Manager("Boda",50,3,"01111156970","Cairo"," Manager ");
       myarray<Manager> Ml=new myarray<>();
        Ml.add(m1);
        Ml.add(m2);
         Ml.add(m3);
Employee e = new Employee ();
Employee e1 = new Employee ("Mohamed",19,3,"01016964061","Old Egype","Engineer","alex");
Employee e2 = new Employee ("Osama",20,2,"01092783837"," Badr City","Sales","cairo");
Employee e3 = new Employee ("Essam",22,1,"01103032052","Alex","Teller","sohag");
Employee e4 = new Employee ("Abdo",33,4,"01111156970"," Fayoum","Trainer","fayoum");
        myarray <Employee>El = new myarray<>();
        El.add(e1);
        El.add(e2);
        El.add(e3);
        El.add(e4);
Client c=new Client();
Client c1=new Client("sterling",19,1,"haram","0102178529","female",500.0,"asyut");
Client c2=new Client("boda",25,2,"old egypt","01103032053","male",5000.0,"sidi bashr");
Client c3=new Client("emam",27,3,"haram","01103032028","male",6000.0,"Sidi Gaber");
Client c4=new Client("3amar",1,4,"haram","01103032053","male",15000.0,"3agmy");
Client c5=new Client("menna",19,5,"shourok","0125493254","female",1000.0,"M3mora");
Client c6=new Client("noor",18,6,"shourok","0154897562","female",20000.0,"montaza");
Client c7=new Client("ehdaa",24,7,"fayoum","0123645798","female",7000.0,"ramsses");
Client c8=new Client("aya",25,8,"fayoum","01265489952","female",12000.0,"Down town");
         MyQueueList <Client>Cl = new MyQueueList<Client>();
         Cl.Add(c1);
         Cl.Add(c2);
         Cl.Add(c3);
         Cl.Add(c4);
         Cl.Add(c5);
         Cl.Add(c6);
         Cl.Add(c7);
         Cl.Add(c8);
        
        
     boolean var =true;
         while (var) {
              Menu();
                 int choice=cin.nextInt();
                 if(choice==4)
                     break;
                 else{
     switch(choice){
         
         ///////////////// Manager Case/////////////////
         
         case 1 : 
         ManagerMenu();
         int Managerchoice=cin.nextInt();
         switch(Managerchoice){
             
        //////////// Add Employee/////////
             
             case 1:
                
            System.out.println("Enter Employee information");
            System.out.println("Enter Employee Name");
                 m.Em_name=cin.next();
                 System.out.println("Enter Employee Age");
                 m.Em_Age=cin.nextInt();
                 System.out.println("Enter Employee ID");
                 m.Em_ID=cin.nextInt();
                 System.out.println("Enter Employee Address");
                 m.Em_Address=cin.next();
                 System.out.println("Enter Employee Phone");
                 m.Em_Phone=cin.next();
                 System.out.println("Enter Employee Department");
                 m.Department=cin.next();
                 System.out.println("Enter Employee Branch");
                 m.Branch=cin.next();
                 m.setEm_name(m.Em_name);
                 m.setEm_Age(m.Em_Age);
                 m.setEm_ID(m.Em_ID);
                 m.setEm_Address(m.Em_Address);
                 m.setEm_Phone(m.Em_Phone);
                 m.setDepartment(m.Department);
                 El.add(m);
                 System.out.println(m);
                    for(Employee r : El){
                  System.out.println(r);
             }
                 break;
                 
                /////////// Remove Employee ///////// 
                 
             case 2:
                 System.out.println("List Before Remove");
                 for(Manager r : Ml){
                  System.out.println(r);
             }
                  System.out.println("Enter Targeted ID to Remove");
                  int Remove=cin.nextInt(); 
                  Ml.remove(Remove);
                  System.out.println("List After Remove");
                  for(Manager r : Ml){
                  System.out.println(r);
                  
             }
              break;    
                 
              /////////// Update Employee/////////
                  
             case 3:
                System.out.println("List Before Remove");
                       for(Employee r : El){
                  System.out.println(r);
                       }
                 System.out.println("Enter your MOD NAME"); 
                 m.Em_name  =cin.next();
                 System.out.println("Enter Your Age"); 
                 m.Em_Age = cin.nextInt();
                 System.out.println("Enter your ID"); 
                 m.Em_ID= cin.nextInt();
                 System.out.println("Enter your MOD Address"); 
                 m.Em_Address= cin.next();
                 System.out.println("Enter your MOD phone");
                 m.Em_Phone= cin.next();
                 System.out.println("Enter your MOD Department");
                 m.Department= cin.next();
                 System.out.println("Enter your MOD Branch");
                 m.Branch=cin.next();
                El.set(e.Em_ID, e=new Employee(e.Em_name,e.Em_Age,m.Em_ID,m.Em_Address,e.Em_Phone,m.Department,m.Branch));
                
                   for(Employee r : El){
                  System.out.println(r);
                       }
                 break;
                 
                 ///////////// Add Manager//////////
                 
             case 4:
                 System.out.println("Enter Manager information");
                 System.out.println("Enter Manager name");
                 m.Em_name=cin.next();
                 System.out.println("Enter Manager age");
                 m.Em_Age=cin.nextInt();
                 System.out.println("Enter Manager ID");
                 m.Em_ID=cin.nextInt();
                 System.out.println("Enter Manager Address");
                 m.Em_Address=cin.next();
                 System.out.println("Enter Manager Phone");
                 m.Em_Phone=cin.next();
                 System.out.println("Enter Manager Department");
                 m.Department=cin.next();
                 System.out.println("Enter Manager Branch");
                 m.Branch=cin.next();
                 m.setEm_name(m.Em_name);
                 m.setEm_Age(m.Em_Age);
                 m.setEm_ID(m.Em_ID);
                 m.setEm_Address(m.Em_Address);
                 m.setEm_Phone(m.Em_Phone);
                 Ml.add(m);
                  for(Manager r : Ml){
                  System.out.println(r);
                       }
                 break;
                 
                 /////////// Show Data //////////////
                 
             case 5:
                  System.out.println("Do want All List Or ONE ID");
                  String Show = cin.next();
                  if("ALL".equals(Show)){
                  for(Manager r : Ml){
                  System.out.println(r);
                       }
                  }
                  else{
                  System.out.println("Enter Targeted ID to Show");
                  m.Em_ID = cin.nextInt();
                  System.out.println(Ml.get(m.Em_ID)); 
                  break;
}
           
         }
             break;
             
             //////////// Employee ////////////
             
         case 2:
             EmployeeMenu();
             int Employeechoice=cin.nextInt();
             switch(Employeechoice){
                 
                 ////////// Add Client//////////
                 
             case 1:
                 System.out.println("Enter client Information");
                 System.out.println("Enter client Name");
                 e.c.C1_Name=cin.next();
                  System.out.println("Enter client Age");
                 e.c.Cl_Age=cin.nextInt();
                 System.out.println("Enter client ID");
                 e.c.Cl_ID=cin.nextInt();
                 System.out.println("Enter client Address");
                 e.c.Cl_Address=cin.next();
                 System.out.println("Enter client Phone");
                 e.c.Cl_phone=cin.next();
                 System.out.println("Enter client Kind");
                 e.c.Cl_Kind=cin.next();
                 System.out.println("Enter client Balance");
                 e.c.Cl_Balance=cin.nextDouble();
                 e.c.Branch=cin.next();
                 e.c.setC1_Name(e.c.C1_Name);
                 e.c.setCl_Age(e.c.Cl_Age);
                 e.c.setCl_ID(e.c.Cl_ID);
                 e.c.setCl_Address(e.c.Cl_Address);
                 e.c.setCl_phone(e.c.Cl_phone);
                 e.c.setCl_Kind(e.c.Cl_Kind);
                 e.c.setBalance(e.c.Cl_Balance);
                 e.c.setBranch(e.c.Branch);
                 Cl.Add(e.c);
                  Cl.print();
                 break;
                 
                 //////////////////// Open Account//////////
                 
             case 2: 
                 
                 System.out.println("Enter client Info");
                 System.out.println("Enter Your Name");
                 e.c.C1_Name=cin.next();
                 System.out.println("Enter Your Age");
                 e.c.Cl_Age=cin.nextInt();
                 System.out.println("Enter Your ID");
                 e.c.Cl_ID=cin.nextInt();
                 System.out.println("Enter Your Address");
                 e.c.Cl_Address=cin.next();
                 System.out.println("Enter Your Phone");
                 e.c.Cl_phone=cin.next();
                 System.out.println("Enter Your Kind");
                 e.c.Cl_Kind=cin.next();
                 System.out.println("Enter Your Balance");
                 e.c.Cl_Balance=cin.nextFloat();
                 System.out.println("Enter Your Branch");
                 e.c.Branch=cin.next();
                 e.c.setC1_Name(e.c.C1_Name);
                 e.c.setCl_Age(e.c.Cl_Age);
                 e.c.setCl_ID(e.c.Cl_ID);
                 e.c.setCl_Address(e.c.Cl_Address);
                 e.c.setCl_phone(e.c.Cl_phone);
                 e.c.setCl_Kind(e.c.Cl_Kind);
                 e.c.setBalance(e.c.Cl_Balance);
                 e.c.setBranch(e.c.Branch);
                 Cl.Add(e.c);
                 Cl.print();
                 break;
                 
                 ////////// Close The First Account///////
                 
             case 3:
                 System.out.println("List Before Remove");
                Cl.print();
                  
                  Cl.remove();
                  System.out.println("List After Remove");
                  Cl.print();

                 
                 
                 break;
                 
                 //////////////// Update Client ////////////
                 
             case 4:
                 System.out.println("List Before Update");
                 Cl.print();
                 
                // System.out.println(Cl); 
                 System.out.println("Enter your MOD NAME"); 
                 e.c.C1_Name  =cin.next();
                 System.out.println("Enter Your Age"); 
                 e.c.Cl_Age = cin.nextInt();
                 System.out.println("Enter your ID"); 
                 e.c.Cl_ID= cin.nextInt();
                 System.out.println("Enter your MOD Address"); 
                 e.c.Cl_Address= cin.next();
                 System.out.println("Enter Your Phone");
                 e.c.Cl_phone=cin.next();
                 System.out.println("Enter your Kind");
                 e.c.Cl_Kind=cin.next();
                 System.out.println("Enter your Balance");
                 e.c.Cl_Balance=cin.nextFloat();
                 System.out.println("enter your Branch");
                 e.c.Branch=cin.next();
               Cl.set( e.c.Cl_ID, e.c=new Client(e.c.C1_Name,e.c.Cl_Age, e.c.Cl_ID,e.c.Cl_Address,e.c.Cl_phone, e.c.Cl_Kind,e.c.Cl_Balance,e.c.Branch ));
                System.out.println("List After Update");   
               Cl.print();
                 break;
                 
                 ////////////// WithDraw//////////////
                
             case 5:              
                 System.out.println("Enter The Amount You Want To Withdraw");
                 double amount=cin.nextDouble();
                 System.out.println("Enter your id");
                 int i=cin.nextInt();

                 System.out.println(Queue.Update_Balance(Cl, i, amount,1));
                 break;
                 
                  ////////////// Deposit //////////////
                 
             case 6:
             
                 System.out.println("Enter The Amount You Want To Deposit");
                 double Amount = cin.nextDouble();
                 System.out.println("Enter your id");
                 int r = cin.nextInt();
             System.out.println(Queue.Update_Balance(Cl, r, Amount,2));
                 break;
                
                 /////////////// Check Balance///////////
                 
             case 7:
                
                 System.out.println("Enter your id");
                 int x = cin.nextInt();
                 System.out.println(Queue.CheckBalance(Cl, x));
            break;
            
            ///////////////// Sort Employee ID ///////////////
            
             case 8:
                 
                  Array.insertSort(El);
                  for(Employee t : El){
                  System.out.println(t);
                       }
                  
                 break; 
         }
             break;
             
             ////////////// Client///////////////////
             
         case 3:
             ClientMenu();
             int Clientchoice=cin.nextInt();
             switch(Clientchoice){
                 
                 /////////////// Open Account///////////
                 
             case 1:
                 System.out.println("Enter Your Name");
                 c.C1_Name=cin.next();
                 System.out.println("Enter Your Age");
                 c.Cl_Age=cin.nextInt();
                 System.out.println("Enter Your ID");
                 c.Cl_ID=cin.nextInt();
                 System.out.println("Enter Your Address");
                 c.Cl_Address=cin.next();
                 System.out.println("Enter Your Phone");
                 c.Cl_phone=cin.next();
                 System.out.println("Enter Your Kind");
                 c.Cl_Kind=cin.next();
                 System.out.println("Enter Your Balance");
                 c.Cl_Balance=cin.nextFloat();
                 System.out.println("Enter Your Branch");
                 c.Branch=cin.next();
                 c.setC1_Name(e.c.C1_Name);
                 c.setCl_Age(e.c.Cl_Age);
                 c.setCl_ID(e.c.Cl_ID);
                 c.setCl_Address(e.c.Cl_Address);
                 c.setCl_phone(e.c.Cl_phone);
                 c.setCl_Kind(e.c.Cl_Kind);
                 c.setBalance(e.c.Cl_Balance);
                 c.setBranch(e.c.Branch);
                 Cl.Add(c);
                 Cl.print();
                 break;
                 
               ////////////  Close First Account ////////////////
                 
             case 2:
             

                 System.out.println("List Before Remove");
                Cl.print();
                  
                  Cl.remove();
                  System.out.println("List After Remove");
                  Cl.print();
                  
                 break;
                 
                 ////////////// Check Balance///////////////
                     
             case 3:
                 System.out.println("Enter ID to check balance");
                 int i = cin.nextInt();
                 System.out.println( Queue.CheckBalance(Queue, i));
                 break;
                 
                   //////////////// WithDraw/////////////////  
                 
             case 4:
                 
                 
                    System.out.println("Enter The Amount You Want To Withdraw");
                    
                    double amount=cin.nextDouble();
                    System.out.println("Enter your id");
                    int in=cin.nextInt();
                    System.out.println(Queue.Update_Balance(Cl, in, amount,1));
                    break;
                    
                    ////////////////// Deposit ////////////////
                    
             case 5:
                      System.out.println("Enter The Amount You Want To Deposit");
                      double Amount = cin.nextDouble();
                      System.out.println("Enter your id");
                      int re = cin.nextInt();
                      System.out.println(Queue.Update_Balance(Cl, re, Amount,2));
                      break;
             }
             
             ////////////// Exit ///////////////////////
             
         case 4:
                 var=false;
                 break;
         default:
            
             System.err.println("Enter vailinput");
     }

     }
         }
    
    }
    
    public static void Menu(){
       System.out.println("-------Plz Enter Your Kind-------");
       System.out.println("-------1/ Manager-------");
       System.out.println("-------2/ Employee-------");
       System.out.println("-------3/ Client-------");
       System.out.println("-------4/ Exit-------");
    }
    
    public static void ManagerMenu(){
       System.out.println("-------MANAGER METHOD-------");
       System.out.println("-------1/ Add Employee-------");
       System.out.println("-------2/ Remove Employee-------");
       System.out.println("-------3/ Update Employee-------");
       System.out.println("-------4/ Add Manager-------");
       System.out.println("-------5/Show-------");
    }
    
    public static void EmployeeMenu(){
       System.out.println("-------Employee METHOD-------");
       System.out.println("-------1/ Add Client-------");
       System.out.println("-------2/ Open Account -------");
       System.out.println("-------3/ Close The First Account  -------");
       System.out.println("-------4/ Update Client-------");
       System.out.println("-------5/  WithDraw    -------");
       System.out.println("-------6/  Deposite    -------");
       System.out.println("-------7/ Check Balance-------");
       System.out.println("-------8/ Sort Employee ID-------");  
    }
    
    public static void ClientMenu(){
       System.out.println("-------Client METHOD-------");
       System.out.println("-------1/Open Account-------");
       System.out.println("-------2/ Close The First Accout-------");
       System.out.println("-------3/ Check Balance-------");
       System.out.println("-------4/  WithDraw    -------");
       System.out.println("-------5/  Deposite    -------");
    }
}

      

