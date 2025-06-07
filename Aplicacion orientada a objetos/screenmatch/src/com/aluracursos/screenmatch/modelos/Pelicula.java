package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalDeEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

   public void datosDePeliculas(){
        System.out.println("com.aluracursos.screenmatch.modelos.Pelicula: " + nombre);
        System.out.println("Se estreno en: " + fechaDeLanzamiento);
        System.out.println("Duracion: " + duracionEnMinutos + " minutos");
    }
    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeEvaluaciones ++;

    }

   public double calculaMedia(){
        return sumaDeEvaluaciones / totalDeEvaluaciones;
    }

}
