package lab8;

public class dna {
    public static void main(String[] args) {
        System.out.println(dnaComp("GATTCGATC")); 

    }
    public static String dnaComp(String dna){
        StringBuilder b=new StringBuilder();
        for(int i=0;i<dna.length();i++){
            char a=dna.charAt(i);
            if (dna.charAt(i)=='T'){
                b.append('A');
            }if(dna.charAt(i)=='A'){
                b.append('T');
            }if(dna.charAt(i)=='C'){
                b.append('G');
            }if(dna.charAt(i)=='G'){
                b.append('C');
            }
        }
    return b.toString();
}
}
