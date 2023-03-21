package org.example;

public class Persona {

    private Integer edad;
    private String nombre;
    private String telefono;

    public Persona() {
    }

    public Integer getEdad() {
        return edad;
    }

    public Persona setEdad(Integer edad) {
        this.edad = edad;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Persona setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad='" + edad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
