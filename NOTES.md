# 1 Polimorfismo
* Tudo funcionou com esperado, até eu tentar ver a raça do animal Marinho e dar Null.
* Eu não tinha colado a possibilidade de passar raça no construtor do animal marinho.
* Eu não consigo passar no construtor do animal marinho as características de Raça, Alimentação e Força que é de animal.
* Eu não consigo fazer this. Posso fazer a gambiarra com SetRaça no construtor.
* Preciso avaliar se é a melhor.

# 2 - Estado
* Estado representa o momento de um objeto, aplicando uma ‘interface’, por exemplo, o estado do animal ao fazer ação muda.
* Se for Marinho, ele vai estár a nadar. For uma ave, estár voando.
* O Design pattern é criar um Context, ele expõe como está o estado no momento.

# 3 - Composição, achei "simples" porém complexo.
* Porque eu tenho que definir, setMotor e da CarroComposição.getMotor.getMontadora pra chegar ao nome do motor do carro composto.
* Mais verboso talvez, não entendi aplicação real, apesar de eu fazer isso o tempo inteiro em Api's passando outros Objetos.
* Como NotaFiscal que recebem List<Itens> itens. Elas são os itens que compõem a Nota.

# 4 - Herança
* Herança é sobre uma caracteristica herdada, então ela não permite alteração.
* Eu não consigo criar um carro e alterar o atributo motor com herança.
* Porque ao herdar, eu perco acesso a superclasse em runtime para alterar.

# 5 Herança vs Composição
* Herança possui polimorfismo porém é diferente do por composição.
* Em composição eu consigo alterar o estado, passando hora um pai e hora um mãe e pegar diferentes atributos em runtime.
* Com herança eu consigo polimorfar o comportamente, em cachorro extendendo animal ele late, em gato ele mia.

# 6 Generics
* Abstração total, podendo reutilizar códigos que são repetidos
* Criar funções menores, como save() ou verificações
* Sendo assim, consigo passar qualquer tipo de objeto e ter mesmo comportamento.

# 7 Exception
* Tive dificuldade pra compreender, porém eu sei que RuntimeException é pra erros não esperados, e ou tratados, nullPointer, argumentoErrado.
* Exception é pra erros previstos, falhas de SQL, erros ao consultar o banco de dados e o sistema devolve oque tem em cache.
* Posso criar minha Excessão, e retornar um record com Erro personalizado para API, porém no código eu trato através do breakpoint.
* Try e catch, usado para capturar exceções que já ocorreram, tratar erros e impedir que o programa quebre.

# 8 Threads
* Tive dificuldade de aplicar, entendo que o conceito é executar uma atividade com mais CPU e preparar para em tempo de execução
* Vou tentar aplicar em um cenário mais claro
* Consegui entender que Threads é diferente de velocidade. É a capacidade do sistema funcionar de forma independente para cada tafera.
* Eu tenho função A, B e C sendo executadas porém D já está carregando.

# 9 ExecutorServices
* Possibilidade de trabalhar com serviços async dentro do Java e concorrentes.
* ExecutorServices é uma fabrica, criando esses serviços.
* Callable retorna Objetos com future.get() e Execute gera execução de serviços.

# 10 CompletableFuture
* Doug Lea, criou uma abstração de forma assincrona e factory de Threads, através dela você consegue criar oque no #9 era manual dinamico
* Através dele posso executar e tomar ações sem usar future.get(), computando sobre o mesmo em fluxos.
* Sendo assim posso utilizar outras funções enquanto gero na thread principal outra função.

# 11 Consumer/Producer
* É criar workers que dividem uma mesma fila, e entre eles dividem trabalhos balanceando as cargas.
* Crio em producer e itero sobre em consumer, criando assim uma carga balanceada.

# 12 Benchmark
* Medição de tempo de processamento, estresse e resposta.
* Dependências para fazer de forma profissional, medições internas para entregar acompanhamento
* Rotinas podem ser acompanhadas, medição de erros ou exepctions em threads ou filas.

# Avaliação
* Eu errei, achei que era polimorfismo e implementei HERANÇA e muito mal, esqueci do super para sobrepor Animal em Animal Marinho.
* DENTRO DO CONSTRUTOR DE Animal Marinho, o primeiro é o super() que recria as classes do primeiro objeto.
* Me dei conta que não sei fazer, vou tentar algo.
* Polimorfismo é mudar uma função, através de sobreescrita dentro de uma função e outra.
* Velocidade dando zero em animal e 40 em Maritmo.

* Eu tive que pesquisar pra aprender o pattern mas consegui entender e aplicar corretamente STATE PATTERN + POLIMORFISMO
* Eu polimorfo quando o DoAction do animal é alterado e o State Pattern é expor como está o estado no MOMENTO.

* Combinação de Generics e Composição e Estado é uma grande alavanca.
* Threads é bem poderoso e moderno.