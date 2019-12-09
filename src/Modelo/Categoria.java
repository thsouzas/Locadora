/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cliente
 */
public class Categoria extends javax.swing.JFrame {
    private int codigo;
    private String nome;

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    /**
     * Creates new form Categoria
     */
    public void setNome(String nome) {    
        this.nome = nome;
    }
}