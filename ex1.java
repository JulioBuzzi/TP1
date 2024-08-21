public class ex1 {

    public static boolean isPalindromo(String palavra) {
    String palavraReversa = new StringBuilder(palavra).reverse().toString();

    return palavra.equals(palavraReversa);

}


    public static void main(String[] arqs) {

        String palavra = MyIO.readString();
            
        while(!palavra.equalsIgnoreCase("FIM")) {
            if(isPalindromo(palavra)) {
            MyIO.println("SIM\n");
            }
            else MyIO.println("NAO\n");

            palavra = MyIO.readString();
        }

 }
}