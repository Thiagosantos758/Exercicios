/*
 * Descrição: Crie uma casa que tenha 10 atributos e 6 métodos
 * Autor: Thiago Lima dos Santos
 * Data: 07/06/2023
*/
public class ThiagoSantos_Exercicio03{
    public static void main(String [] args){

    }
}
 class casa{
    /*Criando os 10 atributos */
    boolean garagem, aguaEncanada;
    String corDasParedes, marcaCaixaDagua, endereco, tipoDeTelhado;
    int quantidadeDeQuartos, quantidadeDeBanheiros;
    float despesasFixasPorMes;
    char complementoDoEndereco;
    /*Criando os 6 métodos */
    void protegerDoFrio(){
        System.out.println("Você está quentinho e protegido do frio!");
    }
    void fornecerConforto(){
        System.out.println("Você está descansando em um lugar confortável em sua casa!");
    }
    void quebrar(){
        System.out.println("Você provavelmente arranjou dor de cabeça...");
    }
    void fornecerAgua(){
        System.out.println("Você pode matar sua sede mais facilmente");
    }
    void fornecerComida(){
        System.out.println("Agora você pode comer e armazenar sua comida de maneira mais fácil!");
    }
    void facilitarNecessidadesBasicas(){
        System.out.println("Agora você pode fazer suas necessidades básicas mais tranquilamente!");
    }
}
