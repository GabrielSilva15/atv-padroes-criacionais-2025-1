package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arqueiros.Orc.ArmaArqueiroOrcSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class ArqueiroOrc extends Personagem {

    public ArqueiroOrc(String nome) {

        super(nome,"Orc", "Arqueiro", 14,8,12, 120,40,
                ArmaArqueiroOrcSingleton.getInstance(),
                ArmaduraFactory.getInstance("Arqueiro","Orc"),
                new String[]{"Tiro Brutal", "Intimidação"});

    }
}

