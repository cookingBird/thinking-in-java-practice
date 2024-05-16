package com.cookingBird;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {
    public void g() {}
}

class Powder extends Snow {
    public void f() {}
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());
        snow3.stream().findFirst();
        snow3.stream().findAny();

//        List snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
//        // s is Object
//        for (Snow s : snow4){
//            s.g();
//        }
        Light light = new Light();
        List<Snow> snow4 = Arrays.asList(new Light(), new Heavy(),light);

        // s is Object
        for (Snow s : snow4){
            s.g();
        };
        System.out.println(snow4.contains(light));
        snow4.add(light);
//        snow4.set(2,null);
        System.out.println(snow4.remove(light));
    }
}
