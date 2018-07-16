/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.HashMap;
import javax.swing.JButton;

/**
 *
 * @author Usuario
 */
public class Casilla extends JButton {

    private int i = 0;
    private int j = 0;

    //Variables de lo que contiene la casilla
    private int ocupada = 0; //0 libre, 1 ocupada
    private int inanimado = 0; //0 libre, 1,2,3.... Dependera del objeto que haya(Agua, pared, roca, arbol...)
    private int pnj = 0; //0 libre, 1,2,3... Dependera del bicho o persona.
    private int pj = 0; //0 libre, 1,2,3... Numero del jugador en cuestion.
    HashMap<String, Boolean> listaObjetos = new HashMap();

    public Casilla(int _i, int _j) {
	i = _i;
	j = _j;
	this.setBorder(null);
    }

    public int getI() {
	return i;
    }

    public int getJ() {
	return j;
    }

    public int getOcupada() {
	return ocupada;
    }

    public void setOcupada(int ocupada) {
	this.ocupada = ocupada;
    }

    public int getInanimado() {
	return inanimado;
    }

    public void setInanimado(int inanimado) {
	this.inanimado = inanimado;
    }

    public int getPnj() {
	return pnj;
    }

    public void setPnj(int pnj) {
	this.pnj = pnj;
    }

    public int getPj() {
	return pj;
    }

    public void setPj(int pj) {
	this.pj = pj;
    }

    public HashMap<String, Boolean> getListaObjetos() {
	return listaObjetos;
    }

    public void setListaObjetos(HashMap<String, Boolean> listaObjetos) {
	this.listaObjetos = listaObjetos;
    }

}
