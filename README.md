# ☕ Programação Orientada a Objetos em Java

Repositório dedicado ao estudo, implementação e consolidação dos pilares da **Programação Orientada a Objetos (POO)** e boas práticas de desenvolvimento em Java.

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java (JDK 17+)
- **Paradigma:** Orientação a Objetos (POO)
- **Ambiente de Desenvolvimento:** Eclipse / VS Code / IntelliJ IDEA
- **Controlo de Versões:** Git & GitHub

---

## 📁 Estrutura do Repositório

O projeto está organizado em 11 módulos práticos e progressivos:

| Diretório | Foco Temático | Principais Conceitos Implementados |
| :--- | :--- | :--- |
| `aula_01a/` | Introdução a Classes e Objetos | Modelação de entidades (`Veiculo`), instâncias, atributos e métodos de ação (`acelerar`, `parar`). |
| `aula_01b/` | Métodos e Assinaturas | Métodos com parâmetros, retorno de tipos primitivos e chamadas aninhadas em `Calculos`. |
| `aula_01c/` | Orquestração e Controlo de Fluxo | Separação de responsabilidades com `SolicitarCalculos`, menu interativo com `switch-case`. |
| `aula_24/` | Polimorfismo e Coleções | Polimorfismo dinâmico (`@Override`), sobrecarga de métodos (*overloading*) e listas heterogéneas (`List<Animal>`). |
| `aula_25/` | Abstração e Múltiplas Interfaces | Classes abstratas (`Forma`), contratos de interface (`Formato`, `Angulacao`) e implementação em `Circulo`. |
| `exercicio_folha_pagamento/` | Regras de Negócio Empresariais | Herança com classe base `Funcionario`, contrato `Bonificavel`, verificação com `instanceof` e *casting*. |
| `exercicios_praticos/` | Automação e Temporização | Simulação do ciclo de vida de uma bomba de água (`Bomba`), gestão de estados e controlo com `Thread.sleep`. |
| `gps/` | Sobrecarga de Construtores | Construtores padrão e parametrizados, manipulação e apresentação de coordenadas e rotas em `GPS`. |
| `heranca_encapsulamento/` | Modificadores de Acesso | Atributos privados (`private`), métodos de acesso (*getters/setters*) e extensão para `PessoaFisica` e `PessoaJuridica`. |
| `mundo_animal/` | Especialização de Classes | Hierarquia biológica baseada em `Animal`, definindo extensões para animais voadores, terrestres e aquáticos. |
| `planeta/` | Herança e Domínios Específicos | Aplicação de superclasse e subclasses com atributos dimensionais e testes integrados em `Planeta`. |

---

## 🧠 Pilares e Princípios Demonstrados

- **Abstração:** Criação de moldes coerentes para entidades do mundo real, isolando detalhes internos através de interfaces e classes abstratas.
- **Encapsulamento:** Proteção da integridade dos atributos internos através de modificadores de visibilidade restritos e métodos de acesso controlados.
- **Herança:** Reutilização e especialização de código estrutural utilizando `extends` e construtores base com `super()`.
- **Polimorfismo:** Sobrescrita de métodos com comportamento dinâmico em tempo de execução e sobrecarga de assinaturas em tempo de compilação.

---

## 🚀 Como Compilar e Executar

1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/seu-utilizador/nome-do-repositorio.git](https://github.com/seu-utilizador/nome-do-repositorio.git)
   cd nome-do-repositorio
