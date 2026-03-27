# validador-de-triangulos-java

Um projeto desenvolvido em Java para validar se três valores podem formar um triângulo, identificar seu tipo (Equilátero, Isósceles ou Escaleno) e calcular sua área utilizando a Fórmula de Heron.

---

## 🚀 Funcionalidades

- ✔ Validação dos lados do triângulo  
- ✔ Identificação do tipo de triângulo  
- ✔ Cálculo da área usando a Fórmula de Heron  
- ✔ Entrada de dados via console  

---

## 📌 Tecnologias utilizadas

- Java 17+
- NetBeans (opcional)
- Git e GitHub

---

## 📁 Estrutura do Projeto (Padrão Moderno)
src/
└── main/
└── java/
└── projetotriangulo/
├── ProjetoTriangulo.java
└── Triangulo.java

---

## ▶ Como Executar

### 1. Clone o repositório:
git bash
git clone https://github.com/GiovaniRamires/validador-de-triangulos-java.git

2. Compile os arquivos:
javac src/main/java/projetotriangulo/*.java

3. Execute o programa:
java -cp src/main/java projetotriangulo.ProjetoTriangulo

📘 Descrição das Classes
Triangulo.java
Armazena os três lados do triângulo
Valida a existência do triângulo
Calcula a área usando Heron
Retorna o tipo do triângulo

ProjetoTriangulo.java
Classe main responsável por:
Ler os valores do usuário
Criar um objeto Triangulo
Exibir os resultados

📄 Licença

Este projeto é livre para estudo e uso acadêmico.

👤 Autor

Giovani Ramires
Estudante de Análise e Desenvolvimento de Sistemas
