/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelMessage;
import views.ViewMessage;

public class ControllerMessage implements ActionListener {
    
    private final ModelMessage modelMessage;
    private final ViewMessage viewMessage;

    public ControllerMessage(ModelMessage modelMessage, ViewMessage viewMessage) {
        this.modelMessage = modelMessage;
        this.viewMessage = viewMessage;
        this.viewMessage.jb_calcular.addActionListener(this);
       
    }
    
     public final void initView(){
        viewMessage.setTitle("Calcular Imc");
        viewMessage.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if( viewMessage.jtf_estatura.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa Estatura");
        } else if ( viewMessage.jtf_peso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa Peso");
        
        }
          
        
     modelMessage.setPeso(Integer.parseInt(viewMessage.jtf_peso.getText()));
     modelMessage.setEstatura(Double.parseDouble(viewMessage.jtf_estatura.getText()));
     modelMessage.IMC();
      
     
     
    }

}
