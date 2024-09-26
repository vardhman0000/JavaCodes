//package Practice;
//
//// Polymorphic Argument Polymorphic Return
//
//
//    interface SHAPE {
//        void area();
//    }
//
//    class RECT implements SHAPE {
//        public void area(){
//            System.out.println("RECT AREA!!");
//        }
//        void fun(){
//            System.out.println("Rect Fun!!");
//        }
//    }
//
//    class CIRCLE implements SHAPE {
//        public void area(){
//            System.out.println("CIRCLE AREA!!");
//        }
//        void fun(){
//            System.out.println("Circle Fun!!");
//        }
//    }
//
//    class FACTORY {
//        static void getShape(SHAPE ref){
//            ref.area();
//        }
//        static SHAPE getObject(String what){
//            if(what.equals("GOLA")) return new CIRCLE();
//            else if (what.equals("DIBBA")) return new RECT();
//        }
//    }
//    public class PAPR {
//        public static void main(String[] args) {
//
//    }
//}
