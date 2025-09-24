# Jokenpo API

API REST para o clássico jogo Pedra, Papel e Tesoura onde jogadores podem competir contra o computador.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.5.6
- Maven
- Lombok

## Estrutura do Projeto

O projeto segue a arquitetura padrão Spring Boot com os seguintes componentes principais:

- **Controllers**: Manipulam as requisições HTTP
  - `GameController`: Controlador principal do jogo
- **Models**: Lógica principal e entidades
  - `Game`: Lógica do jogo
  - `Player`: Representação do jogador
  - `Jogada`: Enum com as jogadas possíveis (PEDRA, PAPEL, TESOURA)
- **DTOs**: Objetos de transferência de dados
  - `JogadaRequest`: Formato de entrada
  - `ResultadoResponse`: Formato de saída

## Como Usar a API

### Realizar uma Jogada

**Endpoint**: POST `/api/jokenpo/jogar`

**Corpo da Requisição**:
```json
{
    "jogada": "PEDRA" | "PAPEL" | "TESOURA"
}
```

**Exemplo de Resposta**:
```json
{
    "resultadoRodada": "Jogador venceu!",
    "jogadaComputador": "TESOURA",
    "vitoriasJogador": 1,
    "vitoriasComputador": 0,
    "resultadoFinal": "Jogador está ganhando!"
}
```

## Regras do Jogo

- Pedra vence Tesoura
- Papel vence Pedra
- Tesoura vence Papel
- Jogadas iguais resultam em empate

## Como Executar

1. Clone o repositório
2. Navegue até a pasta do projeto
3. Execute o comando:
```bash
mvn spring-boot:run
```

O servidor será iniciado em `http://localhost:8080`