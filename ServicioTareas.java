
package com.mycompany.todolistapp;

import java.util.ArrayList;//      estos
import java.util.List;//        dos fueron importados de la linea 
                      //        private List<Tarea> listaTareas = new ArrayList();


public class ServicioTareas {
    
    private List<Tarea> listaTareas = new ArrayList();//importado

    // aqui es para que creemos una tarea y la agregamos a la lista servicio tareas, osea esta hoja
    public Tarea crear(Tarea tarea) {
        listaTareas.add(tarea);
        return tarea;
    }

    //es esta linea es para marcar la tarea como cpletada
    public void marcar(Tarea tarea) {
        for (Tarea _tarea : listaTareas) {
            if (_tarea.getDescripcion().equalsIgnoreCase(tarea.getDescripcion())) {
                _tarea.setEstado("completada");
            }
        }
    }

    //Te debe de mostrar las tareas con su fecha descripcion y estado
    public void mostrarTareas() {
        for (Tarea tarea : listaTareas) {
            System.out.println("Descripción: " + tarea.getDescripcion());
            System.out.println("Fecha: " + tarea.getFecha());
            System.out.println("Estado: " + tarea.getEstado());

        }
    }

    //es para que eliminemos la tarea
    public boolean eliminarTarea(Tarea tarea) {
        List<Tarea> _listaTareas = new ArrayList<Tarea>();
        for (Tarea _tarea : listaTareas) {
            if (!_tarea.getDescripcion().equalsIgnoreCase(tarea.getDescripcion())) {
                _listaTareas.add(_tarea);
            }
        }
        listaTareas = _listaTareas;
        return true;
    }
    
//se enlista las tareas
    public void listaTareas() {
        for (int i = 1; i <= listaTareas.size(); i++) {
            System.out.println(i + ". " + listaTareas.get(i - 1).getDescripcion());

        }
    }

    public Tarea obtener(int i) {
        return listaTareas.get(i);

    }

    //se va hacer la tarea con la descripcion que le des
    public Tarea crear(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        listaTareas.add(tarea);
        return tarea;

    }

    //marca la tarea como completada asi lo marque el indice
    public void marcarCompletada(int indice) {
        listaTareas.get(indice).setEstado("completada");

    }

    //te tiene que delvover la tarea que ya almacenaste
    public List<Tarea> obtenerTareas() {
        return listaTareas;

    }
//se pondra la tarea completada desde su indice
    public boolean esTareaCompletada(String descripcion) {
        for (Tarea _tarea : listaTareas) {
            if (_tarea.getDescripcion().equalsIgnoreCase(descripcion)) {
                return _tarea.getEstado().equalsIgnoreCase("completada");

            }

        }

        return false;
    }

    //se eliminara la tarea desde el indice
    public void eliminarTarea(int indice) {
        List<Tarea> _listaTareas = new ArrayList();
        for (int i = 0; i < listaTareas.size(); i++) {
            if (indice != i) {
                _listaTareas.add(listaTareas.get(i));

            }
        }

    }
}
