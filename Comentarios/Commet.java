/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comentarios;

import Users.User;

/**
 *
 * @author zulay
 */
public class Commet {
    private int id;
    private User user;
    private String coment;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public Commet(int id, User user, String coment) {
        this.id = id;
        this.user = user;
        this.coment = coment;
    }
    
    public Commet(){
       this (0, new User(), " ");
    }
}
