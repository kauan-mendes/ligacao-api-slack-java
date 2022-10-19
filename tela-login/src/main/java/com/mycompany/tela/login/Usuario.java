
package com.mycompany.tela.login;

/**
 *
 * @author kauan.mendes
 */
public class Usuario {
    

    private String email; 
    private String senha;

    public void compararDados(String email, String senha) {  
       
        this.email = email;
        this.senha= senha;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
   

    @Override
    public String toString() {
        return " userr  \n \n email:" + email + "\n senha:" + senha;
    }
    
}
