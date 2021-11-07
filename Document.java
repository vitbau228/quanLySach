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
public abstract class Document {
    private String id;
    private String nxb;
    private int number;

    public  Document() {
    }
    
    public Document(String id,String nxb,int number) {
        this.id = id;
        this.nxb = nxb;
        this.number = number;
    }
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNxb() {
        return nxb;
    }
    
    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
}
