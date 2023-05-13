/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beolvasas;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author TumpekPéter(SZF_E_20
 */
public class Fuvar {
    private int taxiID;
    private String indulas;
    private int idotartam;
    private double tavolsag;
    private double viteldij;
    private double borravalo;
    private String fizMod;

    public Fuvar(int taxiID, String indulas, int idotartam, double tavolsag, double viteldij, double borravalo, String fizMod) {
        this.taxiID = taxiID;
        this.indulas = indulas;
        this.idotartam = idotartam;
        this.tavolsag = tavolsag;
        this.viteldij = viteldij;
        this.borravalo = borravalo;
        this.fizMod = fizMod;
        
        /* fájl egy sor=
        5240;2016-12-15 23:45:00;900;2,5;10,75;2,45;bankkártya
        */
        
    }

    public Fuvar(String sor) throws ParseException {
        sor = sor.replace(',', '.');
        
        String[] s = sor.split(";");
        this.taxiID = Integer.parseInt(s[0]);
        this.indulas = s[1];
        this.idotartam = Integer.parseInt(s[2]);
        
        this.tavolsag = Double.parseDouble(s[3]); 
        //  /\
        // /  \
        // ----
        //  ||
        //  ||
        //helyette lehet így, hogy vesszőt kezelje: (csere helyett -> sor = sor.replace(',', '.');)
//        NumberFormat nf = NumberFormat.getInstance();
//        Number num = nf.parse(s[3]);
//        this.tavolsag = num.doubleValue();
        
        this.viteldij = Double.parseDouble(s[4]);
        this.borravalo = Double.parseDouble(s[5]);
        this.fizMod = s[6];
        
        
    }

    public int getTaxiID() {
        return taxiID;
    }

    public String getIndulas() {
        return indulas;
    }

    public int getIdotartam() {
        return idotartam;
    }

    public double getTavolsag() {
        return tavolsag;
    }

    public double getViteldij() {
        return viteldij;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public String getFizMod() {
        return fizMod;
    }

    @Override
    public String toString() {
        return "Fuvar{" + "taxiID=" + taxiID + ", indulas=" + indulas + ", idotartam=" + idotartam + ", tavolsag=" + tavolsag + ", viteldij=" + viteldij + ", borravalo=" + borravalo + ", fizMod=" + fizMod + '}';
    }
    
    
    
}
