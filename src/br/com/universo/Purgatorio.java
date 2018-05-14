package br.com.universo;

public class Purgatorio {

    public void julgar(Falante julgado) {
        if (julgado.falar() == true) {
            System.out.printf("%s é um %s e fala verdade!\n", julgado.getNome(), julgado.getClass().getName().replaceAll("universo.", ""));
        } else {
            System.out.printf("%s é um %s e fala mentira!\n", julgado.getNome(), julgado.getClass().getName().replaceAll("universo.", ""));
        }
    }
}
