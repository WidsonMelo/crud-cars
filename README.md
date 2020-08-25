# crud-cars
crud-cars é uma aplicação API-REST simples produzido com Spring Boot.
Esta aplicação serve para realizar operações básicas para criar(to create), ler(to read), atualizar(to update) e deletar(to delete) registros de carros no banco de dados.
O banco de dados é composto por apenas uma tabela simples à qual remete ao registro de carros.

## Tecnologias
- MySQL 8.0.21
- Spring Boot 2.3.3
- JDK 1.8.0_261

## Notas desta Versão

O arquivo para insersão da base de dados encontra-se no diretório abaixo:
```
\src\main\resources\aplication.properties
```

Para facilitar a modelagem do banco de dados, deixei disponível um arquivo Database.sql localizado em:
```
\src\main\resources\Database.sql
```

Para que este arquivo de script opere automaticamente, é necessário configurar o arquivo application.properties para o modo "create-drop" apenas na primeira execução. A partir da segunda, recomenda-se o uso do "update".
```
spring.jpa.hibernate.ddl-auto = create-drop
spring.jpa.hibernate.ddl-auto = update
```

### Instalação
Para startar o projeto para seu computador, siga as seguintes instruções:
Baixar este projeto em formato .zip.
```
Clone or Download > Download ZIP
```

Extrair  o projeto para seu workspace folder.
No eclipse, importar o projeto como projeto MAVEN seguindo os passos abaixo
```
File > Import >  Maven > Existing Maven Projects (next) 
```

Navegar até o diretório que encontra-se a pasta do projeto que foi extraído (brouse)
```
File > Import >  Maven > Existing Maven Projects (next) > Finish
```

## Informações de Configuração dos Pacotes
Utilizar o MySql versão 8 instalado na máquina.
Criar manualmente um database denominado crudcarsdb antes de iniciar a aplicação.
```
create database crudcarsdb;
```

Login do MySql: root
Senha do MySql: 123456
Para qualquer outra observbação, inspecionar o arquibo "application.properties" e também o "pom.xml".

## Rodando a aplicação
Após importar o projeto, o Maven irá fazer o downloads das dependências necessárias e isso levará alguns minutos, conforme informação na barra inferior esquerda do eclipse (Progress).

### Startando  a licação WEB
Executar a seguinte classe (Run As Java Application).
```
crud-cars > com.widson.crudcars > CrudCarsApplication.java
```

## Autor
**Widson Melo**

```
Linkedin https://www.linkedin.com/in/widsonmelo/
```