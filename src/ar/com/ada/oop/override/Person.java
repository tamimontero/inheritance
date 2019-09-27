package ar.com.ada.oop.override;

import java.util.Objects;

public class Person {
    private String name, lastName;
    private Integer dni;

    public Person(){}
    public Person(String name){
        this.name = name;
    }
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public Person(String name, String lastName, Integer dni){
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public Integer getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Person: " +name +" " +lastName + " DNI: "+dni;
    }
    @Override
    public int hashCode() {
        return 2 * Objects.hash(name, lastName, dni);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return dni.equals(that.dni);
    }

}
