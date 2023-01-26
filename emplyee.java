public class Employeee {
    
    int id;
    String dept;

    public Employeee(int id1, String depp) {
        id = id1;
        dept = depp;
    }

    public static void main(String[] args) {
        Employeee vro = new Employeee(34,"boomer");
        System.out.println(vro.dept);
    }
}
