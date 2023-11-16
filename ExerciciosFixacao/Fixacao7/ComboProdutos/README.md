# Projeto Combo de Produtos

## Objetivo

O objetivo desse projeto é trabalhar o conceito do relacionamento de composição. Ao analisar o enunciado observe
que os produtos podem ser vendidos separadamente e também podem **compor** um objeto combo. Ainda será utilizada a
composição ao criar um cardápio que é composto por vários produtos.

## Enunciado

Considere uma lanchonete que vende separadamente os seguintes produtos: Bebida (Suco ou Refrigerante), Lanche e Batata
Frita (Pequena, Média e Grande). A lanchonete resolveu incluir um novo produto denominado Combo, composto por Bebida,
Lanche e Batata Frita. Para definir o preço de venda do combo, soma-se o valor individual de cada item, e realizado um
desconto de 15%, e arredondando o valor para cima.

Implemente o diagrama de classes apresentado abaixo. O sistema organiza o funcionamento com lista de cada produtos
pré-cadastrados, porém o combo é definido pelo cliente no momento do pedido, assim, pode ser composto por qualquer um
dos produtos. O sistema deve realizar vendas, de produtos (Lanche, Bebida, Batata Frita ou Combos), apresentando o valor
de venda do produto e registrando todos os valores recebidos.

O diagrama é uma referência, está incompleto e apresenta a estrutura do software. Implemente o sistema usando divisão de
responsabilidades.

![](/home/ednilson/Documentos/workspace/sin-inoo-2023/ExerciciosFixacao/Fixacao7/ComboProdutos/assets/classes_combo_cantina.drawio.png)

**Atenção:** No enunciado original não consta a classe Cardápio. Essa classe foi adicionada para permitir a 
exemplificação de uma composição onde a classe todo (Cardapio) é composta por muitos (*) objetos de parte (Produto).  

## Reflexão

Iniciamos a reflexão pelas classes Bebida e Batata Frita. Observa-se que essas classes possuem um atributo do tipo
ENUM para representar os valores possíveis para cada um dos objetos. Tem-se dessa forma uma composição onde a classe
todo possui apenas uma parte.

Analisando a classe Combo tem-se que o Combo **é composto** por três partes distintas, ou seja, o combo é composto por
UMA Bebida, UM Lanche e UMA BatataFrita. 

Observa-se ainda, que todas as classes implementam a interface Produto. Dessa forma, Bebida, Lanche, BatataFrita e 
**Combo** devem implementar os métodos getPreco() e getNome() para atender o contrato imposto pela interface.

Por fim, temos a classe Cardapio. Um cardápio é **composto** por muitos (indicado com o * no modelo) objetos que 
implmentam a interface Produto. Aqui temos o conceito de polimorfismo ao armazenarmos uma lista de produtos no 
Cardápio. Então a composição ocorre com a indicação de um atributo do tipo List<Produto> ou seja, uma lista que 
permite armazenar vários produtos. Para lidar com a lista são indicados os métodos gets() e adicionarProduto() que 
adicionam ou consultam valores da lista existente no cardápio.