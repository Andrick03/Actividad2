public class Calificacion {
    public static void main(String[] args){
        Integer[] calificaciones = new Integer[5];
        calificaciones[0]= 60;
        calificaciones[1]= 70;
        calificaciones[2]= 80;
        calificaciones[3]= 90;
        calificaciones[4]= 100;

        String nombre = "Andrick Moreno Jasso";

        int sum = 0;

        for (int counter = 0; counter <calificaciones.length; counter++) {
            sum+= calificaciones[counter];
        }
        if ( sum/5>= 91 && sum/5<= 100) {
            System.out.println("La calificacion de este estudiante es A");
        } else if (sum/5>= 81 && sum/5<= 90) {
            System.out.println("La calificacion de este estudiante es B");
        }else if (sum/5>= 71 && sum/5<= 80) {
            System.out.println("La calificacion de este estudiante es C");
        } else if (sum/5>= 61 && sum/5<= 70) {
            System.out.println("La calificacion de este estudiante es D");
        }else if (sum/5>= 51 && sum/5<= 60) {
            System.out.println("La calificacion de este estudiante es E");
        }else {
            System.out.println("La calificacion de este estudiante es F");
        }


        System.out.println("El nombre del estudiante es " +nombre);
        System.out.println("El promedio de este estudiante es " + sum/5);
    }

}
