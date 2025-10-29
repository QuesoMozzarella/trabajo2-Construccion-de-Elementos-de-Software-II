package Trabajo2.CES2.Controllers;

import Trabajo2.CES2.Enums.Rol;
import Trabajo2.CES2.Models.Maestro;
import Trabajo2.CES2.Models.Npc;
import Trabajo2.CES2.Repository.MaestroRepository;
import Trabajo2.CES2.Repository.NpcRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.stream.Collectors;

import static Trabajo2.CES2.Repository.NpcRepository.npcsRepo;

@Controller
public class Controlador {

    //punto 2
    @GetMapping("peticion1")
    public String peticion1(Model model) {


        Stack<Npc> npcsStack = NpcRepository.npcsRepo;
        ListIterator<Npc> listIterator = npcsStack.listIterator();

        List<Npc> listaDesdeStack = new ArrayList<>();
        while (listIterator.hasNext()) {
            listaDesdeStack.add(listIterator.next());
        }

        MaestroRepository maestroRepo = new MaestroRepository();
        Maestro maestro = maestroRepo.maestroM.getFirst();

        Deque<Npc> dequeDesdeMaestro = new ArrayDeque<>();
        Iterator<Npc> iterator = maestro.getNpcs().iterator();
        while (iterator.hasNext()) {
            dequeDesdeMaestro.add(iterator.next());
        }


        model.addAttribute("listaStack", listaDesdeStack);
        model.addAttribute("listaDeque", dequeDesdeMaestro);

        return "vista1";
    }

    // punto 3
    @GetMapping("peticion2")
    public String peticion2(Model model) {

        Deque<Npc> dequeNpc = new ArrayDeque<>(npcsRepo);

        Deque<Npc> magosFiltrados = dequeNpc.stream()
                .filter(npc -> npc.getRol() == Rol.MAGO)
                .collect(Collectors.toCollection(ArrayDeque::new));

        model.addAttribute("magos", magosFiltrados);

        return "vista2";
    }


    // punto 4
    @GetMapping("peticion3")
    public String peticion3(Model model){

        String salida = npcsRepo.stream()
                .map(npc -> npc.getNombre() + ": " + Npc.calcularTotalPuntos.apply(npc) + " puntos")
                .collect(Collectors.joining(", "));

        model.addAttribute("salida", salida);

        return "vista3";
    }



}
