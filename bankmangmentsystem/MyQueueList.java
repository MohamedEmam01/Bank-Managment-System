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
public class MyQueueList <T>{
     Client [] Line;
    int Capacity;
    int Size;
// constract 
    public MyQueueList(){
    Capacity=1000;
    Line =new Client[Capacity];
    Size=0;
    }
// constract take a parameter 
    public MyQueueList(int Capacity){
    this.Capacity=Capacity;
    Line =new Client[Capacity];
    Size=0;
    }
                  //Start All Method will Queue do    
// Add item in Queue
    public boolean Add(Client item){
    if(!isFull()){
    Line[Size++]=item;
    return true;
    }
    return false;
    }
// this methode check capacity        
    public boolean isFull(){
        return Capacity==Size;
        }
// methode return size;
    public int Size(){
    return Size;
    }
// methode do size equal 0
    public boolean isEmpty(){
    return Size==0;
    }
    // methode return first element
    public Client peek()
    {
        return isEmpty()?null:Line[0];
        
    }     
    // methode remove
         public Client remove()
    {
        if(isEmpty())
            return  null;
        Client temp=Line[0];
        for(int i=1;i<=Size-1;i++)
            Line[i-1]=Line[i];
        Size--;
        return temp;
    }
         
         public double Update_Balance(MyQueueList<Client> Queue ,int item,double Amount ,int Flag){
             if(Flag==1){
        for (int i=0;i<=Queue.Size-1;i++){
            
            Client c =Queue.Line[i];
        if (c.getCl_ID()==item){
          if (Queue.Line[i].getbalance()>Amount){
              Queue.Line[i].setBalance(Queue.Line[i].getbalance()-Amount);
              return Queue.Line[i].getbalance();
          }else
    System.out.println("Sorry The balance is not enough, please try again within limits " + c.Cl_Balance);
 
        }
      
        }
          
             }
             else if (Flag ==2){
              for (int i=0;i<=Queue.Size-1;i++){
            Client c =Queue.Line[i];
        if (c.getCl_ID()==item){
          {
              Queue.Line[i].setBalance(Queue.Line[i].getbalance()+Amount);
              return Queue.Line[i].getbalance();
        
      
        }
             }
              
         }
             
             
            
   
         }
               return 0;
                       
         }
         public double CheckBalance(MyQueueList<Client> Queue ,int item){
                 
               for (int i=0;i<=Queue.Size-1;i++){
            Client c =Queue.Line[i];
            if (c.getCl_ID()==item)
             return Queue.Line[i].getbalance(); 
            
             
         }
         return -1;
           
         }
         
         
    // methode to print element
         public void print(){
   for(int i= Size-1 ;i>=0;i--)
    System.out.println(Line[i]);
         }    
          public Client set(int i,  Client e) {
    Client last=Line[i];
    if(i<Size)
        Line[i]=e;
    else
        return null;
    return last;
    }
         }