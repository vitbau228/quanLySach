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
public class Journal extends Document {
    private int issueNumber;
    private int monthIssue;
    
    public Journal(String id,String nxb,int number,int issueNumber,int monthIssue) {
        super(id,nxb,number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }
        public int getIssueNumber() {
            return issueNumber;
        }
        public void setIssueNumber(int issueNumber) {
            this.issueNumber = issueNumber;
        }
        
        public int getMonthIssue() {
            return monthIssue;
        }
        
        public void setMonthIssue(int monthIssue) {
            this.monthIssue = monthIssue;
        }
        
        @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
             
                ", id='" + getId() + '\'' +
                ", nxb='" + getNxb() + '\'' +
                ", number='" + getNumber() + '\'' +
                '}';
    }

        
    
}
