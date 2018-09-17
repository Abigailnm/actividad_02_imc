/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import controllers.ControllerMessage;
import models.ModelMessage;
import views.ViewMessage;


public class Main {

       private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;
    public static void main(String[] args) {
        viewMessage = new ViewMessage();
        modelMessage = new ModelMessage();
        controllerMessage = new ControllerMessage(modelMessage, viewMessage);
        controllerMessage.initView();
        viewMessage.setVisible(true);
        
    }
    
}

