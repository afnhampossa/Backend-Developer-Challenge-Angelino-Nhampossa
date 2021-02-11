# [Backend Developer Challenge] Angelino-Nhampossa
Desenvolvimento de uma API Restifull em Java

# Tecnologias usadas
* Base de dados Mysql;
* Framework (Spring Boot);
* Java Persistence API - (usado para o mapeamento do objeto-relacional para objetos Java simples e comuns ou entidades);
* Para compilar o projecto usei (VScode), por conta da sua simplicidade.

# Funcionamento
Para o teste da minha API usei o postman (https://www.postman.com/), pois permite testa os métodos POST, PUT, GET, DELETE, os quais foram usados neste trabalho.
- Para criar um novo país, usa-se o seguinte (*path:"/api/paises/salvar"*);
- Para listar todos os países anteriormente criados, usa-se o seguinte (*path: "/api/paises/listar"*), neste caso vai retornar todos países cadastrados ordenados pelo identificador;
- Para modificar os dados de um país anteriormente criado, usa-se o seguinte (*path: "/api/paises/actualizar/{identififcador}"*), neste caso o identificador será substituido pelo id do país que se pretende modificar (*exemplo:"/api/paises/actualizar/2"*);
- Para eliminar um país anteriormente criado, usa-se o seguinte (*path:"/api/paises/apagar/{identififcador}"*), passando por parámetro o id do que se pretende eliminar;
- Para ordenar a lista dos países por qualquer uma das suas propriedades, criei dois métodos, onde um serve para ordenar de forma crescente (*path:"/api/paises/ordenar_asc/{atributo}"*) e o outro ordena de forma decrescente (*path: "/api/paises/ordenar_desc/{atributo}"*). O 'atributo' representa a propriedade escolhida para o ordenamento que será passado como paramêtro, (*exemplo: "/api/paises/ordenar_asc/nome"*) neste caso lista será ordenada pelo nome dos países.
