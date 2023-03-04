package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        Dev devGabriel = new Dev();
        Dev devJoao = new Dev();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        devGabriel.setNome("Gabriel");
        devGabriel.InscreverBootcamp(bootcamp);
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("Conteudos Inscritos Gabriel: "+devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gabriel: "+devGabriel.getConteudosConcluidos());
        System.out.println("Dev Gabriel XP: "+ devGabriel.calcularTotalXp());

        devJoao.setNome("João");
        devJoao.InscreverBootcamp(bootcamp);
        devJoao.progredir();
        System.out.println("-------------------------------------------------");
        System.out.println("Conteudos Inscritos João: "+devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João: "+devJoao.getConteudosConcluidos());
        System.out.println("Dev João XP: "+ devJoao.calcularTotalXp());






    }
}