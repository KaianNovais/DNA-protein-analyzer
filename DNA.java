public class DNA {
    public static void main(String[] args){

        //define 3 dna's quaisquer
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        //Armazena os dna em um array
        String dnas[] = {dna1, dna2, dna3};

        
        //Varre o array e verifica se contém Proteína em cada DNA
       for(String dna : dnas ){
           
         //Armazena o indíce de ATG e TGA
         int indexATG = dna.indexOf("ATG");
         int indexTGA = dna.indexOf("TGA");
 
 
         //Verifica se o DNA contém uma proteína ou não baseado na validação se existe ATG e TGA 
         //e se a quantidade de caracteres entres eles 
         //é divisível por 3
         if(indexATG >= 0 && indexTGA >= 0 && (indexATG - indexTGA) % 3 == 0 ){
           
           String protein = dna.substring(indexATG, indexTGA + 3);
           System.out.println("DNA: " + dna);
           System.out.println("Proteína: " + protein);
             
         } else {
             
            System.out.println("DNA: " + dna);
            System.out.println("Não tem proteína");
             
         }
       }
    }
}
