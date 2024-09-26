package OOPs;

public class BoxQ6 {

    static class Box{
        private int length;
        private int width;
        private int height;

        Box(int length, int width, int height){
            this.length = length;
            this.width = width;
            this.height = height;
        }

        int getLength(){
            return length;
        }
        int getWidth(){
            return width;
        }
        int getHeight(){
            return height;
        }


        void setLength(int l){
            this.length = l;
        }
        void setWidth(int w){
            this.length = w;
        }
        void setHeight(int h){
            this.length = h;
        }


        public void calculateVolume(){
            System.out.println( "Volume : " + (length*width*height) );
        }
        public void calculateSurfaceArea(){
            System.out.println( "Surface Area : " + ( 2 * ((length*width) + (width*height) + (height*length)) ));
        }
        public void displayDimension(){
            System.out.println("Length : " + length);
            System.out.println("Width : " + width);
            System.out.println("Height : " + height);
        }
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 10, 10);
        b1.displayDimension();
        b1.calculateVolume();
        b1.calculateSurfaceArea();
    }
}
