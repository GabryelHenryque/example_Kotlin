@file:JvmName("JDoodle")
fun main() { 

    do{
        //escolha de funções
        println("Qual atividade você quer?")
        print("atividade [0],[1],[2],[3],[4],[5],[6],[7],[8]: ")
    
        var escolha: Int = readLine()!!.toInt()
        println("")
        when(escolha)
        {
            0 -> regra3()
            1 -> atv1()
            2 -> atv2()
            3 -> atv3()
            4 -> atv4()
            5 -> atv5()
            6 -> atv6()
            7 -> atv7()
            8 -> atv8()
            else -> {println("não existe essa atividade")}
            
        }
        //repete o codigo
        println(" ")
        println("_________________________________________________")
        print("gostaria de ver outra atividade? [sim] ou [nao] : ")
        var sim : String = readLine()!!
        println(" ")
        
    }while(sim == "sim")
    println("end")
}

//atividade 0
fun regra3()
{
    //atividade atual
    println("atividade 0: regra de tres simples, diretamente proporcional; ")
    println(" ")
        
        
    //guardar valor
        //textos
    print("Digite o primeiro nome: ")
    val text1: String = readLine()!!
    print("Digite o segundo nome: ")
    val text2: String = readLine()!!
        //numeros
    print("Digite o primeiro numero de $text1: ")
    var valor1: Double = readLine()!!.toDouble()
    print("Digite o Segundo numero de $text1: ")
    var valor2: Double = readLine()!!.toDouble()

    print("Digite o primeiro numero de $text2: ")
    var valor3: Double = readLine()!!.toDouble()
    
    //calculo
    var calculo1 : Double = valor2 * valor3 
    var calculo2 : Double = valor1 * 1
    var resultado: Int = (calculo1 / calculo2).toInt()
    
    //resultado
    println(" ")
    println("o segundo valor de $text2 é: $resultado")
    
}

//atividade 1
fun atv1()
{
    //atividade atual
    println("Atividade 1: diz bem vindo a você; ")
    println("-->")
    
    //guardar valor 
    print("Digite o seu nome: ")
    var variavelGuardada: String = readLine()!!
    
    //resultado
    println(" ")    
    println("Seja Bem vindo(a)!! $variavelGuardada")
    
}

//atividade 2
fun atv2()
{
    //atividade atual
    println("Atividade 2: digo se é positivo(+), negativo(-) ou zero(0); ")
    println("-->")
    
    //guarda numeros
    print("Digite um numero: ")
    var num1: Int = readLine()!!.toInt()
    
    //verifica
    if(num1 <= -1)
    {
        println("$num1 é um numero Negativo")
    
    }else if (num1 > 0)
    {
        println("$num1 é um numero Positivo")
    }else{
    
        println("$num1 é um numero Zero")
    }
    
}

//atividade 3
fun atv3()
{
    //atividade atual
    println("atividade 3: conto seus numero em numeros pares; ")
    println("-->")
    
    print("ate qual numero você deseja que eu conte?  ")
    
    //guarda valor
    var numeroLa : Int = readLine()!!.toInt()
    
    //repete
    for(i in 0..numeroLa){
        
        if (i % 2 == 0)
        { print(" $i,") }
        
    }
    
}

//atividade 4
fun atv4() 
{
    //atividade atual
    println("Atividade 4: digo qual é o maior numero; ")
    println("-->")
    
    //guarda valor
    println("digite 5 valores (usando enter): ")
    
    print("v1: "); var v1 : Int = readLine()!!.toInt()
    print("v2: "); var v2 : Int = readLine()!!.toInt()
    print("v3: "); var v3 : Int = readLine()!!.toInt()
    print("v4: "); var v4 : Int = readLine()!!.toInt()
    print("v5: "); var v5 : Int = readLine()!!.toInt()
    
    //tabela
    var tabela = arrayOf(0,v1,v2,v3,v4,v5) //criando uma lista de numeros
    var comparador = tabela[0] //variavel que atribui o valor da lista com o valor 0
    
    //repete
    for(i in 0 until tabela.size) //for cria variavel local. expressao[ 0 "ate"(until) numero."tamanho"(size) ]
    { 
        //compara se o valor da tabela (numero) é maior que o comparador    
        if (tabela[i] > comparador) 
        {
            comparador = tabela[i] // atribui o novo valor à variável comparador
        }
    }
    
    //resultado
    println(" ")
    println("O maior numero é:  $comparador") //imprime o maior valor encontrado
    
}

//atividade 5
fun atv5()
{
    //atividade atual
    println("Atividade 5: Digo o tamanho do seu texto(em letras); ")
    println("-->")
    
    //guarda valor
    println("digite uma frase ou palavra: ")
    var frase: String = readLine()!!
    var atividade5 = atv5b(frase)
    
    //respostar
    println("A quantidade de letras são : $atividade5")
    
}
fun atv5b(texto: String):Int
{   
    return texto.length //transforma em numero
}

//atividade 6
class Pessoa( var Nomes  : String , var Idades : Int, var Endereco : String );
fun atv6()
{
    
    //atividade atual
    println("Atividade 6: guardo e valo seu nome|idade|endereço; ")
    println("-->")
    
    //guarda valor
    print("Digite seu nome: ")
    var nome: String = readLine()!!
    print("Digite seu idade: ")
    var idade: Int = readLine()!!.toInt()
    print("Digite seu Endereço: ")
    var endereco: String = readLine()!!
    
    //atrinui valor
    var valores = Pessoa(nome,idade,endereco)
    
    //respota
    println(" ")
    println("seu nome é: ${valores.Nomes}, sua idade é:${valores.Idades}, seu endereço é: ${valores.Endereco}")

}

//atividade 7
fun atv7()
{
    //atividade atual
    println("Atividade 7: falo a sua data de nascimento; ")
    println("-->")
    
    //guarda valor
    println("Digite o dia do seu nascimento?")
    var dia: Int = readLine()!!.toInt()
    println("Digite o mes do seu nascimento")
    var mes: Int = readLine()!!.toInt()
    println("Digite o ano do seu nascimento")
    var ano: Int = readLine()!!.toInt()
    
    //resposta
    println(" ")
    println("Sua data de nascimento é: $dia /$mes /$ano")
    
}

//atividade 8 
fun atv8()
{
    //atividade atual
    println("Atividade 8: digo se você passou ou foi reprovado; ")
    println("-->")
    
    //guarda valor
    println("qual foi sua nota? ( e eu direi se você passou ou não )")
    var nota : Double = readLine()!!.toDouble()
    
    //verifica resposta
    if (nota >= 6.0)
    {
        println("Com sua nota... ")
        println("você foi APROVADO!!")
    }else {println("Com sua nota... "); println("você foi REPROVADO!!")}
    
}



