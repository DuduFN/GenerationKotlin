fun main() {
    val estoque = mutableListOf<String>()
    while (true) {
        println(
            "1 - Adicionar novos produtos \n2 - Remover produtos \n3 - Atualizar produtos \n4 - Mostrar produtos \n5 - Finalizar"
        )

        println("Digite o numero da operção desejada: ")
        val opr = readLine()!!.toInt()

        when (opr) {
            1 -> {
                println("Qual produto deseja adicionar ? ")
                val produto = readLine()!!
                if (produto.isEmpty()) {
                    println("Produto invalido")
                } else {
                    estoque.add(produto)
                    println("Produto inserido")
                }
            }
            2 -> {
                println("Qual produto deseja remover ?")
                val produto = readLine()!!
                if (produto.isEmpty()) {
                    println("Produto invalido")
                } else {
                    if (estoque.contains(produto)) {
                        estoque.remove(produto)
                        println("O $produto foi removido.")
                    } else {
                        println("$produto não está na lista")
                    }
                }
            }
            3 -> {
            println("Qual produto deseja atualizar ?")
                val produto = readLine()!!
                if(produto.isEmpty()){
                    println("Produto inválido")
                }else{
                    if(estoque.contains(produto)){
                        val posProd = estoque.indexOf(produto)
                        println("Qual é o novo produto ?")
                        val novoProd = readLine()!!
                        if (novoProd.isEmpty()){
                            print("Poduto Invalido")
                        }else{
                            estoque[posProd] = novoProd
                            println("Produto atualizado")
                        }
                    }else{
                        println("O $produto não existe na lista")
                    }
                }

            }
            4 ->{
                if(estoque.isEmpty()){
                    println("O estoque está vazio")
                }else{
                    println("--- O estoque possui ---")
                    estoque.forEach{
                        println(it)
                    }
                }
            }
            else -> break
        }
        }
    }