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
public class Branch {
    
    Client C=new Client();
    
    protected int Branch_ID;
    protected String Branch_Location;
    
    public Branch(){
    
    }
    
    public Branch(int ID, String Location){
    ID=Branch_ID;
    Location=Branch_Location;
    }

    public void setBranch_ID(int ID) {
        ID = Branch_ID;
    }

    public void setBranch_Location(String Location) {
        Location = Branch_Location;
    }

    public int getBranch_ID() {
        return Branch_ID;
    }

    public String getBranch_Location() {
        return Branch_Location;
    }
    
    
}
