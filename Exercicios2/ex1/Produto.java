
package br.edu.fatecfranca.ADS.ex1;

//variaveis
public class Produto {
    private int id;
    private String descricao;
    private int qtde;
    private float preco;
    
    
// metodo construtor sem parametro    
public Produto (){
    this.id = 0;
    this.descricao = "não definido";
    this.qtde= 0;
    this.preco = 0;
}    
    
// metodo construtor com parametro    

public Produto(int id, String descricao,int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
        this.setpreco(preco);                
}
        
// setters
public void setpreco(float preco){
    if (preco >= 0){
        this.preco = preco;
    }
    else {
        System.out.println("O valor não pode ser menor ou igual a zero");
    }
}

public void setqtde(int qtde){
    this.qtde = qtde;
}
    
public void setid(int id){
    this.id = id;    
}

public void setdescricao(String descricao){
    this.descricao = descricao;
}


// getters
public float getpreco(){
    return this.preco;
}

public int getqtde(){
    return this.qtde;
}

public int getid(){
    return this.id;
}

public String getdescricao(){
    return this.descricao;
}


//metodos
public void comprar(int x){
    this.qtde = this.qtde - x;
}

public void vender(int x){
     this.qtde = this.qtde + x;
}

public void subir(float x){
    this.preco = this.preco + x;
}

public void descer(float x){
this.setpreco(this.preco - x);  //testa o valor de parametro do get pra não deixar ficar menor que zero

    this.preco = this.preco - x;
}
    
    public String toString() {
    return "Produto " + this.id
            + "\n Descrição: " + this.descricao
            + "\n Quantidade: " + this.qtde
            + "\n Valor: " + this.preco;
}
}


