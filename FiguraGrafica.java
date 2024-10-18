package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * @created 24/02/13 23:38
 * 
 * Esta clase representa una (muy mala) implementación de una figura
 * geométrica. Tu misión es aplicar con éxito los principios del Polimorfismo
 * que aprendiste anteriormente. ¡Suerte!
 */

    
 public abstract class FiguraGrafica {
    
    protected String figura;
    
    public FiguraGrafica() {
        this("cuadrado");
    }
    
    public FiguraGrafica(String figura) {
        this.figura = figura;
    }

    // Métodos abstractos
    public abstract void dibujar(Graphics g);
    
    public abstract void encojer(Graphics g);
    
    public abstract void agrandar(Graphics g);
    
    public abstract void cambiarColor(Graphics g, Color c);
    
    public abstract void mover(Graphics g, String direccion);
}
