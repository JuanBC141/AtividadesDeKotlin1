fun main() {
//triangulo()
   postoDeCombustivel()

}

//Triângulo
fun triangulo(): Unit{
    println("Qual o tamanho do lado 1: ")
    val lado1 = readLine()!!.toFloat()
    println("Qual o tamanho do lado 2: ")
    val lado2 = readLine()!!.toFloat()
    println("Qual o tamanho do lado 3: ")
    val lado3 = readLine()!!.toFloat()

    if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
        println("Você tem um triângulo equilátero")
    }else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
        println("Você tem um triângulo escaleno")
    }else {
        println("Você tem um triângulo isósceles")
    }
}

//Ano Bissexto
fun anoBissexto(): Unit{
    println("Digite o ano: ")
    val ano = readLine()!!.toInt()

    if (ano % 4 == 0){
        println("O ano $ano é bissexto")
    }else if(ano % 100 == 0){
        println("O ano $ano é bissexto")
    }else if (ano % 400 == 0){
        println("O ano $ano é bissexto")
    }else{
        println("O ano $ano não é bissexto")
    }
}

//Detetive
fun detetive(): Unit{
    var pontos = 0

    println("Telefonou para a vítima?")
    println("1- Sim\n2- Não")
    val pergunta1 = readLine()!!.toInt()
    if (pergunta1 == 1) pontos = pontos + 1

    println("Esteve no local do crime?")
    println("1- Sim\n2- Não")
    val pergunta2 = readLine()!!.toInt()
    if (pergunta2 == 1) pontos = pontos + 1

    println("Mora perto da vítima?")
    println("1- Sim\n2- Não")
    val pergunta3 = readLine()!!.toInt()
    if (pergunta3 == 1) pontos = pontos + 1

    println("Devia para a vítima?")
    println("1- Sim\n2- Não")
    val pergunta4 = readLine()!!.toInt()
    if (pergunta4 == 1) pontos = pontos + 1

    println("Já trabalhou com a vítima?")
    println("1- Sim\n2- Não")
    val pergunta5 = readLine()!!.toInt()
    if (pergunta5 == 1) pontos = pontos + 1

    println()
    if (pontos == 2){
        println("Você é Suspeito!")
    }else if(pontos == 3){
        println("Você é Cúmplice!")
    }else if(pontos == 4){
        println("Você é Cúmplice!")
    }else if(pontos == 5){
        println("Você é o Assassino!")
    }else{
        println("Você é Inocente!")
    }
}

//Posto de Combustivel
fun postoDeCombustivel(): Unit{
    println("Qual o tipo de combustivel:")
    println("A- Álcool\nG- Gasolina")
    var letras = readLine()

    //Álcool
    if (letras.equals("a",true)){
        val precoA = 5
        val descontoA1 = precoA - (precoA * 0.03)
        val descontoA2 = precoA - (precoA * 0.05)

        println("Litros de Alcool: ")
        var litrosA = readLine()!!.toInt()
        if (litrosA <= 20){
            var totalA1 = descontoA1 * litrosA
            println("Total a pagar é de R$$totalA1")
        }else if(litrosA > 20){
            var totalA2 = descontoA2 * litrosA
            println("Total a pagar é de R$$totalA2")
        }

        //Gasolina
    }else if(letras.equals("g",true)){
        val precoG = 7
        val descontoG1 = precoG - (precoG * 0.04)
        val descontoG2 = precoG - (precoG * 0.06)

        println("Litros de Gasolina: ")
        var litrosG = readLine()!!.toInt()

        if (litrosG <= 20){
            var totalG1 = descontoG1 * litrosG
            println("Total a pagar é de R$$totalG1")
        }else if(litrosG > 20){
            var totalG2 = descontoG2 * litrosG
            println("Total a pagar é de R$$totalG2")
        }
    }else{
        println("Opção invalida!")
    }
}