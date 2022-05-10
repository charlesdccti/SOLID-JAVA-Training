# SOLID-JAVA-Training

## 1 - SRP: Single responsibility principle 
(Ou simplesmente Princípio da responsabilidade única)

 -  Ele declara que cada classe do seu sistema deve ter apenas uma única função ou  responsabilidade


## 2 - OCP:  Open Close Principle
(Ou simplesmente Princípio aberto fechado)

- Ele declara que uma classe deve estar sempre aberto para extensão e fechado para modificação.
- Imagine que você tem uma classe cozinheiro e você quer e ele cozinhe uma pizza,  ele tem um método cozinhar lasanha e você quer que ele cozinha uma pizza.  mas você não pode alterar o método cozinhar lasanha para agora cozinhar também a pizza, você pode implementar uma interface  que declara um método cozinhar e estender em uma subclasse pizza com um método cozinhar pizza em uma subclasse lasanha com um método cozinhar lasanha. Para que ele consiga Cozinhar os dois pratos. 


## 3 - LSP: Liskov substitution principle
( Ou simplesmente Princípio da substituição de liskov )

- Declara que se S é subtipo do tipo T então o tipo T pode ser substituído pelo tipo S, ou seja, esse principio é parecido com o conceito de polimorfismo. Se declaro uma interface funcionário, então posso instanciar qualquer objeto que implementa a interface funcionário, por exemplo:

~~~Java
returnCooker(new Cooker()).cook(Dish.COOK_LASANHA);
~~~

- O codigo acima vai funcionar, pois ele usa o principio de substituiçao de liskov.


## 4 - ISP: Interface segregation principle
( Ou simplesmente Princípio da segregação de interfaces ) 
 
- Declara que os clientes não devem ser forçados a depender de métodos que eles não usam.

- Imagine que você tem um motorista que usa um carro automático, ele não pode ser forçado a pisar na embreagem porque um carro automático não tem embreagem. Então essa função deve ficar de fora da interface desse motorista, então você deve criar uma interface específica para o motorista que usa carro manual que precisa pisar na embreagem. Portanto existem motoristas que vão poder dirigir carros manuais, existem motoristas que vão conseguir dirigir carros automáticos e outros vão conseguir dirigir os dois, se eu fizer uma múltipla implementação de interfaces.

## 5 - DIP: Dependency inversion principle 
( Ou simplesmente Princípio da inversão de dependência)

- Declara que os módulos de alto nível não devem depender dos módulos de baixo nível, ambos devem depender da abstração, a abstração não deve depender dos detalhes e sim os detalhes devem depender da abstração. Os módulos de alto nível são as classes que executam as ações, os módulos de baixo nível são as ferramentas que são passadas para executar essa ação. As abstracoes sao as interfaces que conectam essas classes e os detalhes é como cada ferramentas funcionam.

- Então imagine se eu fornecer uma chave de presença e uma chave normal para meu motorista. Se eu der a chave normal, ele vai ter que inserir a chave e girar para ligar o carro e se eu der a chave de presença, ele simplesmente vai entrar no carro, colocar a chave no cockpit e apertar o botão start/stop e o carro estará ligado. Para isso, nós podemos utilizar um conceito visto anteriormente que é o princípio  da substituição de Liskov, se você criar um  método que recebe uma interface que é implementada pelas duas chaves, então você vai conseguir utilizar a LSP e vai conseguir receber qualquer uma das chaves como argumento desse método.   

