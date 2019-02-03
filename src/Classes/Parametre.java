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
public class Parametre {
    private  static  int OrientationInitiales;
  private static  String Nature;
  private static   int NombredEssaiTige;
  private static  int NombredEssaiCadre;
  private static  int NombresTotal;
  private static   int[] ValeursTige; 
  private static int[] ValeursCadre; 
  private static boolean AleatoireCadre;
  private static boolean AleatoireTige;
  private static double Vitesse;
 private static int reference;
    public Parametre() {
    }

    public static int getReference() {
        return reference;
    }

    public static void setOrientationInitiales(int OrientationInitiales) {
        Parametre.OrientationInitiales = OrientationInitiales;
    }

    public static void setReference(int reference) {
        Parametre.reference = reference;
    }

    public static void setNature(String Nature) {
        Parametre.Nature = Nature;
    }

    public static void setNombredEssaiTige(int NombredEssaiTige) {
        Parametre.NombredEssaiTige = NombredEssaiTige;
    }

    public static void setNombredEssaiCadre(int NombredEssaiCadre) {
        Parametre.NombredEssaiCadre = NombredEssaiCadre;
    }

    public static void setNombresTotal(int NombresTotal) {
        Parametre.NombresTotal = NombresTotal;
    }

    public static void setValeursTige(int[] ValeursTige) {
        Parametre.ValeursTige = ValeursTige;
    }

    public static void setValeursCadre(int[] ValeursCadre) {
        Parametre.ValeursCadre = ValeursCadre;
    }

    public static void setAleatoireCadre(boolean AleatoireCadre) {
        Parametre.AleatoireCadre = AleatoireCadre;
    }

    public static void setAleatoireTige(boolean AleatoireTige) {
        Parametre.AleatoireTige = AleatoireTige;
    }

    public static void setVitesse(double Vitesse) {
        Parametre.Vitesse = Vitesse;
    }

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

    public static int getNombresTotal() {
        return NombresTotal;
    }

    public static int[] getValeursTige() {
        return ValeursTige;
    }

    public static int[] getValeursCadre() {
        return ValeursCadre;
    }

    public static boolean isAleatoireCadre() {
        return AleatoireCadre;
    }

    public static boolean isAleatoireTige() {
        return AleatoireTige;
    }

    public static double getVitesse() {
        return Vitesse;
    }
  
    
}
