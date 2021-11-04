package br.com.exemplo.security;

import java.io.Serializable;

public class CredenciaisDTO implements Serializable {

    public CredenciaisDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public CredenciaisDTO() {

    }

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
