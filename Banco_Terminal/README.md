# :bank: Banco Terminal

Um simples sistema de terminal bancário em Java que simula a criação de uma conta bancária com interação via console.

## :computer: Funcionalidades

- **Cadastro de conta bancária** via terminal
- **Validação básica** de entrada de dados
- **Mensagem de confirmação** personalizada com os dados da conta

## :page_with_curl: Estrutura do Código

| Componente        | Tipo      | Descrição                          |
|-------------------|-----------|------------------------------------|
| `Scanner`         | Classe    | Responsável pela entrada de dados  |
| `numero`          | int       | Armazena número da conta           |
| `agencia`         | String    | Armazena número da agência         |
| `nomeCliente`     | String    | Armazena nome do titular           |
| `saldo`           | double    | Armazena saldo inicial             |

**Fluxo**: Entrada → Armazenamento → Formatação → Saída. Utiliza a classe Scanner para entrada de dados

## :arrow_forward: Como Executar

1. **Pré-requisitos**:
   - Java JDK 8+ instalado
