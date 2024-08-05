/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyects;

import Taks.Task;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author zulay
 */
public class Proyect {
private int id;
    private String name;
    private HashSet<Task> task;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Task> getTask() {
        return task;
    }

    public Proyect(int id, String name) {
        this.id = id;
        this.name = name;
        this.task = new HashSet();
    }

    public Proyect() {
        this(0,"");
    }
    
    public void agregartask(Task tasks){
        task.add(tasks);
    }
    
    public int CantidadTask(){
       return task.size();
    }
     
    public int getCompletedTaskCount() {
        int completedCount = 0;
        for (Task task : task) {
            if (task.isComplet()) {
                completedCount++;
            }
        }
        return completedCount;
    }
    
    public double getCompletedTaskPercentage() {
        if (task.isEmpty()) {
            return 0.0;
        }
        int completedCount = 0;
        for (Task task : task) {
            if (task.isComplet()) {
                completedCount++;
            }
        }
        return (completedCount / (double) task.size()) * 100;
    }
    
}



