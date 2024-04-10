public class Main {
    public static void main(String[] args) {

        System.out.println("peliculas");
        System.out.println("otra pelicula");
        int fechaLanzamiento=1999;
        boolean incluidoPlan= true;
        double notaPelicula=8.2;

        double media=(8.2 + 6.0 +9.0)/3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                mejor pelicula del fin de milenio
                fue lanzada en:
                """ + fechaLanzamiento;

        System.out.println(sinopsis);

        String saludo = "Hola, mi nombre es ";
        String nombre= "Alicia ";
        String continuacion = "y mi edad es ";
        int edad = 17;
        System.out.println(saludo + nombre + continuacion + edad);


    }
}