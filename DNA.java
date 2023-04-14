public class DNA {
    public static void main(String[] args){

        //define 3 dna qualquer, verdadeiro ou falso
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        //Armazena os dna em um array
        String dnas[] = {dna1, dna2, dna3};

        
        //varre o array e verifica se contém Proteína
       for(String dna : dnas ){
         //Armazena o indíce de ATG e TGA
         int indexATG = dna.indexOf("ATG");
         int indexTGA = dna.indexOf("TGA");
 
 
         //Verifica se o DNA é uma proteína ou não
         if(indexATG >= 0 && indexTGA >= 0 && (indexATG - indexTGA) % 3 == 0 ){
             //Armazena o DNA a uma String chamada Proteina
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
