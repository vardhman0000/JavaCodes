package Practice;

public class Interface {

    interface CIRCLE {
        float pi = 3.14f; // By default -> public, static , final
        void area (float x); // By default -> abstract, public
    }

    static class SHAPE implements CIRCLE {
        public void area (float r){ // public here required to increase the access for overriding
            System.out.println(pi * r * r);
        }
    }

    public static void main(String[] args) {
        System.out.println(CIRCLE.pi);

        CIRCLE ref = new SHAPE();
        ref.area(10);
    }

}
