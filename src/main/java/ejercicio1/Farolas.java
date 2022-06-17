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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ramiro Andres T
 */
public class Farolas {

    public static void main(String[] args) throws FileNotFoundException, IOException {  //Controlamos que nos salte una excepción si el fichero no ha sido encontrado 
        //Creamos nuestras variables, bufferedReader y nuestro HashMap que vamos ha utillizar en el progrma

        String line = null;
        BufferedReader br = null;
        BufferedReader br1 = null;
        String line1 = null;
        String cvsSplitBy = ";";
        String cvsSplitBy1 = ";";
        Map<String, String> listaMap = new HashMap<>();
        try {
            //br sera quien contenga la ubicación de nuestro archivo Datos abiertos unidad luminosa 
            br = new BufferedReader(new FileReader("C:/Users/DAW/Desktop/ArchivosexamenExtraordinarioPROG/20220408_DATOS_ABIERTOS_UNIDAD_LUMINOSA_.csv"));
            //br1 sera quien contega la ubicacion de nuestro archivo Dstritos 
            br1 = new BufferedReader(new FileReader("C:/Users/DAW/Desktop/ArchivosexamenExtraordinarioPROG/Distritos.csv"));

            //  while ((line = br.readLine()) != null && (line = br.readLine()) != null  ) { ------> queria hacer esto para que me muestre tanto lo del el contenido de br y br1 pero solo me muestra algunos valores
            while ((line = br.readLine()) != null) { //Como no es Null le indicamos que lea las lineas de las dos rutas 
                //Almacenamos los valores leido en datos(las lineas leidas de br) y en datos1 (almacenamos las lineas leidas de br1)
                String[] datos = line.split(cvsSplitBy);
                String[] datos1 = line.split(cvsSplitBy1);
                System.out.println(datos[1] + " ; " + datos[8]);

                //Guardamos los datos que hemos leido en el HashMap  expecificando que solo queremos los datos de la posicin dentro de Array  1(tipo de alumbrado) y 6(Distrito ) 
                //Lo que pasa es que al guardardo en el HashMap me guarda todo lo que va desde la posicion del tipo de farola al distrito 
                for (int i = 0; i < line.length(); i++) {
                    listaMap.put(datos[1], datos[8]);
                }

                //System.out.println(listaMap);
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
