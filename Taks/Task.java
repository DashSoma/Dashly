/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taks;

import Comentarios.Commet;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author dashs
 */
public class Task {
    private int id;
    private String description;
    private boolean complet;
    private User user;
    private ArrayList<Commet> coment;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplet() {
        return complet;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Commet> getComent() {
        return coment;
    }

    public void setComplet(boolean complet) {
        this.complet = complet;
    }

    public Task(int id, String description, String complet, User user) {
        this.id = id;
        this.description = description;
        this.complet = false;
        this.user = user;
        this.coment = new ArrayList();
    }
    
    public Task(){
        this(0,"",new User(),new ArrayList());
    }
    
   public void agregarEstudiante(Task task) {
        task.add(task);
    }
    
}
