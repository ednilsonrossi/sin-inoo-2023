# Análise do Exercício

## Enunciado

Em uma cantina, o sucesso de vendas no verão são sucos preparados à base de polpa de frutas. Um dos sucos mais vendidos
é o de morango com acerola, que é preparado com 2/3 de polpa de morango e 1/3 de polpa de acerola. Contudo, o cliente
pode solicitar um suco com qualquer combinação de polpas, respeitando **sempre a proporção de 2/3 e 1/3** da polpa
principal
para a complementar.

Para o comerciante, as polpas são vendidas em embalagens de igual volume e com preços distintos para cada uma delas, de
acordo com a fruta. O preço de venda de cada suco é calculado considerando o valor das polpas utilizadas acrescido da
porcentagem de lucro de 35% sobre o valor total das polpas utilizadas. Além disso, para facilitar as vendas, o valor de
venda é sempre um valor inteiro, obtido pelo **arredondamento para cima** do valor de venda calculado. Entretanto do
comerciante limita o **preço máximo de venda** dos sucos em **R$ 20,00**.

Considere as informações acima e elabore um sistema que receba o valor da polpa principal, o valor da polpa complementar
e apresente o valor de venda do suco e o valor do lucro ou prejuízo obtido.

Implemente um sistema orientado a objetos, utilizando conceitos de composição, que resolva o problema apresentado.

## Reflexão

Observa-se no enunciado a existência de duas classes, a classe que representa a polpa que será utilizada e a classe que
representa o suco. Percebe-se que o suco é **composto** de duas polpas, ou seja, existe a composição em suco (todo) por
duas polpas (partes), assim, um relacionamento **todo-parte**.

O relacionamento indicado pode ser observado no diagrama de classes a seguir. Temos a classe Polpa que possui como 
atributo apenas o valor da polpa. Por sua vez, a classe Suco possui os atributos custo e venda do tipo double e também
os atributos principal e complementar, ambos do tipo Polpa. Assim, a composição é formalizada com a inclusão de objetos
da **parte** como atributos do objeto **todo**.

![](https://github.com/ednilsonrossi/sin-inoo-2023/blob/main/ExerciciosFixacao/Fixacao7/ProjetoSucoDePolpa/SucoDePolpa/assets/classes.drawio.png?raw=true)

Observa-se nesse exemplo que a classe **todo** é composta por duas partes distintas, porém existem soluções que 
utilizam a composição de apenas uma parte ou mesmo de muitas partes. Nesse último caso, seria gerada uma lista de 
objetos partes na classe todo.