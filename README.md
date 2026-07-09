# 📋 TaskFlow

TaskFlow é um aplicativo Android para gerenciamento de tarefas, desenvolvido com Kotlin e Jetpack Compose.

O objetivo deste projeto é servir como um estudo prático de desenvolvimento Android moderno, aplicando boas práticas de arquitetura, organização de código e documentação desde o início.

---

# 🎯 Objetivos

Durante o desenvolvimento deste projeto serão aplicados conceitos utilizados em projetos profissionais, como:

- Kotlin
- Jetpack Compose
- Material Design 3
- Navigation Compose
- MVVM
- Repository Pattern
- Room Database
- Coroutines
- StateFlow
- Clean Code
- Clean Architecture (adaptada)
- Git Workflow
- Documentação Técnica

---

# 📱 Funcionalidades (Roadmap)

## Sprint 1
- [x] Planejamento do projeto
- [x] Levantamento de requisitos
- [x] Definição da arquitetura
- [x] Criação do projeto Android
- [ ] Estrutura inicial

## Sprint 2
- [ ] Primeira tela
- [ ] Componentes reutilizáveis

## Sprint 3
- [ ] Navegação

## Sprint 4
- [ ] Persistência de dados com Room

## Sprint 5
- [ ] CRUD completo

## Sprint 6
- [ ] Pesquisa

## Sprint 7
- [ ] Filtros

## Sprint 8
- [ ] Polimento da interface

---

# 🏗 Arquitetura

O projeto seguirá uma adaptação da Clean Architecture utilizando MVVM.

```
Presentation
        │
ViewModel
        │
Repository
        │
Data Source (Room)
```

Organização prevista:

```
com.brunorafael.taskflow
│
├── data
│
├── domain
│
├── ui
│   ├── components
│   ├── navigation
│   ├── screens
│   └── theme
│
├── utils
│
└── viewmodel
```

---

# 🛠 Tecnologias

- Kotlin
- Jetpack Compose
- Material Design 3
- Android Studio Meerkat
- Gradle Kotlin DSL
- Version Catalog
- Room
- Coroutines
- StateFlow

---

# 📂 Organização do Projeto

```
TaskFlow
│
├── app
├── assets
├── docs
├── roadmap
└── README.md
```

---

# 📖 Documentação

A documentação do projeto será organizada na pasta `docs`.

Exemplos:

- Architecture Decision Records (ADR)
- Arquitetura
- Diagramas
- Padrões adotados
- Fluxo de desenvolvimento

---

# 🤝 Working Agreement

Este projeto seguirá as seguintes regras durante todo o desenvolvimento.

## Regra #001 — Fluxo de Revisão

Toda Sprint seguirá o fluxo:

```
Planejamento
        ↓
Implementação
        ↓
Code Review
        ↓
Correções
        ↓
Nova Review
        ↓
Aprovado
        ↓
Próxima Sprint
```

Nenhuma Sprint será iniciada antes da aprovação da Sprint atual.

---

## Regra #002 — Uma responsabilidade por Sprint

Cada Sprint possuirá apenas um objetivo.

Não serão introduzidos novos conceitos enquanto existirem pendências na Sprint atual.

---

## Regra #003 — Revisão Técnica

Toda revisão será composta por:

- Objetivo
- Review
- Resultado
- Correções (quando necessário)

---

## Regra #004 — Critérios de Aprovação

Existem apenas três estados para uma Sprint:

- 🟢 Aprovado
- 🟡 Aprovado com observações
- 🔴 Reprovado

---

## Regra #005 — Código compreendido antes de ser escrito

Nenhum trecho de código será copiado sem que seu funcionamento seja compreendido.

Sempre responderemos:

- O que faz?
- Por que existe?
- Quando utilizar?
- Existe alternativa?

---

## Regra #006 — Evolução incremental

O projeto será desenvolvido em pequenas entregas.

A prioridade será sempre:

1. Clareza
2. Organização
3. Qualidade
4. Evolução contínua

---

# 🚀 Objetivo Final

Ao final do projeto espera-se possuir um aplicativo Android pronto para evolução e possível publicação na Google Play Store, além de um código organizado que possa servir como portfólio de desenvolvimento Android moderno.

---

# 👨‍💻 Desenvolvedor

Bruno Rafael

---

# 📄 Licença

Projeto desenvolvido para fins de estudo e evolução técnica.