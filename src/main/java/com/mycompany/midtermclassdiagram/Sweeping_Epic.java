    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midtermclassdiagram;

/**
 *
 * @author sulem
 */
public class Sweeping_Epic extends Hardcover{
    private int pageCount;
    
    public Sweeping_Epic(int theId , int pageCount){
        id = theId;
        this.pageCount = pageCount;
    }
    
    @Override
    public void print() {
        System.out.println("Print");
    }
}
