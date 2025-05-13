![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo pode ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)
***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisa ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(("Inicio")) --> input1[\Digite sua nota - valor de 0 a 10\]
      input1 --> input2[\Digite sua nota em frequencia %\]
      input2 --> verification{Nota >= 50 \n E \n Frequencia >= 75}
      verification --> |Sim| output1[/Aprovado/]
      verification --> |Não| output2[/Reprovado/]
      output1 -->finish([Final])
      output2 -->finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      A((Inicio)) --> B[\Digite n1\]
      B -->C[\Digite N2\]
      C -->D[Resultado = n1+n2]
      D -->E[/Resultado\]
      E -->F([Final])
      
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
      flowchart TD
    start(( Início )) --> input[\Digite um número\]
    input --> verification{Numero >= 0?}
    verification --> |Sim| output1[/Positivo!/]
    verification --> |Não| output2[/Negativo!/]
    output1 --> finish([ Fim ])
    output2 --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Inicio )) --> input[\Informe sua idade: \]
      input --> verification{ Idade >=16 \n E \n Título de eleitor válido}
      verification --> |Sim| A[/Você está apto a votar!/]
      verification --> |Nao| B[/Você não está apto a votar!/]
      A --> finish([ Fim ])
      B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input1[\Digite o primeiro número\]
    input1 --> input2[\Digite o segundo número\]
    input2 --> comparison{Primeiro número > Segundo número?}
    comparison --> |Sim| output1[/Primeiro número é maior!/]
    comparison --> |Não| comparison2{Primeiro número < Segundo número?}
    comparison2 --> |Sim| output2[/Segundo número é maior!/]
    comparison2 --> |Não| output3[/Os dois números são iguais!/]
    output1 --> finish([ Fim ])
    output2 --> finish
    output3 --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input1[\Digite o primeiro número\]
    input1 --> input2[\Digite o segundo número\]
    input2 --> input3[\Digite o terceiro número\]
    input3 --> comparison1{Primeiro número > Segundo número?}
    comparison1 --> |Sim| comparison2{Primeiro número > Terceiro número?}
    comparison2 --> |Sim| output1[/Primeiro número é o maior!/]
    comparison2 --> |Não| output2[/Terceiro número é o maior!/]
    comparison1 --> |Não| comparison3{Segundo número > Terceiro número?}
    comparison3 --> |Sim| output3[/Segundo número é o maior!/]
    comparison3 --> |Não| output2
    output1 --> finish([ Fim ])
    output2 --> finish
    output3 --> finish  

   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
    A[Início] --> B[Entrada do número]
    B --> C{Número < 0?}
    C -->|Sim| D[Erro: Número inválido]
    C -->|Não| E{Número == 0?}
    E -->|Sim| F[Fatorial = 1]
    E -->|Não| G[Fatorial = 1]
    G --> H{Número > 1?}
    H -->|Sim| I[Multiplicar o fatorial por número]
    I --> G
    H -->|Não| J[Exibir o fatorial]
    D --> K[Fim]
    F --> K
    J --> K
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   ```mermaid
   flowchart TD
    A[Início] --> B[Entrada do número]
    B --> C{Número % 2 == 0?}
    C -->|Sim| D[O número é par]
    C -->|Não| E[O número é ímpar]
    D --> F[Fim]
    E --> F

   ```
    
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   ```mermaid
   flowchart TD
 A[Início] --> B[Entrada do número]
    B --> C{Número < 2?}
    C -->|Sim| D[Não é primo]
    C -->|Não| E{Número divisível por 2 ou outros números até raiz quadrada?}
    E -->|Sim| D
    E -->|Não| F[É primo]
    D --> G[Fim]
    F --> G
   ```