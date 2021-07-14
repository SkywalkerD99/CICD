/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cicd;

/**
 *
 * @author skywa
 */
public class Addition {
    
    private int member1;
    private int member2;
    
    public Addition(int member1, int member2){
        this.member1 = member1;
        this.member2 = member2;
    }
    
    public int getResult() {
        return member1 + member2;
    }
    
    public static void main(String[] args) {
        System.out.println(new Addition(2, 3).getResult());
    }
    
}
