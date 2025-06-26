package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.CriadorPersonagem;

public class Main {

    public static void main(String[] args) {

        CriadorPersonagem factory = new CriadorPersonagem();
        Personagem personagem = factory.criaGuerreiroOrc("Josualdo");
        System.out.println(personagem);

    }
}
