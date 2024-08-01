/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyects;

import Taks.Task;
import java.util.ArrayList;

/**
 *
 * @author zulay
 */
public class Proyect {
private int id;
    private String name;
    private ArrayList<Task> task;

    
    public Proyect(int id, String name) {
        this.id = id;
        this.name = name;
        this.task = new ArrayList();
    }

    public Proyect() {
        
    }
    
    public void addTask(Task task){
        
    }
    

}
