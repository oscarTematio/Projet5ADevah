/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Oscar Teamatio
 */
public class Parametres {
    static  private int OrientationInitiales;
    static private String Nature;
    static private int NombredEssaiTige;
    static private int NombredEssaiCadre;
    static private int NombresTotal;
    static private  int[] ValeursTige; 
    static private  int[] ValeursCadre; 

    public Parametres() {
    }

    public static int getNombresTotal() {
        return NombresTotal;
    }

    public static void setNombresTotal(int NombresTotal) {
        Parametres.NombresTotal = NombresTotal;
    }
    
    static private boolean Aleatoire;
    static private double Vitesse;

    public static int getOrientationInitiales() {
        return OrientationInitiales;
    }

    public static String getNature() {
        return Nature;
    }

    public static int getNombredEssaiTige() {
        return NombredEssaiTige;
    }

    public static int getNombredEssaiCadre() {
        return NombredEssaiCadre;
    }

    public static int[] getValeursTige() {
        return ValeursTige;
    }

    public static int[] getValeursCadre() {
        return ValeursCadre;
    }

    public static boolean isAleatoire() {
        return Aleatoire;
    }

    public static double getVitesse() {
        return Vitesse;
    }

    public static void setOrientationInitiales(int OrientationInitiales) {
        Parametres.OrientationInitiales = OrientationInitiales;
    }

    public static void setNature(String Nature) {
        Parametres.Nature = Nature;
    }

    public static void setNombredEssaiTige(int NombredEssaiTige) {
        Parametres.NombredEssaiTige = NombredEssaiTige;
    }

    public static void setNombredEssaiCadre(int NombredEssaiCadre) {
        Parametres.NombredEssaiCadre = NombredEssaiCadre;
    }

    public static void setValeursTige(int[] ValeursTige) {
        Parametres.ValeursTige = ValeursTige;
    }

    public static void setValeursCadre(int[] ValeursCadre) {
        Parametres.ValeursCadre = ValeursCadre;
    }

    public static void setAleatoire(boolean Aleatoire) {
        Parametres.Aleatoire = Aleatoire;
    }

    public static void setVitesse(double Vitesse) {
        Parametres.Vitesse = Vitesse;
    }
    
    
}
