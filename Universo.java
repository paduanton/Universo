package universo;

/**
 *
 * @author marcelo
 */
public class Universo {

    public static void main(String[] args) {
        Purgatorio purgatorio = new Purgatorio();
        Animal animal = new Animal();
        Humano humano = new Humano();
        Humano humano2 = new Humano();
        Anjo anjo = new Anjo();
        
        humano.setFala(false);
        humano.setFala(true);
        
        try{
            animal.setNome("Gato Preto");
            humano.setNome("Pink");
            humano2.setNome("Floyd");
            anjo.setNome("Lucifer");
            
            System.out.println("O nome do animal é "+animal.getNome());
            purgatorio.julgar(humano);
            purgatorio.julgar(anjo);
            
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
}
