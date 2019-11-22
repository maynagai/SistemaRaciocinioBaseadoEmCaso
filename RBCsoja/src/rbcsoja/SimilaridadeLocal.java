/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcsoja;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mayla
 */
public class SimilaridadeLocal  {
    
    //presisa calcular similariedade
                        
    public int SimilariedadeLocalDamagedArea(String casoProblema, String casoBase) {
        String lowArea = "low-area";
        String upperArea = "upper-area";
        String whole = "whole-field";
        String scat = "scattered";
        String desc = "unknown";
        int auxBase = 0, auxProb = 0,aux; 
        int valorDamaged = 567;
        if(casoBase.compareToIgnoreCase(upperArea)==0) auxBase= 2;
        else if(casoBase.compareToIgnoreCase(lowArea)==0) auxBase=1;
        else if(casoBase.compareToIgnoreCase(whole)==0) auxBase=3;
        else if(casoBase.compareToIgnoreCase(scat)==0) auxBase=0;
        if(casoProblema.compareToIgnoreCase(upperArea)==0) auxProb = 2;
        else if(casoProblema.compareToIgnoreCase(lowArea)==0) auxProb =1;
        else if(casoProblema.compareToIgnoreCase(whole)==0) auxProb =3;
        else if(casoProblema.compareToIgnoreCase(scat)==0) auxProb =0;
        aux = auxProb-auxBase;
        valorDamaged = 1-(Math.abs(aux)/2);              
        return valorDamaged;
    }
    
    //public int SimilaridadeLocalDate(String casoProblema, String[] casoBase){}
    
    public double SimilaridadeLocalCropHist(String casoProblema, String casoBase){      
        String diff = "diff-1st-year";
        String sameFirst = "same-1st-yr";
        String samelast = "same-lst-two-yrs";
        String sameseve = "same-lst-sev-yrs";
        String desc = "Desconhecido";
        double auxBase = 0, auxProb = 0,aux; 
        double valorDamaged = 567;
        if(casoBase.compareToIgnoreCase(samelast)==0) auxBase= 2;
        else if(casoBase.compareToIgnoreCase(sameFirst)==0) auxBase=1;
        else if(casoBase.compareToIgnoreCase(sameseve)==0) auxBase=3;
        else if(casoBase.compareToIgnoreCase(diff)==0) auxBase=0;
        
        
        if(casoProblema.compareToIgnoreCase(samelast)==0) auxProb = 2;
        else if(casoProblema.compareToIgnoreCase(sameFirst)==0) auxProb =1;
        else if(casoProblema.compareToIgnoreCase(samelast)==0) auxProb =3;
        else if(casoProblema.compareToIgnoreCase(diff)==0) auxProb =0;
        
        aux = auxProb-auxBase;
        valorDamaged = 1-(Math.abs(aux)/2);
        //System.out.println("valor = "+ valorDamaged);
        return valorDamaged;
    
    }
    
    public int SimilaridadeLocalSeverity(String casoProblema, String casoBase){
        String min = "Minor";
        String pot = "pot-severe";
        String severe = "severe";
        String desc = "Desconhecido";
        int auxBase = 0, auxProb = 0,aux; 
        int valorDamaged = 567;
        if(casoBase.compareToIgnoreCase(severe)==0) auxBase= 2;
        else if(casoBase.compareToIgnoreCase(pot)==0) auxBase=1;
        else if(casoBase.compareToIgnoreCase(min)==0) auxBase=0;
        if(casoProblema.compareToIgnoreCase(severe)==0) auxProb = 2;
        else if(casoProblema.compareToIgnoreCase(pot)==0) auxProb =1;
        else if(casoProblema.compareToIgnoreCase(min)==0) auxProb =0;
        aux = auxProb-auxBase;
        valorDamaged = 1-(Math.abs(aux));              
        return valorDamaged;
    }
    
    public int SimilaridadeLocalGermination(String casoProblema, String casoBase){
        String cem = "90-100%";
        String oito = "80-89 %";
        String lt = "lt-80%";
        String desc = "Desconhecido";
        int auxBase = 0, auxProb = 0,aux; 
        int valorDamaged = 567;
        if(casoBase.compareToIgnoreCase(lt)==0) auxBase= 2;
        else if(casoBase.compareToIgnoreCase(oito)==0) auxBase=1;
        else if(casoBase.compareToIgnoreCase(cem)==0) auxBase=0;
        if(casoProblema.compareToIgnoreCase(lt)==0) auxProb = 2;
        else if(casoProblema.compareToIgnoreCase(oito)==0) auxProb =1;
        else if(casoProblema.compareToIgnoreCase(cem)==0) auxProb =0;
        aux = auxProb-auxBase;
        valorDamaged = 1-(Math.abs(aux));              
        return valorDamaged;
    }
    
