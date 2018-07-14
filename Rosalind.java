/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosalind;

/**
 *
 * @author vshah
 */
public class Rosalind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        countingDNANucleotides count = new countingDNANucleotides();
        int[] result = count.countDNA("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC");
        
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    
}
