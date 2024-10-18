package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Hector Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * Esta clase necesita de tu ayuda!
 */
public class Rectangulo extends FiguraGrafica {
    

    private int x = 15;  
    private int y = 15;  
    private int ancho = 70; 
    private int alto = 40;   

    @Override
    public void dibujar(Graphics g) {
       
        g.drawRect(x, y, ancho, alto);
    }

    @Override
    public void encojer(Graphics g) {
        
        ancho -= 10;
        alto -= 5;
        if (ancho < 10) ancho = 10;  
        if (alto < 5) alto = 5;      
        this.dibujar(g);
    }

    @Override
    public void agrandar(Graphics g) {
        ancho += 10;
        alto += 5;
        this.dibujar(g);
    }

    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }

    @Override
    public void mover(Graphics g, String direccion) {
       
        int desplazamiento = 5; 

        switch (direccion.toLowerCase()) {
            case "arriba":
                y -= desplazamiento;
                break;
            case "abajo":
                y += desplazamiento;
                break;
            case "izquierda":
                x -= desplazamiento;
                break;
            case "derecha":
                x += desplazamiento;
                break;
            default:
                System.out.println("Dirección no reconocida.");
                break;
        }
        this.dibujar(g);
    }
}
