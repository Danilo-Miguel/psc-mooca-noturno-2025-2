public class PessoaFisica {

    public void criarPessoa(){
         boolean nasceu =  true;

        if(nasceu){
        Pessoa pessoa = new Pessoa();
        pessoa.chorar();
        pessoa.setNome("Danilo");
        pessoa.setCpf("00100100122");
        }else{
            System.out.println("não nasceu");

        }

    }

    public void exibirPessoa(){
                Pessoa pessoa = new Pessoa();

        System.out.println("Bem vindo ao mundo" + pessoa.getNome() + "seu cpf é " + pessoa.getCpf());
    }
    
}
