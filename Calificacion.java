public class Calificacion {
    public static void main(String[] args){
        Integer[] calificaciones = new Integer[5];
        calificaciones[0]= 60;
        calificaciones[1]= 70;
        calificaciones[2]= 80;
        calificaciones[3]= 90;
        calificaciones[4]= 100;

        String nombre = "Andrick Moreno Jasso";
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("\n" + "Calificaciones: " + "\n" + "Calificacion 1 :" + calificaciones[0] + "\n" + "Calificacion 2 :" + calificaciones[1] + "\n" + "Calificacion 3 :" + calificaciones[2] + "\n" + "Calificacion 4 :" + calificaciones[3] + "\n" + "Calificacion 5 :" + calificaciones[4] + "\n");

        int sum = 0;

        for (int counter = 0; counter <calificaciones.length; counter++) {
            sum+= calificaciones[counter];
        }

        System.out.println("Promedio: " + sum/5);
        if ( sum/5>= 91 && sum/5<= 100) {
            System.out.println("Calificacion: A");
        } else if (sum/5>= 81 && sum/5<= 90) {
            System.out.println("Calificacion: B");
        }else if (sum/5>= 71 && sum/5<= 80) {
            System.out.println("Calificacion: C");
        } else if (sum/5>= 61 && sum/5<= 70) {
            System.out.println("Calificacion: D");
        }else if (sum/5>= 51 && sum/5<= 60) {
            System.out.println("Calificacion: E");
        }else {
            System.out.println("Calificacion: F");
        }
    }

}
