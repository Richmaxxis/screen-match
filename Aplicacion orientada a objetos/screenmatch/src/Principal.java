import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("SpiderMan No Way Home");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(148);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.datosDePeliculas();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(9);
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());






























//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre= "SpiderMan Far From Home";
//        otraPelicula.fechaDeLanzamiento = 2019;
//        otraPelicula.duracionEnMinutos = 130;
//
//       otraPelicula.datosDePeliculas();
   }

}
