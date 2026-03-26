@file:JvmName("JDoodle")

// Lista mutável para armazenar o histórico de cálculos
val historico = mutableListOf<Pair<Double, String>>()

// Informações do aluno
val aluno = "Lucas da Silva Ramos"
val RA = "R6390E9"

fun main() {
    while(true) {
        // Exibe o menu principal
        println("Calculadora da Lei de Ohm")
        println("Escolha o que você quer calcular: ")
        println("1. Tensão (V)")
        println("2. Corrente (I)")
        println("3. Resistência (R)")
        println("4. Ver Histórico")
        println("5. Sair")
    
        // Lê a escolha do usuário
        val escolha = readLine()?.toIntOrNull()
        
        // Executa a ação baseada na escolha do usuário
        when(escolha) {
            1 -> calcV()
            2 -> calcI()
            3 -> calcR()
            4 -> verhistorico()
            5 -> break
            else -> println("Opção inválida! Tente Novamente.")
        }
    }
    // Exibe informações finais e encerra o programa
    println("Programa desenvolvido por $aluno, RA: $RA.")
    println("Encerrado.")
}

// Função para calcular a Tensão (V)
fun calcV() {
    println("Digite a corrente (I) em Amperes: ")
    val corrente = readLine()?.toDoubleOrNull()
    println("Digite a resistência (R) em Ohms: ")
    val resistencia = readLine()?.toDoubleOrNull()
    if (corrente != null && resistencia != null) {
        val resultado = corrente * resistencia
        // Exibe o cálculo e o resultado
        println("V = I * R")
        println("V = $corrente * $resistencia")
        println("A tensão (V) é: $resultado Volts")
        // Adiciona o resultado ao histórico
        historico.add(Pair(resultado, "V"))
    } else {
        println("Entrada inválida! Tente Novamente.")
    }
}

// Função para calcular a Corrente (I)
fun calcI() {
    println("Digite a tensão (V) em Volts: ")
    val tensao = readLine()?.toDoubleOrNull()
    println("Digite a resistência (R) em Ohms: ")
    val resistencia = readLine()?.toDoubleOrNull()
    if (tensao != null && resistencia != null) {
        val resultado = tensao / resistencia
        // Exibe o cálculo e o resultado
        println("I = V / R")
        println("I = $tensao / $resistencia")
        println("A corrente (I) é: $resultado Amperes")
        // Adiciona o resultado ao histórico
        historico.add(Pair(resultado, "I"))
    } else {
        println("Entrada inválida! Tente Novamente.")
    }
}

// Função para calcular a Resistência (R)
fun calcR() {
    println("Digite a tensão (V) em Volts: ")
    val tensao = readLine()?.toDoubleOrNull()
    println("Digite a corrente (I) em Amperes: ")
    val corrente = readLine()?.toDoubleOrNull()
    if (tensao != null && corrente != null) {
        val resultado = tensao / corrente
        // Exibe o cálculo e o resultado
        println("R = V / I")
        println("R = $tensao / $corrente")
        println("A resistência (R) é: $resultado Ohms")
        // Adiciona o resultado ao histórico
        historico.add(Pair(resultado, "R"))
    } else {
        println("Entrada inválida! Tente Novamente.")
    }
}

// Função para exibir o histórico de cálculos
fun verhistorico() {
    if (historico.isEmpty()) {
        println("Nenhum cálculo foi realizado ainda.")
    } else {
        println("=== Histórico de Cálculos ===")
        // Passa pelo histórico e exibe cada cálculo
        historico.forEach { (valor, tipo) -> 
            println("- $valor $tipo")
        }
    }
}
