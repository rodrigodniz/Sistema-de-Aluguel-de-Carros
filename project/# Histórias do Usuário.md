# Histórias do Usuário

## 1. Cadastro de Cliente
**Como um** cliente individual,  
**Eu quero** me cadastrar no sistema,  
**Para que** eu possa acessar as funcionalidades de introdução, modificação, consulta e cancelamento de pedidos de aluguel.

### Critérios de Aceitação:
- O cliente deve fornecer RG, CPF, Nome, Endereço, Profissão, Entidades Empregadoras e Rendimento(s).
- O cadastro deve ser validado e o cliente deve receber uma confirmação de sucesso.

---

## 2. Introdução de Pedido de Aluguel
**Como um** cliente individual,  
**Eu quero** introduzir um pedido de aluguel,  
**Para que** eu possa alugar um automóvel através do sistema.

### Critérios de Aceitação:
- O cliente pode selecionar o automóvel desejado (matrícula, ano, marca, modelo e placa).
- O cliente deve ter a opção de associar o pedido a um contrato de crédito, se necessário.
- O pedido é enviado para análise financeira.

---

## 3. Modificação de Pedido de Aluguel
**Como um** cliente individual,  
**Eu quero** modificar um pedido de aluguel já introduzido,  
**Para que** eu possa corrigir ou ajustar detalhes antes da aprovação do contrato.

### Critérios de Aceitação:
- O cliente pode modificar pedidos em qualquer status, desde que o pedido ainda não tenha sido aprovado.
- As modificações devem ser enviadas para o agente financeiro para nova análise, se necessário.

---

## 4. Consulta de Pedido de Aluguel
**Como um** cliente individual,  
**Eu quero** consultar o status de um pedido de aluguel,  
**Para que** eu possa acompanhar o andamento do meu pedido no sistema.

### Critérios de Aceitação:
- O cliente pode visualizar o status do pedido (pendente, em análise, aprovado, rejeitado, etc.).
- O sistema deve mostrar detalhes do automóvel e do contrato, caso aplicável.

---

## 5. Cancelamento de Pedido de Aluguel
**Como um** cliente individual,  
**Eu quero** cancelar um pedido de aluguel,  
**Para que** eu possa desistir do aluguel antes da aprovação do contrato.

### Critérios de Aceitação:
- O cliente pode cancelar o pedido, desde que ele ainda esteja pendente ou em análise.
- Um pedido cancelado não pode ser reativado, e o cliente deve receber uma confirmação de cancelamento.

---

## 6. Avaliação de Pedido de Aluguel
**Como um** agente (empresa/banco),  
**Eu quero** avaliar um pedido de aluguel introduzido por um cliente,  
**Para que** eu possa decidir se aprovo ou rejeito o pedido com base em critérios financeiros.

### Critérios de Aceitação:
- O agente pode visualizar os dados de identificação e os rendimentos do cliente (até 3 rendimentos diferentes).
- O agente pode aprovar ou rejeitar o pedido após a análise financeira.
- A decisão deve ser registrada no sistema e o cliente notificado.

---

## 7. Modificação de Pedido de Aluguel (Agente)
**Como um** agente (empresa/banco),  
**Eu quero** modificar um pedido de aluguel,  
**Para que** eu possa ajustar detalhes financeiros e contratuais antes de aprová-lo.

### Critérios de Aceitação:
- O agente pode modificar detalhes financeiros do pedido, caso necessário.
- A modificação deve ser salva e enviada para consideração do cliente, se necessário.

---

## 8. Aprovação/Rejeição de Pedido de Aluguel
**Como um** agente (empresa/banco),  
**Eu quero** aprovar ou rejeitar um pedido de aluguel após a análise financeira,  
**Para que** o sistema possa gerar o contrato de aluguel ou notificar o cliente sobre a rejeição.

### Critérios de Aceitação:
- O agente deve poder tomar uma decisão final com base na análise financeira do pedido.
- Se aprovado, o contrato é gerado e o cliente notificado.
- Se rejeitado, o cliente deve ser notificado e ter a opção de modificar ou cancelar o pedido.
