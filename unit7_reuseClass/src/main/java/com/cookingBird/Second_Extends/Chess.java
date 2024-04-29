package com.cookingBird.Second_Extends;


class Game {
    public Game(int i) {
        System.out.println("Game " + i);
    }

//    public Game() {
//        System.out.println("pure game");
//    }
}

class BoardGame extends Game {
    public BoardGame(int i) {
        super(i);
        System.out.println("board game");
    }
}

public class Chess extends BoardGame {
    public Chess() {
        super(11);
        System.out.println("chess");
    }

    public static void main(String[] args) {
        new Chess();
    }
}
