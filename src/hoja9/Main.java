/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oliversinn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ingreso = new Scanner(System.in);
        String source = "";
        ArrayList<String> rawDiccionario;
        rawDiccionario = new ArrayList<String>();
        String textoTraducido = "";
        String tipoMapa = "";

        System.out.println("Bienvenido!\nIngrese el tipo de implementacion que desea utilizar: \n\t1) RedBlack\n\t2) Splay");
        tipoMapa = ingreso.nextLine();


        Map<String, Association<String, String>> diccionario = MapFactory.getMap(tipoMapa);

        System.out.println("Se leera el archivo .TXT que contiene el Diccionario\n(presiona ENTER para continuar)");
        ingreso.nextLine();
        
        

            try {
                /*Lee el archivo y obtiene la cadena*/
                FileInputStream fstream = new FileInputStream("./freedict-eng-spa.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                
                String strLine;
                while ((strLine = br.readLine()) != null) {
                    rawDiccionario.add(strLine); //agregar cada linea al diccionario
                }

                /* Separar cadenas y hacer asociacion */
                for (int i = 0; i < rawDiccionario.size(); i++) {
                    /*esta seccion fue realizada con la ayuda de Gabriel Brolo y Jose Custodio*/
                    String temp = rawDiccionario.get(i);
                    temp = temp.replaceAll(",", "\t");
                    temp = temp.replaceAll(", ", "\t");
                    //temp = temp.replaceAll("; ", "\t");
                    //temp = temp.replaceAll(";", "\t");
                    /* Ignora los comentarios del archivo de texto */
                    if (temp.charAt(0) != '#') {
                        String[] part = temp.split("\t");
                        diccionario.put(part[0], new Association<String, String>(part[0], part[1]));
                    }
                }
            }
            catch (Exception e) {
                System.out.println("Archivo no valido!!!");
            }
        

        /*ABRIR EL TEXTO A TRADUCIR*/
        System.out.println("Se leera el archivo .TXT que contiene el texto a traducir\n(presiona ENTER para continuar)");
        ingreso.nextLine();
                
                
           
        try
        {
            FileInputStream fstream = new FileInputStream("./texto.txt");
            BufferedReader datos = new BufferedReader(new InputStreamReader(fstream));
            String rawText = datos.readLine();  // Lee la unica linea y la guarda como string
            /*en caso de punto al final*/
            rawText = rawText.substring(0, rawText.length()-1);
            String textoATraducir = rawText.toLowerCase();
            datos.close();  // Se finaliza el lector
            System.out.println("El texto Originas es: \n" + textoATraducir);
            String wIngles, wEspanol;
            String[] st = textoATraducir.split(" ");

            /* traduce el texto*/

            for (int i =0; i < st.length; i++){

                wIngles = st[i];
                if (diccionario.get(wIngles) != null){
                    textoTraducido = (textoTraducido +" "+ diccionario.get(wIngles).getValue());
                }
                else{
                    textoTraducido = (textoTraducido + " *"+wIngles+"*");
                }

            }
            /*Dando formato a salida*/
            System.out.println("El texto traducido es: \n");
            textoTraducido = textoTraducido + ".";
            System.out.println(textoTraducido);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Archivo no valido!!!");
        }
        System.out.println("\nSi la palabra se encuentra entre  asteriscos (**), no existe en el diccionario\n");


    }
}
