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
    public void calcSimiMain() {
    File arquivoCSV = new File("/home/mayla/NetBeansProjects/RBCsoja/src/rbcsoja/casoBase");
    int simcan,simext,simfrub,simfrus,simfrup,simhail,simplasta,simpre,simtem,simsetmt,simplagro,simhalo,simmarg,simlea,simleasize,simlesh;
    int simlemil, simstem, simint,simesc,simse,simlomold,simseedsize,simseedis,simmy,simleafmalf,simsh;
    int similaridadeglobalparcial;
    double damagedArea[] = new double[309];
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
        simcan=local.SimilaridadeLocalCankerLesion(DadosCasoProblema.canckerlesion)*7;
        simext=local.SimilaridadeLocalExternalDecay(DadosCasoProblema.externaldecay)*7;
        simfrub=local.SimilaridadeLocalFruitingBodies(DadosCasoProblema.fruitingbodies)*7;
        simfrus=local.SimilaridadeLocalFruitSpots(DadosCasoProblema.fruitspots)*8;
        simfrup=local.SimilaridadeLocalFruitPods(DadosCasoProblema.fruitpods)*8;
        simhail=local.SimilaridadeLocalHail(DadosCasoProblema.hail)*3;
        simplasta=local.SimilaridadeLocalPlantStand(DadosCasoProblema.plantstand)*5;
        simpre=local.SimilaridadeLocalPrecip(DadosCasoProblema.precip)*6;
        simtem=local.SimilaridadeLocalTemp(DadosCasoProblema.temp)*4;
        simsetmt=local.SimilaridadeLocalSeedTmt(DadosCasoProblema.seedtmt)*1;
        simplagro=local.SimilaridadeLocalPlantGrowth(DadosCasoProblema.plantgrowth)*8;
        simhalo=local.SimilaridadeLocalLeafSpotHalo(DadosCasoProblema.leafspothalo)*6;
        simmarg=local.SimilaridadeLocalLeafSpotMargin(DadosCasoProblema.leafsspotmarg)*7;
        simlea=local.SimilaridadeLocalLeaves(DadosCasoProblema.leaves)*8;
        simleasize=local.SimilaridadeLocalLeafSpotSize(DadosCasoProblema.leafspotsize)*7;
        simlesh=local.SimilaridadeLocalLeafShred(DadosCasoProblema.leafshred)*7;
        simlemil=local.SimilaridadeLocalLeafMild(DadosCasoProblema.leafmild)*8;
        simstem=local.SimilaridadeLocalStem(DadosCasoProblema.stem)*8;
        simint=local.SimilaridadeLocalIntDiscolor(DadosCasoProblema.intdiscolor)*8;
        simesc=local.SimilaridadeLocalSclerotia(DadosCasoProblema.sclerotia)*8;
        simse=local.SimilaridadeLocalSeed(DadosCasoProblema.seed)*7;
        simlomold=local.SimilaridadeLocalMoldGrowth(DadosCasoProblema.moldgrowth)*8;
        simseedis=local.SimilaridadeLocalSeedDis(DadosCasoProblema.seeddis)*7;
        simsh= local.SimilaridadeLocalShriveling(DadosCasoProblema.shriveling)*8;
        simseedsize=local.SimilaridadeLocalSeedSize(DadosCasoProblema.seedsize)*8;
        simmy=local.SimilaridadeLocalMycelium(DadosCasoProblema.mycelium)*8;
        simleafmalf=local.SimilaridadeLocalLeafMalf(DadosCasoProblema.leafmalf)*7;
        
        similaridadeglobalparcial=simleafmalf+simmy+simseedsize+simsh+simseedis+simlomold+simse+simesc+simint+simstem+simlemil+simlesh+simleasize+simlea+simmarg+simhalo+simplagro+simsetmt+simtem+simpre+simplasta+simhail+simfrub+simfrup+simfrus+simcan+simext;
        System.out.println("simcan =" + simcan);
        System.out.println("simext =" + simext);
        System.out.println("simfrub =" + simfrub);
        System.out.println("simfrus =" + simfrus);
        System.out.println("simfrup =" + simfrus);
        System.out.println("simhail =" + simhail);
        System.out.println("simplasta =" + simplasta);
        System.out.println("simpre =" + simpre);
        System.out.println("simtem =" + simtem);
        System.out.println("simsetmt =" + simsetmt);
        System.out.println("simplagro =" + simplagro);
        System.out.println("simhalo =" + simhalo);
        System.out.println("simmarg =" + simmarg);
        System.out.println("simlea =" + simlea);
        System.out.println("simleasize =" + simleasize);
        System.out.println("simlesh =" + simlesh);
        System.out.println("simlemil =" + simlemil);
        System.out.println("simstem =" + simstem);
        System.out.println("simint =" + simint);
        System.out.println("simesc =" + simesc);
        System.out.println("simse =" + simse);
        System.out.println("simlomold =" + simlomold);
        System.out.println("simseedis =" + simseedis);
        System.out.println("simsh =" + simsh);
        System.out.println("simmy =" + simmy);
        System.out.println("simleafmalf =" + simleafmalf);
       
        
        try{
            Scanner leitor = new Scanner(arquivoCSV);
            String linhasDoArquivo = new String();
            
            while(leitor.hasNext()){
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                //System.out.println(valoresEntreVirgulas[31]);
                damagedArea[i]=local.SimilariedadeLocalDamagedArea(DadosCasoProblema.areadamaged,valoresEntreVirgulas[1]);
                cropHist[i]=local.SimilaridadeLocalCropHist(DadosCasoProblema.croohist, valoresEntreVirgulas[3]);
                severity[i]=local.SimilaridadeLocalSeverity(DadosCasoProblema.severity, valoresEntreVirgulas[31]);
                germination[i]=local.SimilaridadeLocalGermination(DadosCasoProblema.germination, valoresEntreVirgulas[9]);
                lodging[i]=local.SimilaridadeLocalLodiging(DadosCasoProblema.lodgi, valoresEntreVirgulas[19]);
                stemcanker[i]=local.SimilaridadeLocalStemCanker(DadosCasoProblema.stemcancker, valoresEntreVirgulas[34]);
                root[i]=local.SimilaridadeLocalRoots(DadosCasoProblema.roots, valoresEntreVirgulas[25]);
                similaridadeGlobal[i]=global.SimilaridadeGlobal(similaridadeglobalparcial, damagedArea[i], cropHist[i], severity[i], germination[i], lodging[i], stemcanker[i],root[i]);
                //System.out.println("similaridadeGlobal = "+ similaridadeGlobal[i]);
                i++;
            }
        
        }catch(FileNotFoundException e){
            
        }
        
    }
    
    
}
