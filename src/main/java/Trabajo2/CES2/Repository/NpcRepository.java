package Trabajo2.CES2.Repository;

import Trabajo2.CES2.Enums.Raza;
import Trabajo2.CES2.Enums.Rol;
import Trabajo2.CES2.Models.Npc;
import java.util.Stack;

public class NpcRepository {

    public final static Stack<Npc> npcsRepo = new Stack<>() {{

        Npc npc1 = new Npc("la doña de los chuzos", Raza.ELFO, Rol.CURADOR);
        npc1.agregarPuntos(5); npc1.agregarPuntos(3); npc1.agregarPuntos(4); npc1.agregarPuntos(2); npc1.agregarPuntos(6);
        push(npc1);

        Npc npc2 = new Npc("vulgarcito", Raza.HUMANO, Rol.GUERRERO);
        npc2.agregarPuntos(3); npc2.agregarPuntos(4); npc2.agregarPuntos(5); npc2.agregarPuntos(6); npc2.agregarPuntos(7);
        push(npc2);

        Npc npc3 = new Npc("JulioH", Raza.DIOSA, Rol.MAGO);
        npc3.agregarPuntos(8); npc3.agregarPuntos(6); npc3.agregarPuntos(7); npc3.agregarPuntos(9); npc3.agregarPuntos(10);
        push(npc3);

        Npc npc4 = new Npc("El mueco", Raza.DEMONIO, Rol.TANQUE);
        npc4.agregarPuntos(2); npc4.agregarPuntos(3); npc4.agregarPuntos(4); npc4.agregarPuntos(5); npc4.agregarPuntos(6);
        push(npc4);

        Npc npc5 = new Npc("uni-tx", Raza.ELFO, Rol.MAGO);
        npc5.agregarPuntos(3); npc5.agregarPuntos(1); npc5.agregarPuntos(5); npc5.agregarPuntos(4); npc5.agregarPuntos(2);
        push(npc5);

        Npc npc6 = new Npc("taylord", Raza.GIGANTE, Rol.MAGO);
        npc6.agregarPuntos(5); npc6.agregarPuntos(2); npc6.agregarPuntos(9); npc6.agregarPuntos(4); npc6.agregarPuntos(25);
        push(npc6);

        Npc npc7 = new Npc("el lord de las tinieblas", Raza.DESCONOCIDA, Rol.PALADIN);
        npc7.agregarPuntos(4); npc7.agregarPuntos(3); npc7.agregarPuntos(4); npc7.agregarPuntos(7); npc7.agregarPuntos(20);
        push(npc7);

        Npc npc8 = new Npc("el pepé ", Raza.DEMONIO, Rol.TANQUE);
        npc8.agregarPuntos(9); npc8.agregarPuntos(3); npc8.agregarPuntos(5); npc8.agregarPuntos(8); npc8.agregarPuntos(24);
        push(npc8);


    }};
}
