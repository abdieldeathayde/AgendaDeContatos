package com.agendadecontatos.demo.controller;

import com.agendadecontatos.demo.entities.Agenda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;



@RestController
@RequestMapping(value = "/agendas")
public class AgendaController {


    @GetMapping
    public List<Agenda> getAllContacts() {



        Agenda a1 = new Agenda("Abdiel", 984567721);
        Agenda a2 = new Agenda("Emanoel", 999253254);
        Agenda a3 = new Agenda("Gabriel", 991271489);

        a3.setNumero(992376455);

        List<Agenda> list;
        list = Arrays.asList(a1, a2, a3);

        Set<Agenda> contatosSet = new HashSet<>();
        contatosSet.add(a1);
        contatosSet.add(a2);
        contatosSet.add(a3);

        System.out.println(contatosSet);




        Scanner scan = new Scanner(System.in);

        String contatoASerBuscado;
        System.out.println("Digite o nome do contato a ser buscado: ");
        contatoASerBuscado = scan.next();
        int numero = 984567721;
        buscarContato(contatoASerBuscado, numero, contatosSet);

        return list;
    }

    public void buscarContato(String nome, int numero, Set<Agenda> contactsAgenda){
        boolean encontrado = contactsAgenda.stream().anyMatch(c -> c.getNome().equals(nome));

        if (encontrado) {
            System.out.println("Nome: " + nome + " número: " + numero);

        } else {
            System.out.println("Não foi possível encontrar o nome solicitado!");
        }

        System.out.println("Obrigado por utilizar este sistema!");
    }






}
