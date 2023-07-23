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
public class Trancaction {
    Employee E1 =new Employee();
   static Client c =new Client();
    public  boolean linearSearch(MyQueueList Queue,int item)
    {
        for (int i=0;i<=Queue.Size;i++){
        if (Queue.Line[i].getCl_ID()==item){
        return true;
        }
        }
        return false;
    }

}


