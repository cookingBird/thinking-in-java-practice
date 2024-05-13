package com.cookingBird;


class ScopeClass {
    private void internalTracking(boolean b) {
        if(b){
            class TrackingSlip {
                private String id;

                TrackingSlip(String s){
                    id = s;
                }

                String getSlip(){
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("slip");

            System.out.println(ts.getSlip());
        }
        // error: can't resolve TrackingSlip
//        TrackingSlip ts = new TrackingSlip("slip");
    }

}

public class MethodClass {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {

        MethodClass mc = new MethodClass();
        Destination d = mc.destination("Bangkok");
        System.out.println(d.readLabel());
    }
}
