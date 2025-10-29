package Trabajo2.CES2.Models;

import Trabajo2.CES2.Enums.Raza;
import Trabajo2.CES2.Enums.Rol;

import java.util.ArrayDeque;
import java.util.Deque;


// nuestro entrenador
public class Maestro {

    private String nombre;
    private Raza raza;
    private Rol rol;
    private int partidasGanadas;
    private Deque<Npc> npcs = new ArrayDeque<>();

    public Maestro() {

    }

    public Maestro(String nombre, Raza raza, Rol rol, int partidasGanadas) {
        this.nombre = nombre;
        this.raza = raza;
        this.rol = rol;
        this.partidasGanadas = partidasGanadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void agregarNpc(Npc npc) {
        npcs.add(npc);
    }

    public Deque<Npc> getNpcs() {
        return npcs;
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public Rol getRol() {
        return rol;
    }
}
