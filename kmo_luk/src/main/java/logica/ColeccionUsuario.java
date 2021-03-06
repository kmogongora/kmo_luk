/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import persistencia.RegistroDAO;

/**
 * Contiene la lógica requerida para gestionar la información de los juguetes
 * @author Cielo Juliana
 */
public class ColeccionUsuario {
    private ArrayList<Usuario> lista;
    
    /**
     * Obtiene una lista de juguetes
     * @return una estructura de datos con los datos de los juguetes requeridos
     */
    public ArrayList<Usuario> getLista() {
        return lista;
    }
    
    /**
     * Carga la información de todos los juguetes de la base de datos
     * @return true si carga los juguetes, o false si no se logró cargar
     */
    public boolean cargarTodosLosUsuarios() {
        RegistroDAO dao = new RegistroDAO();
        lista = dao.consultarUsuarios();
        if (lista.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Guarda la información de un juguete capturada desde el formulario
     * @param j un objeto con los datos de un juguete específico
     * @return true si guarda el juguete en la base de datos, o false si no lo guarda
     */
    public boolean guardarUsuario(Usuario j) {
        RegistroDAO dao = new RegistroDAO();
        int id = dao.guardarNuevoUsuario(j);
        if (id > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
