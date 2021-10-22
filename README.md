# Olá! meu nome é Petrony e estou disponibilizando aqui um exemplo de como é feito uma API Rest utilizando Spring Boot.

"Informações como o projeto foi desenvolvido".
- Software foi desenvolvido utilizando o banco de dados PostgreSQL para salvar as informações da requisição).
- Basicamente você vai dar POST na url http://localhost:8080/api/people/save com o seguinte modelo de JSON

{
    "name":"petrony pimentel",
    "email": "petronypimentel@hotmail.com",
    "password": "O QUE VOCÊ QUISER"
}

- Esta informação vai ser recebida na API atravez de um objeto DTO (Objeto de Transferência de Dados).
- Apos receber esta informação é chamado o recurso Service onde é passado o DTO para conversão em entidade e posteriormente 
retornar o DTO com os dados ja salvo no banco de dados.

Passos para executar o projeto.

1 - Faça download do projeto e importe no seu STS ou na sua IDE preferida.
2 - Instale o banco de dados PostgreSQL.
3 - Configure a senha do seu banco de dados no arquivo application.properties.

Este projeto demostra como é feito uma API Rest utilizando Java Spring Boot

Link para download do PostgreSQL (https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)

Boa sorte por ai, qualquer duvida envie um e-mail para 
petronypimentel@hotmail.com


