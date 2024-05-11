package com.cookingBird;

class Actor {
    public void act() {
        System.out.println("Actor act");
    }
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("HappyActor act");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("SadActor act");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void changeActor() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}

public class ActorTest {
    public static void main(String[] args) {

        Stage stage = new Stage();
        stage.performPlay();
        stage.changeActor();
        stage.performPlay();
    }
}
