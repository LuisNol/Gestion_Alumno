package modelo;

import java.util.ArrayList;
import java.util.List;

public class Nota {
     private List<Double> parciales = new ArrayList<>();
     private double medioCurso;
     private double examenFinal;
     private double promedio;


     public Nota( List<Double> parciales,double medioCurso, double examenFinal, double promedio) {
         this.parciales=parciales;
         this.medioCurso = medioCurso;
         this.examenFinal = examenFinal;
        this.promedio = promedio;

    }

    public List<Double> getParciales() {
        return parciales;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public double getMedioCurso() {
        return medioCurso;
    }
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setMedioCurso(double medioCurso) {
        this.medioCurso = medioCurso;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public void setParciales(List<Double> parciales) {
        this.parciales = parciales;
    }
     
}
