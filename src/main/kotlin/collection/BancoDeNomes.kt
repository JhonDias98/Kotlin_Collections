package collection

class BancoDeNomes {
    //Restrigindo apenas para leitura
    val nomes: Collection<String> get() = dados.toList()

    //método para que possa salvar os dados
    fun salva(nome: String){
        dados.add(nome)
    }

    /*
    Foi preciso criar um companio object porque sempre que fosse instanciar a classe, seus dados eram resetados.
    Usando companio object seus dados são compartilhados
     */
    companion object {
        private val dados = mutableListOf<String>()
    }
}