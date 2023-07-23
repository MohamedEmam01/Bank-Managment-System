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
public class Bank {
    
private int Ba_ID;
private String Ba_Location;
private String Ba_Name;
private String Branch;

    public Bank() {
    }

    public Bank(int Ba_ID, String Ba_Location, String Ba_Name,String branch) {
        this.Ba_ID = Ba_ID;
        this.Ba_Location = Ba_Location;
        this.Ba_Name = Ba_Name;
        this.Branch=branch;
    }

    public void setBa_ID(int Ba_ID) {
        this.Ba_ID = Ba_ID;
    }

    public void setBa_Location(String Ba_Location) {
        this.Ba_Location = Ba_Location;
    }

    public void setBa_Name(String Ba_Name) {
        this.Ba_Name = Ba_Name;
    }
    
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public int getBa_ID() {
        return Ba_ID;
    }

    public String getBa_Location() {
        return Ba_Location;
    }

    public String getBa_Name() {
        return Ba_Name;
    }

    public String getBranch() {
        return Branch;
    }

    


}
