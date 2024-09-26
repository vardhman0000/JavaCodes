package OOPs;

public class MarketerQ8 {

    static class Marketer{
        String name;
        String company;
        double yoe;
        String spec;

        Marketer(String name, String company, double yoe, String spec){
            this.name = name;
            this.company = company;
            this.yoe = yoe;
            this.spec = spec;
        }

        void displayDetails(){
            System.out.println("Name : " + name);
            System.out.println("Company : " + company);
            System.out.println("Years of Experience : " + yoe);
            System.out.println("Specialization : " + spec);
        }

        void promoteProduct(){
            System.out.println(name + " is a great product!!");
        }


        String setName(String name){
            return name;
        }
        String setCompany(String company){
            return company;
        }
        int setYOE(int yoe){
            return yoe;
        }
        String setSpec(String spec){
            return spec;
        }


        void getName(){
            System.out.println(name);
        }
        void getCompany(){
            System.out.println(company);
        }void getYOE(){
            System.out.println(yoe);
        }void getSpec(){
            System.out.println(spec);
        }

    }

    public static void main(String[] args) {
        Marketer m1 = new Marketer("ABC", "DEF", 5, "Cyber Security");
        m1.displayDetails();
        m1.promoteProduct();
    }


}
