package guest.inter;

public class main1 implements interface1, interface2 {
    public static void main(String[] args) {
        System.out.println(new main1().HelloAskarKhaimulldin());
    }

    @Override
    public String HelloAskarKhaimulldin() {
        return "Good Evening!";
    }
}