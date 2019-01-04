/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Oscar Teamatio
 */
public class Parametres {
static  private int OrientationInitiales;
  static private String Nature;
static  private int NombredEssaiTige;
static private int NombredEssaiCadre;
static private int NombresTotal;
 static private  int[] ValeursTige; 
 static private  int[] ValeursCadre; 
static private boolean Aleatoire;
static  private double Vitesse;

    public Parametres() {
    }

    public Parametres(int OrientationInitiales, String Nature, int NombredEssaiTige, int NombredEssaiCadre, int NombresTotal, int[] ValeursTige, int[] ValeursCadre, boolean Aleatoire, double Vitesse) {
        Parametres.OrientationInitiales = OrientationInitiales;
        Parametres.Nature = Nature;
        Parametres.NombredEssaiTige = NombredEssaiTige;
        Parametres.NombredEssaiCadre = NombredEssaiCadre;
        Parametres.NombresTotal = NombresTotal;
        Parametres.ValeursTige = ValeursTige;
        Parametres.ValeursCadre = ValeursCadre;
        Parametres.Aleatoire = Aleatoire;
        Parametres.Vitesse = Vitesse;
    }

    public int getOrientationInitiales() {
        return OrientationInitiales;
    }

    public String getNature() {
        return Nature;
    }

    public int getNombredEssaiTige() {
        return NombredEssaiTige;
    }

    public int getNombredEssaiCadre() {
        return NombredEssaiCadre;
    }

    public int getNombresTotal() {
        return NombresTotal;
    }

    public int[] getValeursTige() {
        return ValeursTige;
    }

    public int[] getValeursCadre() {
        return ValeursCadre;
    }

    public boolean isAleatoire() {
        return Aleatoire;
    }

    public double getVitesse() {
        return Vitesse;
    }

    public void setOrientationInitiales(int OrientationInitiales) {
        Parametres.OrientationInitiales = OrientationInitiales;
    }

    public void setNature(String Nature) {
        Parametres.Nature = Nature;
    }

    public void setNombredEssaiTige(int NombredEssaiTige) {
        Parametres.NombredEssaiTige = NombredEssaiTige;
    }

    public void setNombredEssaiCadre(int NombredEssaiCadre) {
        Parametres.NombredEssaiCadre = NombredEssaiCadre;
    }

    public void setNombresTotal(int NombresTotal) {
        Parametres.NombresTotal = NombresTotal;
    }

    public void setValeursTige(int[] ValeursTige) {
        Parametres.ValeursTige = ValeursTige;
    }

    public void setValeursCadre(int[] ValeursCadre) {
        Parametres.ValeursCadre = ValeursCadre;
    }

    public void setAleatoire(boolean Aleatoire) {
        this.Aleatoire = Aleatoire;
    }

    public void setVitesse(double Vitesse) {
        this.Vitesse = Vitesse;
    }

    
    
    


    
    
}
