/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid.lab2;

/**
 *
 * @author Usuario
 */
public class Gestionador {
    int max=10;
    celula [][]tabla= new celula[max][max];
    public Gestionador(){

    }
    
    public String Ingresardatos(int i, int j, String n, String d, double f){
        celula C= new celula(n,d,f);
        this.tabla[i][j]=C;
        return "Agregado exitosamente";
    }
    
    public String Listadatos(){
        String dato="";
        for(int i=0;i<max;i++){
            for (int j=0;j<max;j++){
                try{
                    dato=dato+"<html><p> "+tabla[i][j].mostrarcelula();
                }
                catch (Exception ex){
                    if (tabla[i][j]==null){
                        dato=dato+"";
                    }
                }
            }
        }
        return dato;
    }
}
