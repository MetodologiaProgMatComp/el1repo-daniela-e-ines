package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2Composicion;

public class MainStaffComposicion {
    public static void main(String[]args) {
        es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2Composicion.Staff st1 = new Staff("Luis", "Av.Barcelona", "Buero Vallejo", 23.44);
        System.out.println(st1);

        System.out.println("School: " + st1.getSchool());
        st1.setSchool("El Doncel");
        System.out.println(st1);

        System.out.println("Pay: " + st1.getSchool());
        st1.setPay(124.56);
        System.out.println(st1);
    }
}
