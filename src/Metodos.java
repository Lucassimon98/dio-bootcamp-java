public class Metodos {
    
    public static void main (String [] args) {

        String primeiroNome = "Lucas";
        String segundoNome = "Simon";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        //return primeiroNome.concat(" ").concat(segundoNome);
        return "Meu nome completo é: " + primeiroNome + " " + segundoNome;
    }

}
