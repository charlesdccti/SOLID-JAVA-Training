# SOLID-JAVA-Training

## 1 - SRP: Single responsibility principle 
(Ou simplesmente Princípio da responsabilidade única)

 -  Ele declara que cada classe do seu sistema deve ter apenas uma única função ou  responsabilidade

## 2 - OCP:  Open Close Principle
(Ou simplesmente Princípio aberto fechado)

- Ele declara que uma classe deve estar sempre aberto para extensão e fechado para modificação.
- Imagine que você tem uma classe cozinheiro e você quer e ele cozinhe uma pizza,  ele tem um método cozinhar lasanha e você quer que ele cozinha uma pizza.  mas você não pode alterar o método cozinhar lasanha para agora cozinhar também a pizza, você pode implementar uma interface  que declara um método cozinhar e estender em uma subclasse pizza com um método cozinhar pizza em uma subclasse lasanha com um método cozinhar lasanha. Para que ele consiga Cozinhar os dois pratos. 
