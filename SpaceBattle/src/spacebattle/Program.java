package spacebattle;

import java.awt.Point;

/**
 *
 * @author s-zhouj
 */
public class Program {

    public static final int worldWidth = 1024;
    public static final int worldHeight = 768;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     * Returns a point representing the shortest path from Point p1 to Point p2.
     *
     * @param p1 the starting point
     * @param p2 the ending point
     * @return vector representing shortest distance
     */
    public Point direction(Point p1, Point p2) {
        //Set up variables
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        int centerx = this.worldWidth / 2;
        int centery = this.worldHeight / 2;
        //Determine if I need to wrap
        boolean wrapwidth = dx > centerx;
        boolean wrapheight = dy > centery;
        //Wrap
        if (wrapwidth) {
            dx -= this.worldWidth;
        }
        if (wrapheight) {
            dy -= this.worldHeight;
        }
        //Return a new Point
        return new Point(dx, dy);
    }

    /**
     * Returns the shortest distance between Point p1 and Point p2
     *
     * @param p1 the starting point
     * @param p2 the ending point
     * @return the shortest distance between two points
     */
    public double distance(Point p1, Point p2) {
        Point vector = direction(p1, p2);
        return Math.sqrt(vector.x * vector.x + vector.y * vector.y);
    }

}
