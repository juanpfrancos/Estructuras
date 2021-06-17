/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leerarchivo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author juanpfrancos
 * 
 * Búsqueda en anchura sobre grafos. Recibe un nodo inicial u y visita todos los nodos alcanzables desde u.
   BFS tambien halla la distancia mas corta entre el nodo inicial u y los demas nodos si todas las aristas tienen peso 1.
 */
public class BFS {
    
    static int v, e; //vertices, arcos
    static final int MAX = 100005; //Cantidad maxima de nodos
    static ArrayList<Integer> ady[] =  new ArrayList[MAX]; //Lista de adyacencia
    static long dist[] = new long[MAX]; //Almacena la distancia a cada nodo

    void bfs(int s) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        dist[s] = 0;
        int actual, i, next;
        
        while (!q.isEmpty()) {
            actual = q.poll();
            for ( i = 0; i < ady[actual].size(); i++) {
                next = ady[actual].get(i);
                if (dist[next] == -1) {
                    dist[next] = dist[actual] + 1;
                    q.add(next);
                }
            }
        }
    }


}

