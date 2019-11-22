package dijkstra;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yann
 */
public class Sommet {
    public Point pos;
    public ArrayList<Sommet> voisins;
    public ArrayList<Double> arcs;
    public Sommet pred;
    public double distance;
    
    public Sommet(Point p){
        this.pos = p;
        voisins = new ArrayList<Sommet>();
        arcs = new ArrayList<Double>();
    }
    
    public void addVoisin(Sommet s, double d){
        voisins.add(s);
        arcs.add(d);
    }
    
    public Sommet getVoisin(int index){
        return voisins.get(index);
    }
    
    public double getArc(int index){
        return arcs.get(index);
    }
    public static double Distance(Sommet s1, Sommet s2){
        return Math.sqrt(Math.pow(s2.pos.getX() - s1.pos.getX(), 2) + Math.pow(s2.pos.getY() - s1.pos.getY(), 2));
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
}
