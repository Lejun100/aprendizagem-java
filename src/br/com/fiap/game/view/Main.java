package br.com.fiap.game.view;

import br.com.fiap.game.model.PersonagemMagico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonagemMagico mago = new PersonagemMagico("Astolfo", 100, "Soltar foguinho");
        //mago.poderMagico = "Soltar gelinho";




        System.out.println(mago.getNome() + " Energia:" + mago.getNivelEnergia() + " Poder: " + mago.getPoderMagico());

        PersonagemMagico cavaleiro = new PersonagemMagico("Amarelo");
        System.out.println(cavaleiro.getNome() + " Energia:" + cavaleiro.getNivelEnergia() + " Poder: " + cavaleiro.getPoderMagico());

    }
}