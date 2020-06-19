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
public class celula {
    private String nombre;
    private String dr;
    private double fb;
    
    public celula(String n, String d, double f){
        this.nombre=n;
        this.dr=d;
        this.fb=f;     
    }
    
    public String mostrarcelula(){
        String covid=" ";
        if ("si".equals(dr)&&fb>38){
            covid="si";
        }
        else{
            covid="no";
        }
        return nombre+" Def. Resp.: "+dr+" Fiebre: "+fb+" COVID: "+covid;
    }
}
