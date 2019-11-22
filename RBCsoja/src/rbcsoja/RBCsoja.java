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
    int simlemil, simstem, simint,simesc,simse,simlomold,simseedsize,simseedis,simmy,simleafmalf,simsh,similaridadeglobalparcial = 0;
    int pesodiv = 0;
    int peso[] = new int[27];
    double damagedArea[] = new double[309];
    double cropHist[] = new double[309];
    double severity[] = new double[309];
    double germination[] = new double[309];
    double lodging[] = new double[309];
    double stemcanker[] = new double[309];
    double root[] = new double[309];
    int simparc[] = new int[27]; 
    
    int i = 0;
            
    SimilaridadeLocal local= new SimilaridadeLocal();
    SimilaridadeGlobal global = new SimilaridadeGlobal();
        
        //Atrib que nao precisam ser calc similaridades
        peso[0] = 7;
        simparc[0]=local.SimilaridadeLocalCankerLesion(DadosCasoProblema.canckerlesion);//simcan
        peso[1] = 7;
        simparc[1]=local.SimilaridadeLocalExternalDecay(DadosCasoProblema.externaldecay);//simext
        peso[2] = 7;
        simparc[2]=local.SimilaridadeLocalFruitingBodies(DadosCasoProblema.fruitingbodies);//simfrub
        peso[3] = 8;
        simparc[3]=local.SimilaridadeLocalFruitSpots(DadosCasoProblema.fruitspots);//simfrus
        peso[4] = 8;
        simparc[4]=local.SimilaridadeLocalFruitPods(DadosCasoProblema.fruitpods);
        peso[5] = 3;
        simparc[5]=local.SimilaridadeLocalHail(DadosCasoProblema.hail);
        peso[6] = 5;
        simparc[6]=local.SimilaridadeLocalPlantStand(DadosCasoProblema.plantstand);
        peso[7] = 6;
        simparc[7]=local.SimilaridadeLocalPrecip(DadosCasoProblema.precip);
        peso[8] = 4;
        simparc[8]=local.SimilaridadeLocalTemp(DadosCasoProblema.temp);
        peso[9] = 1;
        simparc[9]=local.SimilaridadeLocalSeedTmt(DadosCasoProblema.seedtmt);
        peso[10] = 8;
        simparc[10]=local.SimilaridadeLocalPlantGrowth(DadosCasoProblema.plantgrowth);
        peso[11] = 6;
        simparc[11]=local.SimilaridadeLocalLeafSpotHalo(DadosCasoProblema.leafspothalo);
        peso[12] = 7;
        simparc[12]=local.SimilaridadeLocalLeafSpotMargin(DadosCasoProblema.leafsspotmarg);
        peso[13] = 8;
        simparc[13]=local.SimilaridadeLocalLeaves(DadosCasoProblema.leaves);
        peso[14] = 7;
        simparc[14]=local.SimilaridadeLocalLeafSpotSize(DadosCasoProblema.leafspotsize);
        peso[15] = 7;
        simparc[15]=local.SimilaridadeLocalLeafShred(DadosCasoProblema.leafshred);
        peso[16] = 8;
        simparc[16]=local.SimilaridadeLocalLeafMild(DadosCasoProblema.leafmild);
        peso[17] = 8;
        simparc[17]=local.SimilaridadeLocalStem(DadosCasoProblema.stem);
        peso[18] = 8;
        simparc[18]=local.SimilaridadeLocalIntDiscolor(DadosCasoProblema.intdiscolor);
        peso[19] = 8;
        simparc[19]=local.SimilaridadeLocalSclerotia(DadosCasoProblema.sclerotia);
        peso[20] = 7;
        simparc[20]=local.SimilaridadeLocalSeed(DadosCasoProblema.seed);
        peso[21] = 8;
        simparc[21]=local.SimilaridadeLocalMoldGrowth(DadosCasoProblema.moldgrowth);
        peso[22] = 7;
        simparc[22]=local.SimilaridadeLocalSeedDis(DadosCasoProblema.seeddis);
        peso[23] = 8;
        simparc[23]= local.SimilaridadeLocalShriveling(DadosCasoProblema.shriveling);
        peso[24] = 8;
        simparc[24]=local.SimilaridadeLocalSeedSize(DadosCasoProblema.seedsize);
        peso[25] = 8;
        simparc[25]=local.SimilaridadeLocalMycelium(DadosCasoProblema.mycelium);
        peso[26] = 7;
        simparc[26]=local.SimilaridadeLocalLeafMalf(DadosCasoProblema.leafmalf);
        
        for(int j =0;j<27;j++){
            if(simparc[j] >= 0) similaridadeglobalparcial += simparc[j] * peso[j] ;
            pesodiv += peso[j]; 
            
        }
        /*System.out.println("parc"+similaridadeglobalparcial);
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
        System.out.println("simleafmalf =" + simleafmalf);*/
       
        
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
                DadosCasoProblema.global[i]=global.SimilaridadeGlobal(similaridadeglobalparcial, damagedArea[i], cropHist[i], severity[i], germination[i], lodging[i], stemcanker[i],root[i],pesodiv);
                System.out.println("similaridadeGlobal "+ i + "= "+ DadosCasoProblema.global[i] +"  Doença = "+valoresEntreVirgulas[36]);
                i++;
            }
        
        }catch(FileNotFoundException e){
            
        }
        
    }
    
    
}
