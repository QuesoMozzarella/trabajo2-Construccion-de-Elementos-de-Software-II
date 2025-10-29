package Trabajo2.CES2.Repository;

import Trabajo2.CES2.Enums.Raza;
import Trabajo2.CES2.Enums.Rol;
import Trabajo2.CES2.Models.Maestro;

import java.util.ArrayList;
import java.util.List;

public class MaestroRepository {

    public final List<Maestro> maestroM = new ArrayList<>();

    public MaestroRepository() {

        Maestro merlangas = new Maestro("Merlangas", Raza.HUMANO, Rol.INVOCADOR, 99);

        NpcRepository.npcsRepo.stream()
                .limit(5)
                .forEach(merlangas::agregarNpc);

        maestroM.add(merlangas);
    }


}