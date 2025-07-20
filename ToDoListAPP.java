package com.mycompany.todolistapp;

import java.io.BufferedReader;            //
import java.io.IOException;               //
import java.io.InputStreamReader;         //


public class ToDoListAPP {
static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
static ServicioTareas servisTask = new ServicioTareas();

    public static void main(String[] args) {
        int opcionSeleccionada = 0;

        try {
            //aqui terminamos cuando el usuario selecciona la ultima opcion
            do {
                mostrarMenu();
                opcionSeleccionada = manejarOpcionSeleccionada();

            } while (opcionSeleccionada != 5);

        } catch (IOException e) {
            System.out.println("Entrada inválida");
        } finally {
            //Cierre del BufferedReader.
            try {
                leer.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el recurso.");
            }

        }
    }
    
    public static void mostrarMenu() {

        System.out.println("*****To Do List*****");
        System.out.println("Selecciona una opción");
        System.out.println("1. Crear tarea");
        System.out.println("2. Mostrar tarea");
        System.out.println("3. Completar tarea");
        System.out.println("4. Eliminar tarea");
        System.out.println("5. Salida");

    }
    
     public static int manejarOpcionSeleccionada() throws IOException {

        //variable
        int opcionSeleccionada = 0;
        Tarea tarea;

        opcionSeleccionada = Integer.parseInt(leer.readLine());

        switch (opcionSeleccionada) {
            case 1:
                //se pone la tarea
                System.out.println("Ingrese la tarea");
                servisTask.crear(leer.readLine());
                break;

            case 2:
                servisTask.mostrarTareas();//nos debe de mostrar la tarea
                break;

            case 3:
                servisTask.listaTareas(); //marcamos nuestra tarea como completada
                System.out.println("Que tarea quieres marcar como completada");
                int indiceTarea = Integer.parseInt(leer.readLine());
                Tarea _tarea = servisTask.obtener(indiceTarea - 1);
                servisTask.marcar(_tarea);
                break;

            case 4:
                servisTask.listaTareas(); //aqui elimanomos la tarea
                System.out.println("Que tarea deseas eliminar? ");
                indiceTarea = Integer.parseInt(leer.readLine());
                Tarea __tarea = servisTask.obtener(indiceTarea - 1);
                servisTask.eliminarTarea(__tarea);
                break;

            case 5: //nso da salida correctamente del programa
                System.out.println("Salida correctamnte");
                break;

            default: // nos va regresar hasta que no le demos una de las opciones que le dimos
                System.out.println("Selecciona una opcion del menu ");
                break;

        }

        return opcionSeleccionada;

    }
    
    }

