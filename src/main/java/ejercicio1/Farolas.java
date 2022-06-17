/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Farolas {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        String ruta;
        BufferedReader br = null;
        String cvsSplitBy = ";";
        String line = "";
        ArrayList<String[]> contenido = new ArrayList<String[]>();
        
      
        ruta = "./20220408_DATOS_ABIERTOS_UNIDAD_LUMINOSA_.csv";
        try {
            br = new BufferedReader(new FileReader(ruta));

            while ((line = br.readLine()) != null) {

                String[] datos = line.split(cvsSplitBy);
                //Imprime datos.
                System.out.println(datos[2] + "; " + datos[9]);

            }
          //Excepciones 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
