/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author timon_kaufmann
 */
public class StundeBau {
    private String k;
    private String stundenname;
    
    public StundeBau(String stundenname, String k) {
        this.stundenname = stundenname;
        this.k = k;
    }

    public String getStundenname() {
        return stundenname;
    }

    public void setStundenname(String stundenname) {
        this.stundenname = stundenname;
    }


    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }
    
    
}
