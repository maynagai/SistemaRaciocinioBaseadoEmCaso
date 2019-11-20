/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcsoja;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mayla
 */
public class RBCsoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    File arquivoCSV = new File("/home/mayla/NetBeansProjects/RBCsoja/src/rbcsoja/casoBase");
    Tela tela = new Tela();
    int simcan,simext,simfrub,simfrus,simfrup,simhail,simplasta,simpre,simtem,simsetmt,simplagro,simhalo,simmarg,simlea,simleasize,simlesh;
    int simlemil, simstem, simint,simesc,simse,simlomold,simseedsize,simseedis,simmy,simleafmalf,simsh;
    int similaridadeglobalparcial;
    double externalDecay[] = new double[309];
    double cropHist[] = new double[309];
    double severity[] = new double[309];
    double germination[] = new double[309];
    double lodging[] = new double[309];
    double stemcanker[] = new double[309];
    double root[] = new double[309];
    double similaridadeGlobal[]=new double[309]; 
    
    int i = 0;
            
    SimilaridadeLocal local= new SimilaridadeLocal();
    SimilaridadeGlobal global = new SimilaridadeGlobal();
        
        //Atrib que nao precisam ser calc similaridades
        simcan=local.SimilaridadeLocalCankerLesion(tela.getCankerLesion())*7;
        simext=local.SimilaridadeLocalExternalDecay(tela.getExternalDecay())*7;
        simfrub=local.SimilaridadeLocalFruitingBodies(tela.getFruitingBodies())*7;
        simfrus=local.SimilaridadeLocalFruitSpots(tela.getFruitSpot())*8;
        simfrup=local.SimilaridadeLocalFruitPods(tela.getFruitingPods())*8;
        simhail=local.SimilaridadeLocalHail(tela.getHail())*3;
        simplasta=local.SimilaridadeLocalPlantStand(tela.getPlantStand())*5;
        simpre=local.SimilaridadeLocalPrecip(tela.getPrecip())*6;
        simtem=local.SimilaridadeLocalTemp(tela.getTemps())*4;
        simsetmt=local.SimilaridadeLocalSeedTmt(tela.getSeetTmt())*1;
        simplagro=local.SimilaridadeLocalPlantGrowth(tela.getPlantGrowth())*8;
        simhalo=local.SimilaridadeLocalLeafSpotHalo(tela.getLeafspotHalo())*6;
        simmarg=local.SimilaridadeLocalLeafSpotMargin(tela.getLeafspotMargin())*7;
        simlea=local.SimilaridadeLocalLeaves(tela.getLeaves())*8;
        simleasize=local.SimilaridadeLocalLeafSpotSize(tela.getLeafspotSize())*7;
        simlesh=local.SimilaridadeLocalLeafShred(tela.getLeafShread())*7;
        simlemil=local.SimilaridadeLocalLeafMild(tela.getLeafMild())*8;
        simstem=local.SimilaridadeLocalStem(tela.getStem())*8;
        simint=local.SimilaridadeLocalIntDiscolor(tela.getIntDiscolor())*8;
        simesc=local.SimilaridadeLocalSclerotia(tela.getSclerotia())*8;
        simse=local.SimilaridadeLocalSeed(tela.getSeeds())*7;
        simlomold=local.SimilaridadeLocalMoldGrowth(tela.getMoldGrowth())*8;
        simseedis=local.SimilaridadeLocalSeedDis(tela.getSeedDiscolor())*7;
        simsh= local.SimilaridadeLocalShriveling(tela.getShriveling())*8;
        simseedsize=local.SimilaridadeLocalSeedSize(tela.getSeedSize())*8;
        simmy=local.SimilaridadeLocalMycelium(tela.getMycellium())*8;
        simleafmalf=local.SimilaridadeLocalLeafMalf(tela.getLeafMalf())*7;
        
        similaridadeglobalparcial=simleafmalf+simmy+simseedsize+simsh+simseedis+simlomold+simse+simesc+simint+simstem+simlemil+simlesh+simleasize+simlea+simmarg+simhalo+simplagro+simsetmt+simtem+simpre+simplasta+simhail+simfrub+simfrup+simfrus+simcan+simext;
       
        try{
            Scanner leitor = new Scanner(arquivoCSV);
            String linhasDoArquivo = new String();
            
            while(leitor.hasNext()){
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                //System.out.println(valoresEntreVirgulas[31]);
                externalDecay[i]=local.SimilariedadeLocalDamagedArea(tela.getDamagedArea(),valoresEntreVirgulas[1]);
                cropHist[i]=local.SimilaridadeLocalCropHist(tela.getCropHist(), valoresEntreVirgulas[3]);
                severity[i]=local.SimilaridadeLocalSeverity(tela.getSeverity(), valoresEntreVirgulas[31]);
                germination[i]=local.SimilaridadeLocalGermination(tela.getGermination(), valoresEntreVirgulas[9]);
                lodging[i]=local.SimilaridadeLocalLodiging(tela.getLodging(), valoresEntreVirgulas[19]);
                stemcanker[i]=local.SimilaridadeLocalStemCanker(tela.getStemCanker(), valoresEntreVirgulas[34]);
                root[i]=local.SimilaridadeLocalRoots(tela.getRoot(), valoresEntreVirgulas[25]);
                similaridadeGlobal[i]=global.SimilaridadeGlobal(similaridadeglobalparcial, externalDecay[i], cropHist[i], severity[i], germination[i], lodging[i], stemcanker[i],root[i]);
                i++;
            }
        
        }catch(FileNotFoundException e){
            
        }
        
        
    }
    
    
}
