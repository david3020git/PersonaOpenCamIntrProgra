package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(32);
        persona.setNombre("david");
        persona.setTelefono("644707196");
        System.out.println(persona.toString());

    }
}