    public int SimilaridadeLocalLodiging(String casoProblema, String casoBase){
        String sim = "yes";
        String no = "no";
        String desc = "Desconhecido";
        int auxBase = 0, auxProb = 0,aux; 
        int valorDamaged = 567;
        if(casoBase.compareTo(no)==0) auxBase=1;
        else if(casoBase.compareToIgnoreCase(sim)==0) auxBase=0;
        else if(casoProblema.compareToIgnoreCase(no)==0) auxProb =1;
        else if(casoProblema.compareToIgnoreCase(sim)==0) auxProb =0;
        aux = auxProb-auxBase;
        valorDamaged = 1-(Math.abs(aux));              
        return valorDamaged;
    }
    
    public int SimilaridadeLocalStemCanker(String casoProblema, String casoBase){
        String abs = "Absent";
        String below = "below-soil";
        String soil = "Above-soil";
        String sec = "Above-sec-nde";
        String desc = "Desconhecido";
        int auxBase = 0, auxProb = 0,aux; 
        int valorDamaged = 567;
        if(casoBase.compareToIgnoreCase(soil)==0) auxBase= 2;
        else if(casoBase.compareToIgnoreCase(below)==0) auxBase=1;
        else if(casoBase.compareToIgnoreCase(sec)==0) auxBase=3;
        else if(casoBase.compareToIgnoreCase(abs)==0) auxBase=0;
        if(casoProblema.compareToIgnoreCase(soil)==0) auxProb = 2;
        else if(casoProblema.compareToIgnoreCase(below)==0) auxProb =1;
        else if(casoProblema.compareToIgnoreCase(sec)==0) auxProb =3;
        else if(casoProblema.compareToIgnoreCase(abs)==0) auxProb =0;
        aux = auxProb-auxBase;
        valorDamaged = 1-(Math.abs(aux)/2);              
        return valorDamaged;
    }
    
    public int SimilaridadeLocalRoots(String casoProblema, String casoBase){
        String norm = "Norm";
        String rot = "Rotted";
        String gals = "galls-cysts";
        String desc = "Desconhecido";
        int auxBase = 0, auxProb = 0,aux; 
        int valorDamaged = 567;
        if(casoBase.compareToIgnoreCase(gals)==0) auxBase= 2;
        else if(casoBase.compareToIgnoreCase(rot)==0) auxBase=1;
        else if(casoBase.compareToIgnoreCase(norm)==0) auxBase=0;
        if(casoProblema.compareToIgnoreCase(gals)==0) auxProb = 2;
        else if(casoProblema.compareToIgnoreCase(rot)==0) auxProb =1;
        else if(casoProblema.compareToIgnoreCase(norm)==0) auxProb =0;
        aux = auxProb-auxBase;
        valorDamaged = 1-(Math.abs(aux)/2);              
        return valorDamaged;
    }
    
    //não calcula similariedade

    public int SimilaridadeLocalCankerLesion(String casoProblema) {
        String brown = "Brown";
        String tan = "Tan";
        String dna = "DNA";
        String blk = "Dk-brown-blk";
        String desc = "Unknown";
        if (brown.compareToIgnoreCase(casoProblema) == 0) {
            return 1;
        } else if (tan.compareToIgnoreCase(casoProblema) == 0) {
            return 3;
        } else if (dna.compareToIgnoreCase(casoProblema) == 0) {
            return 0;
        } else if (blk.compareToIgnoreCase(casoProblema) == 0) {
            return 2;
        } else {
            System.out.println("Erro");
           return -1;
        }

    }

    public int SimilaridadeLocalExternalDecay(String casoProblema) {
        String firm="firm-and-dry";
        String abs= "absent";
        String wat="watery";
        String desc = "Desconhecido";
        if(casoProblema.compareToIgnoreCase(firm)==0) return 1;
        else if(casoProblema.compareToIgnoreCase(abs)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(wat)==0) return 2;
        else {System.out.println("Erro"); return -1;}
    }

