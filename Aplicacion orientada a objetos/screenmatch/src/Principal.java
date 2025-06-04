public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre= "SpiderMan No Way Home";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 148;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre= "SpiderMan Far From Home";
        otraPelicula.fechaDeLanzamiento = 2019;
        otraPelicula.duracionEnMinutos = 130;

        System.out.println("Mi otra pelicula es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    }
}
