package usuario;

public class Usuario {
    private String nome;
    private String senha;
    
    public Usuario(String n, String s){
        nome = n;
        senha = s;
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean validaSenha(){
        String nomeBD = "pedro";
        String senhaBD = "123";
        
        if(nome.equalsIgnoreCase(nomeBD) && senha.equalsIgnoreCase(senhaBD)){
            return true;
        }else{
            return false;
        }
    
    }
            
   
}
