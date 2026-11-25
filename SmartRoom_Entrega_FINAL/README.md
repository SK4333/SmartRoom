# SMARTROOM
## Sistema de Gestão e Reserva de Salas

Projeto acadêmico desenvolvido em Java para demonstrar conceitos de Programação Orientada a Objetos e três padrões de projeto: Factory Method, Decorator e Observer.

---

## 1. O que o sistema faz

O exemplo demonstra como:
1. Criar diferentes tipos de sala.
2. Cadastrar um usuário e criar uma reserva.
3. Adicionar recursos extras à reserva.
4. Calcular o custo total.
5. Avisar os interessados quando o status da reserva muda.

Os dados e valores utilizados são fictícios e servem para demonstrar o funcionamento do projeto.

## 2. Estrutura das pastas

```text
SmartRoom_Entrega/
├── src/smartroom/
│   ├── Main.java
│   ├── factory/       # Factory Method: fábricas de cada tipo de sala
│   ├── decorator/     # Decorator: recursos adicionais da reserva
│   ├── observer/      # Observer: notificações de mudança de status
│   └── model/         # Classes principais do domínio
├── documentacao/
├── executar.bat
├── executar.sh
└── README.md
```

## 3. Padrões de projeto utilizados

### Factory Method
A classe abstrata `SalaFactory` define o método `criarSala`. As fábricas concretas `SalaAulaFactory`, `LaboratorioFactory` e `AuditorioFactory` implementam esse método e criam cada tipo de sala. Assim, a classe principal trabalha com a abstração da fábrica, sem executar diretamente o `new` das salas.

### Decorator
Os decoradores acrescentam recursos e valores à reserva sem precisar criar uma classe para cada combinação:
- Projetor 4K: R$ 50,00
- Coffee Break: R$ 80,00
- Suporte técnico: R$ 60,00

### Observer
A reserva mantém uma lista de observadores. Quando seu status muda, todos recebem uma notificação:
- `NotificadorEmail`
- `EquipeInfraestrutura`
- `LogAuditoria`

**Nota:** o aviso de e-mail é simulado no console; o programa não envia e-mails reais.

## 4. Como executar no Windows

1. Instale o JDK (Java Development Kit).
2. Extraia o arquivo ZIP.
3. Abra a pasta `SmartRoom_Entrega`.
4. Dê dois cliques em `executar.bat` ou abra o terminal nessa pasta.
5. Se usar o terminal, execute:

```bash
find src -name "*.java" -print0 | xargs -0 javac -encoding UTF-8 -d out
java -cp out smartroom.Main
```

## 5. Como executar no IntelliJ IDEA, Eclipse ou VS Code

Abra a pasta `SmartRoom_Entrega` como projeto. Compile os arquivos da pasta `src` e execute a classe `smartroom.Main`.

## 6. Resultado esperado

A execução:
- cria uma sala de aula e um laboratório;
- cria uma reserva para um usuário;
- adiciona projetor, coffee break e suporte técnico;
- apresenta o custo total;
- altera o status para confirmada e cancelada;
- mostra os avisos dos três observadores.
