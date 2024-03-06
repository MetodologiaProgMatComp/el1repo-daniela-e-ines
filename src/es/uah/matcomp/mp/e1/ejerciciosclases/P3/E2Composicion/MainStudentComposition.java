package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2Composicion;

public class MainStudentComposition {
    public static void main(String[]args){
        es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2Composicion.Student s1 = new Student("Andrea", "C/Tinte", "E.S.O", 2024, 0.00);
        System.out.println(s1);

        System.out.println("Program = " + s1.getProgram());
        s1.setProgram("Bachillerato");
        System.out.println(s1);

        System.out.println("Year = " + s1.getYear());
        s1.setYear(2013);
        System.out.println(s1);

        System.out.println("Fee = " + s1.getFee());
        s1.setFee(156.8);
        System.out.println(s1);
    }
}
