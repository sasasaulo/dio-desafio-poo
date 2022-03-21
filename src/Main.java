import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição mentoria Java", LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev saulo = new Dev();
        saulo.setNome("Saulo");
        saulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Saulo: " + saulo.getConteudosInscritos());
        saulo.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Saulo: " + saulo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Saulo: " + saulo.getConteudosConcluidos());
        System.out.println("XP: " + saulo.calcularTotalXp());

        System.out.println("-----------------------------------");

        Dev maria = new Dev();
        maria.setNome("Maria");
        maria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + maria.getConteudosInscritos());
        System.out.println("--");
        maria.progredir();
        maria.progredir();
        maria.progredir();
        maria.progredir();
        System.out.println("Conteúdos inscritos Maria: " + maria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maria: " + maria.getConteudosConcluidos());
        System.out.println("XP Total: " + maria.calcularTotalXp());
    }
}
