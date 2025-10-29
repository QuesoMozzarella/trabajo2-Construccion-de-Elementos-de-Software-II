package Trabajo2.CES2.Models;

import Trabajo2.CES2.Enums.Raza;
import Trabajo2.CES2.Enums.Rol;

import java.util.Stack;
import java.util.function.Function;

// nuestro jugador
public class Npc {

    private String nombre;
    private Raza raza;
    private Rol rol;
    private Stack<Integer> puntos = new Stack<>();

    public Npc(){

    }

    public Npc(String nombre, Raza raza, Rol rol){
        this.nombre = nombre;
        this.raza = raza;
        this.rol = rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void agregarPuntos(int puntosAg){
        puntos.push(puntosAg);
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public Rol getRol() {
        return rol;
    }

    public Stack<Integer> getPuntos() {
        return puntos;
    }

    public static final Function<Npc, Integer> calcularTotalPuntos =
            npc -> npc.getPuntos().stream().mapToInt(Integer::intValue).sum();




}
