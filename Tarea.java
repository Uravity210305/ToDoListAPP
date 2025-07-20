package com.mycompany.todolistapp; //Es el paquete donde se inicio la hojita del codigo, asi le digo yo hoja o ventana jajaja

import java.time.LocalDate;// es cuanodo importamos la linea de un codigo 
// en este caso es this.fecha = LocalDate.now();

public class Tarea { //Nombre de la clase
        
    private String descripcion;// aqui es la descripcion de nuestra tarea   
    
    private LocalDate fecha;//aqui es la fecha de cuando se creo la tarea
    
    private String estado;// es para saber si esta pendiente o completada nuestra tarea

    public String getDescripcion() { //Los get y Sets con su respectiva descrpcion....
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.fecha = LocalDate.now();
        this.estado = "pendiente";
           //aqui nos pondra la fechaa de la tarea y que esta pendiente
    }

    
}
