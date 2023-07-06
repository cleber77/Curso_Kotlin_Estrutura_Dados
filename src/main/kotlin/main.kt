fun main ( args: Array<String>){

      // Usa somente chama a açõa da class
      val moto = Moto("Moto","preto",1.20,1.89)
      moto.primeiraMarcha()
      moto.segunadaMarcha()
      moto.detalhesDoveiculos()

      println("Qual e tipo do seu veiculo")


      val  carro = Carro("carro","blue",3.55,6.00)
      carro.primeiraMarcha()
      carro.segunadaMarcha()
      println("Este e meu veiculo qual e o seu?")

}