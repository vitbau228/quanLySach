/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

/**
 *
 * @author Hello VIỆT
 */
public class Newspaper extends Document {
    private int dayIssue;
    public Newspaper(String id,String nxb,int number,int dayIssue) {
        super(id,nxb,number);
        this.dayIssue = dayIssue;
    }
    
    public int getDayIssue() {
        return dayIssue;
    }
    
    public void setDayIssue(int dayIssue) {
        this.dayIssue=dayIssue;
    }
    @Override
    public String toString() {
        return "Newspaper{" +
                "dayIssue=" + dayIssue +
      
                ", id='" + getId() + '\'' +
                ", nxb='" + getNxb() + '\'' +
                ", number='" + getNumber() + '\'' +
                '}';
    }

}
