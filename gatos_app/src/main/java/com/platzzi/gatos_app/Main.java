package com.platzzi.gatos_app;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author dvchinx
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int optionMenu = -1;
        String[] botones = {
            "1. Ver Gatos.", 
            "2. Salir."
        };
        
        do {
            //Menu principal
            String option = (String) JOptionPane.showInputDialog(null, "Gatitos Java", "Menu", 
                    JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
            
            //Validar opcion seleccionada
            for(int i = 0; i < botones.length; i++){
                if(option.equals(botones[i])) optionMenu = i;
            }
            
            switch(optionMenu){
                case 0:
                    GatosService.verGatos(); 
                    break;
                default:
                    break;
            }
            
        }while(optionMenu != 1);
    }
}
