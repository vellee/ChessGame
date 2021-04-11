import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();

        for (Player player : players) {
            System.out.println("Player #" + players.indexOf(player) + ":\n");
            System.out.println(player);
            main.createPieces();
        }

        HashMap<String, Piece> pieceHashMap = main.createPieces();
        //System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);

    }

    public ArrayList<Player> createPlayers() {
        Player whitePlayer = new Player("Perry Weiss", "perry@gmail.com", true, 100, 20);
        Player blackPlayer = new Player("Scott Williams", "scott@mail.su", false, 200, 22);

        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }

    public HashMap<String, Piece> createPieces() {
        King whiteKing = new King(new Spot("h", 7), "white_king", true);
        King blackKing = new King(new Spot("d", 8), "black_king", false);
        Rook whiteRookA = new Rook(new Spot("a", 7), "white_rook_a", true);
        Rook whiteRookB = new Rook(new Spot("g", 7), "white_rook_b", true);
        Knight blackKnightA = new Knight(new Spot("d", 6), "black_knight_a", false);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRookA.getId(), whiteRookA);
        pieceHashMap.put(whiteRookB.getId(), whiteRookA);
        pieceHashMap.put(blackKnightA.getId(), blackKnightA);
        return pieceHashMap;
    }

    public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap) {
        //move1
        try {
            players.get(0).movePiece(hashMap.get("white_rook_a"), new Spot("a", 8));
        } catch (IllegalArgumentException err) {
            System.out.println("The move is incorrect, please try again");
        }
        try {
            players.get(1).movePiece(hashMap.get("black_knight_a"), new Spot("c", 8));
        } catch (IllegalArgumentException err) {
            System.out.println("The move is incorrect, please try again");
        }
    }

}