    public int SimilaridadeLocalPlantStand(String casoProblema) {
        String des ="Desconhecido";
        String nor="Normal";
        String it="lt-normal";
        if(casoProblema.compareToIgnoreCase(nor)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(it)==0) return 1;
        else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalPrecip(String casoProblema) {
       String des="Desconhecido";
       String it="lt-normal";
       String norm="Normal";
       String gt ="gt-normal";
       if(casoProblema.compareToIgnoreCase(it)==0) return 0;
       else if (casoProblema.compareToIgnoreCase(norm)==0) return 1;
       else if(casoProblema.compareToIgnoreCase(gt)==0) return 2;
       else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalTemp(String casoProblema) {
        String des="Desconhecido";
        String it="lt-norm";
        String norm= "norm";
        String gt="gt-norm";
        if(casoProblema.compareToIgnoreCase(it)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(norm)==0) return 1;
        else if(casoProblema.compareToIgnoreCase(gt)==0) return 2;
        else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalHail(String casoProblema) {
        String si ="yes";
        String no="no";
        String des="Desconhecido";
        if(casoProblema.compareToIgnoreCase(si)==0) return 0;
        else if (casoProblema.compareToIgnoreCase(no)==0)return 1;
        else System.out.println("Erro"); return -1;        
    }

    public int SimilaridadeLocalSeedTmt(String casoProblema) {
        String des="Desconhecido";
        String non="none";
        String fun="fungicida";
        String ou ="Outros";
        if(casoProblema.compareToIgnoreCase(non)==0)return 0;
        else if(casoProblema.compareToIgnoreCase(fun)==0) return 1;
        else if(casoProblema.compareToIgnoreCase(ou)==0) return 2;
        else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalPlantGrowth(String casoProblema) {
       String des="Desconhecido";
       String nor="Norm";
       String ab="Abnorm";
       if(casoProblema.compareToIgnoreCase(nor)==0) return 0;
       else if (casoProblema.compareToIgnoreCase(ab)==0) return 1;
       else System.out.println("Erro"); return -1;

    }

    public int SimilaridadeLocalLeafSpotHalo(String casoProblema) {
       String abs="absent";
       String yel ="yellow-halos";
       String no="no-yellow-halos";
       String des="Desconhecido";
       if(casoProblema.compareToIgnoreCase(abs)==0) return 0;
       else if(casoProblema.compareToIgnoreCase(yel)==0) return 1;
       else if(casoProblema.compareToIgnoreCase(no)==0) return 2;
       else System.out.println("Erro"); return -1;

    }

    public int SimilaridadeLocalLeafSpotMargin(String casoProblema) {
       String des = "Desconhecido";
       String ws="w-s-marg";
       String no="no-w-s-marg";
       String dna ="dna";
       if(casoProblema.compareToIgnoreCase(ws)==0) return 0;
       else if(casoProblema.compareToIgnoreCase(no)==0) return 1;
       else if(casoProblema.compareToIgnoreCase(dna)==0) return 2;
       else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalLeaves(String casoProblema) {
       String no="Norm";
       String ab="Abnorm";
       if(casoProblema.compareToIgnoreCase(no)==0) return 0;
       else System.out.println("Erro"); return 1;
    }

    public int SimilaridadeLocalLeafSpotSize(String casoProblema) {
       String des="Desconhecido";
       String it="lt-1/8";
       String gt="gt-1/8";
       String dna="dna";
       if(casoProblema.compareToIgnoreCase(it)==0) return 0;
       else if(casoProblema.compareToIgnoreCase(gt)==0)return 1;
       else if(casoProblema.compareToIgnoreCase(dna)==0) return 2;
       else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalLeafShred(String casoProblema) { //olhar melhor
        String des="Desconhecido";
       String nor="Norm";
       String ab="Abnorm";
       if(casoProblema.compareToIgnoreCase(nor)==0) return 0;
       else if (casoProblema.compareToIgnoreCase(ab)==0) return 1;
       else System.out.println("Erro"); return -1;

    }

    public int SimilaridadeLocalLeafMild(String casoProblema) {
         String des="Desconhecido";
         String au="ausente";
         String up="Upper-surf";
         String lo="Lower-surf";
        if(casoProblema.compareToIgnoreCase(au)==0) return 0;
       else if (casoProblema.compareToIgnoreCase(up)==0) return 1;
        else if (casoProblema.compareToIgnoreCase(lo)==0) return 2;
        else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalStem(String casoProblema) {
       String des="Desconhecido";
       String nor="Norm";
       String ab="Abnorm";
       if(casoProblema.compareToIgnoreCase(nor)==0) return 0;
       else if (casoProblema.compareToIgnoreCase(ab)==0) return 1;
       else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalFruitingBodies(String casoProblema) {
        String aus="absent";
        String pres = "present";
        String desc="desconhecido";
        if(casoProblema.compareToIgnoreCase(aus)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(pres)==0) return 1;
        else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalIntDiscolor(String casoProblema) {
        String des ="Desconhecido";
        String non="None";
        String br="Brown";
        String bl="Black";

       if(casoProblema.compareToIgnoreCase(non)==0) return 0;
       else if (casoProblema.compareToIgnoreCase(br)==0) return 1;
       else if (casoProblema.compareToIgnoreCase(bl)==0) return 2;
       else System.out.println("Erro int"); return -1;
    }

    public int SimilaridadeLocalSclerotia(String casoProblema) {
        String aus="absent";
        String pres = "present";
        String desc="desconhecido";
        if(casoProblema.compareToIgnoreCase(aus)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(pres)==0) return 1;
        else System.out.println("Erro scle"); return -1;
    }

    public int SimilaridadeLocalFruitPods(String casoProblema) {//olhar melhor
       String des= "Desconhecido";
       String norm="Norm";
       String dis="Diseased";
       String pres="few-present";
       String dna="dna";
       if(casoProblema.compareToIgnoreCase(norm)==0) return 0;
       else if(casoProblema.compareToIgnoreCase(dis)==0) return 1;
       else if(casoProblema.compareToIgnoreCase(pres)==0) return 2;
       else if(casoProblema.compareToIgnoreCase(dna)==0) return 3;
       else System.out.println("Erro fruitpos"); return -1;
       

    }

    public int SimilaridadeLocalFruitSpots(String casoProblema) {//olhar melhor
       String un="unknown";
       String abs ="absent";
       String colo ="Colored";
       String bk = "Brown-w/blk-specks";
       String dna="dna";
       String dis ="distort";
       if(casoProblema.compareToIgnoreCase(abs)==0) return 0;
       else if(casoProblema.compareToIgnoreCase(colo)==0) return 1;
       else if(casoProblema.compareToIgnoreCase(bk)==0) return 2;
       else if(casoProblema.compareToIgnoreCase(dis)==0) return 3;
       else if(casoProblema.compareToIgnoreCase(dna)==0) return 4;
       else System.out.println("Erro fruitspo"); return -1;
          
    }

    public int SimilaridadeLocalSeed(String casoProblema) {
       String des="Desconhecido";
       String nor="Norm";
       String ab="Abnorm";
       if(casoProblema.compareToIgnoreCase(nor)==0) return 0;
       else if (casoProblema.compareToIgnoreCase(ab)==0) return 1;
       else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalMoldGrowth(String casoProblema) {
        String aus="absent";
        String pres = "present";
        String desc="desconhecido";
        if(casoProblema.compareToIgnoreCase(aus)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(pres)==0) return 1;
        else System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalSeedDis(String casoProblema) {
        String aus="absent";
        String pres = "present";
        String desc="desconhecido";
        if(casoProblema.compareToIgnoreCase(aus)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(pres)==0) return 0;
        else  System.out.println("Erro"); return -1;
    }

    public int SimilaridadeLocalSeedSize(String casoProblema) {
      String des="Desconhecido";
       String it="lt-normal";
       String norm="Normal";
       if(casoProblema.compareToIgnoreCase(it)==0) return 1;
       else if (casoProblema.compareToIgnoreCase(norm)==0) return 0;
       else System.out.println("Erro"); return -1;  
    }

    public int SimilaridadeLocalShriveling(String casoProblema) {
        String aus="absent";
        String pres = "present";
        String desc="desconhecido";
        if(casoProblema.compareToIgnoreCase(aus)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(pres)==0) return 1;
        else System.out.println("Erro"); return -1;
    }
    
    public int SimilaridadeLocalMycelium(String casoProblema){
        String aus="absent";
        String pres = "present";
        String desc="desconhecido";
        if(casoProblema.compareToIgnoreCase(aus)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(pres)==0) return 1;
        else System.out.println("Erro"); return -1;
    }
    
    public int SimilaridadeLocalLeafMalf(String casoProblema){
        String aus="absent";
        String pres = "present";
        String desc="desconhecido";
        if(casoProblema.compareToIgnoreCase(aus)==0) return 0;
        else if(casoProblema.compareToIgnoreCase(pres)==0) return 1;
        else System.out.println("Erro"); return -1;
    }
}
