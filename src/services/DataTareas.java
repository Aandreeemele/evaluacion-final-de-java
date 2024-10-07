package services;

import model.Tarea;

import java.util.ArrayList;

public class DataTareas {
    private ArrayList<Tarea> listaTareas;

    public DataTareas() {
        listaTareas = new ArrayList<>();
        cargarTareasEjemplo();
    }

    private void cargarTareasEjemplo() {
        listaTareas.add(new Tarea("Tarea 01", "Envia la captura de tu diseño terminado", "2024-10-10", "Pendiente"));
        listaTareas.add(new Tarea("Tarea 02", "Envia la captura y el link de tu repositorio", "2024-10-15", "En progreso"));
        listaTareas.add(new Tarea("Tarea 03", "Envia el link de tu repositorio", "2024-11-01", "Completado"));
        listaTareas.add(new Tarea("Tarea 04", "Envia tu diseño terminado", "2024-10-20", "Pendiente"));
        listaTareas.add(new Tarea("Tarea 05", "Envia tu diseño terminaod de Login", "2024-10-25", "En progreso"));
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public void eliminarTareaPorTitulo(String titulo) {
        listaTareas.removeIf(tarea -> tarea.getTitulo().equals(titulo));
    }

    public void eliminarTarea(String titulo) {
    }
}

