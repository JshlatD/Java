public class Exp2_code2 {

    String company_name;
    double screen_size;

    Exp2_code2(String company_name, double screen_size) {
        this.company_name = company_name;
        this.screen_size = screen_size;
    }

    void display() {
        System.out.println("Company Name : " + company_name);
        System.out.println("Screen Size  : " + screen_size + " inches");
        System.out.println();
    }

    public static void main(String[] args) {

        Exp2_code2 m1 = new Exp2_code2("Samsung", 6.5);
        Exp2_code2 m2 = new Exp2_code2("Apple", 6.1);
        Exp2_code2 m3 = new Exp2_code2("OnePlus", 6.7);
        Exp2_code2 m4 = new Exp2_code2("Xiaomi", 6.6);
        Exp2_code2 m5 = new Exp2_code2("Realme", 6.4);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}