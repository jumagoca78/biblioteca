import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUIAdministradorLibros {
    private JFrame frame;
    private AdministradorLibros admin;
    
    public GUIAdministradorLibros() {
        frame = new JFrame("Administrador de Libros");
        admin = new AdministradorLibros();
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu = new JMenu("Opciones");
        JMenuItem agregarItem = new JMenuItem("Agregar libro");
        JMenuItem eliminarItem = new JMenuItem("Eliminar libro por ISBN");
        JMenuItem mostrarItem = new JMenuItem("Mostrar todos los libros");
        
        menu.add(agregarItem);
        menu.add(eliminarItem);
        menu.add(mostrarItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        agregarItem.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar libro...
            }
        });
        
        eliminarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar libro por ISBN...
            }
        });
        
        mostrarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para mostrar todos los libros...
            }
        });
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
  
}