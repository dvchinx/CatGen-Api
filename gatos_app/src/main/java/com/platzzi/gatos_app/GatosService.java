package com.platzzi.gatos_app;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dvchinx
 */
public class GatosService {

    public static void verGatos() throws IOException {
        //1, traer los datos de la API

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.thecatapi.com/v1/images/search")
                .get().build();
        Response response = client.newCall(request).execute();
        
        String Json = response.body().string();
        
        //2, cortar los corchetes del json
        Json = Json.substring(1, Json.length());
        Json = Json.substring(0, Json.length()-1);
        
        //3, crear un objeto de la clase gson
        Gson gson = new Gson();
        Gatos gato = gson.fromJson(Json, Gatos.class);
        
        //4, redimensionar imagen del gato si se necesita
        Image img = null;
        
        try{
            URL url = new URL(gato.getUrl());
            img = ImageIO.read(url);
            
            ImageIcon fondoGato = new ImageIcon(img);
            
            if (fondoGato.getIconWidth() > 800){
                Image fondo = fondoGato.getImage();
                Image modificado = fondo.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
                fondoGato = new ImageIcon(modificado);
            }
            
            String menu = "Opciones: "
                    + "\n1. Ver otra imagen."
                    + "\n2. Marcar como favorito"
                    + "\n3. Volver \n";
            
            String[] botones = {
                "Ver otra imagen", "favorito", "volver"
            };
            
            String id_gato = gato.getId();
            
            String option = (String) JOptionPane.showInputDialog(null, menu, id_gato, 
                    JOptionPane.INFORMATION_MESSAGE, fondoGato, botones, botones[0]);
            
            int seleccion = -1;
            
            for (int i = 0; i < botones.length; i++) {
                if (option.equals(botones[i])) seleccion = 1;
            }
            
            switch (seleccion) {
                case 0:
                    verGatos();
                    break;
                case 1:
                    favoritoGato(gato);
                    break;
                default:
                    break;
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error.");
        }
    }
    
    public static void favoritoGato(Gatos gato){
        
    }
}
