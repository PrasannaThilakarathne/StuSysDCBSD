/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBO;

/**
 *
 * @author ASUS
 */
public class Stu_Dep {
    private int count;
    private String depName;

    public Stu_Dep(int count, String depName) {
        this.count = count;
        this.depName = depName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
    
    
    
}
