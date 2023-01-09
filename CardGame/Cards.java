package CardGame;

public class Cards {
    public static void main(String[] args) {
        Blackjack newGame = new Blackjack();
        
        System.out.println(newGame.parseCard("ace"));
    }
}
