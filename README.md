# veichle-cost-api-1.0

Esse projeto tem fins estudantis, é apenas um projeto para testar meu conhecimento básico em relação ao Spring Boot. E como desafio desse projeto vou solucionar um desafio que foi proposto em uma vaga de Dev Java Junior Back-end na TOTVS, na qual eu não tinha o conhecimento necessário para resolver naquele momento, mas agora eu consegui.

Introdução do problema

## O que vai ser preciso para testar essa API?
  - Postman.
  - IDE que suporte Java 11 + Spring Boot.

## Forma de usar

### 1. Importe o projeto para a sua IDE.

### 2. Cadastrando um veículo:
  - Para realizar o cadastro é necessário abrir o Postman e digitar `http://localhost:8080/carros` na aba de busca e Colocar como Método HTTP como `POST`. Em seguida você irá acessar o `Body`, selecionar a opção `raw` e mudar de `TEXT` para `JSON`. Após feito isso, dentro do corpo você irá colar esse texto e modificar da forma que você preferir: `{
    "nome": "VOLKS",
    "modelo": "GOL",
    "marca": "RONALDO",
    "dataFabricacao": "23/10/2002",
    "consumoMedioCidade": 10,
    "consumoMedioRodovia": 14
}` De forma semelhante a imagem: <img src="https://i.imgur.com/8YAuRPL.png"></img> E clicar em `SEND` para estar cadastrando um veículo.

### 3. Adicionando um custo para o veículo cadastrado:
  - Primeiramente precisamos mudar o nosso link na aba de busca para `http://localhost:8080/carros/(ID)/gastos/(valorLitroGasolina)/(KmAndadosNaCidade)/(KmAndadosNaRodovia)`, o método HTTP continua como `POST` e basta você apertar em `SEND`, que o custo vai ser adicionando e calculado. Veja um exemplo de como eu fiz, substituindo os parâmetros que estão dentro dos parêntese:
<img src="https://i.imgur.com/GnuxWjt.png"></img>

### 4. Liste todos os veiculos cadastrados
  - Para ver todos os automóveis cadastros basta manter o mesmo link na aba de busca, e mudar o método HTTP de `POST` para `GET`, e em seguida cliclar em `SEND` e irá aparecer uma lista com todos os veículos que foram cadastrados.
