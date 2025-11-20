Aqui está tudo formatado **pronto para colar direto no seu `README.md`**, com tabelas, blocos de código e títulos organizados corretamente:

---

````markdown
# 📚 CRUD de Produtos com Testes Automatizados (Mockito, JUnit, JMeter)

Este projeto é uma API RESTful desenvolvida em **Spring Boot** para gerenciamento de dados de **Produtos (CRUD)**, com foco na qualidade e estabilidade através de diferentes camadas de testes automatizados.

---

## 🛠️ Tecnologias Principais

Este projeto utiliza as seguintes tecnologias para oferecer uma solução robusta:

| Categoria             | Produto/Ferramenta      | Descrição                                                                 |
|----------------------|-------------------------|---------------------------------------------------------------------------|
| Backend              | Java 17+ & Spring Boot 3 | Framework principal para construção da API REST.                          |
| Persistência         | Spring Data JPA          | Utilizado para mapeamento ORM e interação com o banco de dados.          |
| Banco de Dados       | H2 Database              | Banco de dados em memória para desenvolvimento e testes rápidos.         |
| Testes Unitários     | Mockito & JUnit 5        | Criação e execução de testes unitários simulando dependências.           |
| Testes de Integração | Spring Boot Test         | Garante comunicação correta entre Controller, Service e Repository.      |
| Testes de Carga      | Apache JMeter            | Mede o desempenho e robustez da API sob alta carga de requisições.       |

---

## 🚀 Configuração e Execução

Siga os passos abaixo para configurar e rodar o projeto localmente.

### 1️⃣ Clonagem do Repositório

Para obter o código-fonte, execute:

```bash
git clone https://github.com/igorgustavo31/CRUD-com-Testes-Automatizados-Mockito-JMeter-.git
cd CRUD-com-Testes-Automatizados-Mockito-JMeter-
````

---

### 2️⃣ Execução (via Gradle ou IDE)

**Pré-requisitos:**
Certifique-se de ter o **JDK 17 ou superior** instalado.

**Compilação e Execução**

```bash
# Compila o projeto e executa os testes
./gradlew clean build

# Executa a aplicação Spring Boot
./gradlew bootRun
```

A aplicação estará disponível em:

```
http://localhost:8080
```

---

## 📡 Endpoints Principais

A API oferece os seguintes endpoints para gerenciamento de Produtos:

| Recurso  | Método | URL            | Descrição                      |
| -------- | ------ | -------------- | ------------------------------ |
| Produtos | POST   | /produtos      | Cria um novo produto.          |
| Produtos | GET    | /produtos      | Lista todos os produtos.       |
| Produtos | GET    | /produtos/{id} | Busca um produto específico.   |
| Produtos | PUT    | /produtos/{id} | Atualiza um produto existente. |
| Produtos | DELETE | /produtos/{id} | Deleta um produto.             |

---

## 🧪 Executando os Testes

### ✔ Testes Unitários e de Integração (Mockito/JUnit)

Os testes de código podem ser executados com:

```bash
./gradlew test
```

Localização dos testes:

```
src/test/java
```

---

### 📈 Testes de Carga (JMeter)

Para rodar os testes de performance, é necessário ter o **Apache JMeter** instalado.

Passos:

1. Inicie o JMeter
2. Abra o arquivo `.jmx` localizado na raiz do projeto (se houver)
3. Configure número de usuários e duração
4. Execute e analise os resultados

---

## 🤝 Contribuição

Contribuições são bem-vindas!
Se encontrou um bug ou tem uma sugestão de melhoria, abra uma **Issue** ou envie um **Pull Request**.

### Processo de envio

```bash
# Registro das alterações
git commit -m "feat: Adiciona nova funcionalidade X"

# Envio para o repositório (branch ou fork)
git push origin nome-da-sua-branch
```


