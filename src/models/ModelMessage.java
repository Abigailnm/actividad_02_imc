/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import javax.swing.JOptionPane;


public class ModelMessage {
    private int imc;
     private int peso;
      private double estatura;

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        if (peso>=25 && peso <=400) {
            JOptionPane.showMessageDialog(null,imc + "se puede calcular su imc");
        } 
        else {
            JOptionPane.showMessageDialog(null, "no se puede calcular su imc");
        } 
    }

  
    
    public int IMC(){
        
        this.imc=(int) (this.peso/(this.estatura*this.estatura));
        
        if (imc<18.5) {
            JOptionPane.showMessageDialog(null,imc + "bajo de peso");
        } 
        else if (imc>=18.5 && imc<25) {
            JOptionPane.showMessageDialog(null,imc + " normal");
        } 
        else if (imc>25 && imc<30) {
            JOptionPane.showMessageDialog(null,imc + "sobre peso");
        } 
         
        else {
            JOptionPane.showMessageDialog(null, imc + "Obesidad" );
        }
        return this.imc;
        
    }
     
}

