open class Veiculo ( tipo : String,cor: String,altura:Double,largura:Double) {

    // caracteristaca do veiculo
    var tipo :String =  ""
    var  cor :String  = ""
    var altura : Double? = null
    var largura: Double? = null

     // caracteristaca do veiculo
    init {
        this.tipo = tipo
        this.cor = cor
        this.altura = altura
        this.largura = largura
    }

    //Ação do veiculo seria o metodor

    fun detalhesDoveiculos(){
        println("$tipo tem a cor  $cor e tem alura de  $altura e largura $largura")
    }

    fun primeiraMarcha(){
        println("Passando a primeira Marcha ")
    }

    fun segunadaMarcha(){
        println("Passsando a segunda Marcha ")
    }

}