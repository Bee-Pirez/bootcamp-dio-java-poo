import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBia = new Dev();
        devBia.setNome("Camila");
        devBia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bia:" + devBia.getConteudosInscritos());
        devBia.progredir();
        devBia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bia:" + devBia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bia:" + devBia.getConteudosConcluidos());
        System.out.println("XP:" + devBia.calcularTotalXp());

        System.out.println("-------");

        Dev devGuga = new Dev();
        devGuga.setNome("Guga");
        devGuga.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Guga:" + devGuga.getConteudosInscritos());
        devGuga.progredir();
        devGuga.progredir();
        devGuga.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Guga:" + devGuga.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Guga:" + devGuga.getConteudosConcluidos());
        System.out.println("XP:" + devGuga.calcularTotalXp());
    }
}