package assignment;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static assignment.Game.identifierEnumMap;
import static java.util.stream.Collectors.toMap;

enum Game {
    ROCK(1), PAPER(2), SCISSOR(3);

    private final int identifier;

    Game(int identifier) {
        this.identifier = identifier;
    }

    public final static Map<Integer, Game> identifierEnumMap = Stream.of(values()).collect(toMap(game -> game.identifier, game -> game));
}

public class RockPaperScissor {

    public static void main(String[] args) {
        System.out.printf("Enter 1 for ROCK.\nEnter 2 for PAPER.\nEnter 3 for SCIRROR.");
        Scanner scanner = new Scanner(System.in);

        String player1Turn = scanner.next();
        System.out.println(player1Turn);
        int player2Turn = ThreadLocalRandom.current().nextInt(3);
        determineWhoWin(new Player(identifierEnumMap.getOrDefault(Integer.parseInt(player1Turn), Game.ROCK), "Player 1"), new Player(identifierEnumMap.get(player2Turn), "Player 2"));
    }

    /**
     *
     * @param player1
     * @param player2
     * @throws NullPointerException if the either parameter player's is null.
     */
    private static void determineWhoWin(Player player1, Player player2) {
        if ((player1.turn() == null) ||  player2.turn() == null) {
            throw new NullPointerException("Player's turn cannot be null");
        }

        if (player1.turn() == player2.turn()) {
            System.out.printf("Player1 {%s}, Player2 {%s}. Match is Draw..\n", player1.turn(), player2.turn());
        } else if (player1.turn() == Game.ROCK) {
            if (player2.turn() == Game.PAPER) {
                System.out.printf("Player1 {%s}, Player2 {%s}. Player 2 Won....\n", player1.turn(), player2.turn());
            } else if (player2.turn() == Game.SCISSOR) {
                System.out.printf("Player1 {%s}, Player2 {%s}. Player 1 Won.....\n", player1.turn(), player2.turn());
            }
        } else if (player1.turn() == Game.PAPER) {
            if (player2.turn() == Game.ROCK) {
                System.out.printf("Player1 {%s}, Player2 {%s}. Player 1 Won....\n", player1.turn(), player2.turn());
            } else if (player2.turn() == Game.SCISSOR) {
                System.out.printf("Player1 {%s}, Player2 {%s}. Player 2 Won.....\n", player1.turn(), player2.turn());
            }
        } else if (player1.turn() == Game.SCISSOR) {
            if (player2.turn() == Game.ROCK) {
                System.out.printf("Player1 {%s}, Player2 {%s}. Player 2 Won....\n", player1.turn(), player2.turn());
            } else if (player2.turn() == Game.PAPER) {
                System.out.printf("Player1 {%s}, Player2 {%s}. Player 1 Won.....\n", player1.turn(), player2.turn());
            }
        }
    }
}

record Player(Game turn, String playerName) { }
