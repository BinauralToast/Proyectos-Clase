/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author a18xacobopc
 */
public class ObjetoProba {
    private int a;
    private char c;
    
    public ObjetoProba(){
        
    }
    
    public ObjetoProba(int a, char c){
        this.a = a;
        this.c = c;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public int getA() {
        return a;
    }
    
    public void setC(char c) {
        this.c = c;
    }
    
    public char getC() {
        return c;
    }
}
