# Roteiro de apresentação — SmartRoom

## Introdução
"Nosso projeto é um sistema para representar reservas de salas da instituição. Ele permite criar diferentes tipos de salas, adicionar recursos extras e avisar os setores quando uma reserva muda de status."

## Factory Method
"A classe abstrata SalaFactory define o método criarSala. As fábricas SalaAulaFactory, LaboratorioFactory e AuditorioFactory implementam esse método e criam cada tipo de sala. A Main escolhe a fábrica concreta e recebe uma Sala."

## Herança das salas
"Sala é abstrata porque guarda os dados que todas as salas têm em comum: código, capacidade, valor base e necessidade de aprovação de TI. SalaAula, Laboratorio e Auditorio herdam esses dados e têm suas próprias características."

## Decorator
"O Decorator permite colocar recursos extras na reserva sem criar uma classe para cada combinação. Cada decorador recebe a reserva, acrescenta uma descrição e soma seu preço."

## Observer
"O Observer permite que vários setores acompanhem a reserva. Quando o status muda, a própria reserva avisa os observadores cadastrados."

## Main
"Na Main criamos duas salas pela fábrica, criamos o usuário e a reserva, cadastramos os observadores, adicionamos três recursos e mostramos o custo. Depois mudamos o status para confirmada e cancelada para mostrar as notificações."

## Perguntas comuns
1. Por que Sala é abstrata? Porque representa características comuns e serve de base para os tipos concretos.
2. Para que serve a Factory? Para centralizar a criação das salas.
3. Para que serve o Decorator? Para adicionar recursos e custos dinamicamente.
4. Para que serve o Observer? Para avisar automaticamente todos os interessados quando o status muda.
5. O e-mail é enviado de verdade? Não. A notificação é demonstrada no console, como exemplo didático.
