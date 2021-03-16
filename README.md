# Favorecidos-Suspeitos

API criada utilizando o framework springboot, persistindo\consumindo registros em uma base noSql (mongodb).

-API Favorecidos-Suspeitos: Recebe um numero de cpf\cnpj e o cadastra em uma collection (blackListFavorecidos). -API Transferencias: Recebe um código de transação (codTransacao), número de cpf\cnpj remetente (nuCpfCnpjRemetente), número de cpf\cnpj favorecido (nuCpfCnpjFavorecido), valor de transação (vrTransacao).

Instruções de instalação:

-Base mongodb

Para criar a baixar a imagem mongodb, execute o seguinte comando via docker cli: docker pull mongo

Para criar a instância mongodb utilizada nas API's, execute o seguinte comando via docker cli: docker run -d --name pldfraudes -p 27017:27017 -p 28017:28017 -e AUTH=no mongo

Após a instalação do mongodb, criar a base de dados pldfraudes_db através do seguinte comando: use pldfraudes_db

-API Favorecidos-Suspeitos

Clone o projeto em um diretorio de sua workstation

Navegue ate a pasta raiz do projeto - [cd Favorecidos-Suspeitos]

Execute o comando maven: [mvn clean install] - Apos a execução do comando o maven ira gerar o .jar executavel

Execute o comando [java -jar target/Favorecidos-Suspeitos-0.0.1-SNAPSHOT.jar] para iniciar a aplicação

A aplicação criará um endpoint no endereço: http://localhost:8081/api/favorecidos/

A API espera receber uma requisição POST e receberá um json no seguinte formato:

{ "nuCpfCnpj": "string" }
