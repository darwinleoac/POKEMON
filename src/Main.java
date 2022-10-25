public class Main {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        pikachu.atacarPlacaje();
        pikachu.atacarImpactTrueno();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarDrenaje();
        squirtle.atacarHidroBomba();
        squirtle.atacarBurbuja();
        charmander.atacarLanzaLlamas();
        charmander.atacarAraniazo();
    }
}