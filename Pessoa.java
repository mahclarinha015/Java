public class Pessoa {
    private String nome;
    private int idade;

//Construtor padrão é criado mesmo que não explicitado
    public Pessoa(){
    }
       //método construtor com argumento 
       public Pessoa(String nome){
        this.nome = nome;
       }

       public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
       }

       public String getNome(){
        return nome;
       }

       public void setNome(String nome){
        this.nome = nome;
       }

       public int getIdade(){
        return idade;
       }

       public void setIdade(int idade){
        this.idade = idade;
       }
    }