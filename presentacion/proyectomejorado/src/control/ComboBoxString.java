/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Saulo
 */
public class ComboBoxString {
    private String Descripcion;
    private String ID;
    
    public ComboBoxString(String id, String descripcion){
        this.ID=id;
        this.Descripcion=descripcion;
    }
    
    public String getDescripcion(){ return Descripcion;}
    public String getID(){ return ID;}
    
    @Override
    public String toString(){
        return Descripcion;
    }
}
