package view;

import javax.swing.*;
import java.awt.*;

public class EliminarTareaView extends JFrame {
    private TareasView tareasView;

    public EliminarTareaView(TareasView tareasView) {
        this.tareasView = tareasView;
        setTitle("Eliminar Tarea");
        setSize(400, 150);
        setLayout(new GridLayout(2, 2));


        JLabel lblTitulo = new JLabel("Título de la tarea que desea eliminar:");
        JTextField txtTitulo = new JTextField();
        JButton btnEliminar = new JButton("Eliminar");

        add(lblTitulo);
        add(txtTitulo);
        add(btnEliminar);

        btnEliminar.addActionListener(e -> {
            String titulo = txtTitulo.getText();
            tareasView.getDataTareas().eliminarTareaPorTitulo(titulo);
            tareasView.actualizarVista();
            dispose();
        });
    }
}
