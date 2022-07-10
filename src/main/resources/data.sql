INSERT INTO tb_course VALUES

(1, 'Aprenda a programar orientado a objetos com Java', 'https://img-c.udemycdn.com/course/240x135/969548_48c9_5.jpg' , '0', 'Orientacao a Objetos com Java', '150.00', '20', '120.00'),

(2, 'Aprenda de uma vez por todas Algoritmos, Logica de Programacao, Constantes, Variaveis, Operadores e muito mais!', 'https://img-c.udemycdn.com/course/240x135/1693748_4c8f.jpg', '0', 'Algoritmos e Logica de Programacao do basico ao avancado', '140.00', '10', '126.00'),

(3, 'Aprenda a criar web services com SpringBoot.', 'https://img-c.udemycdn.com/course/240x135/2330858_e73f.jpg', '0', 'API RESTful com SpringBoot', '140.00', '0', 0),

(4, 'Desenvolva um projeto de Web API de pontos turisticos com Python + Django + Django Rest Framework e deploy no Heroku', 'https://img-c.udemycdn.com/course/240x135/1631400_e3d1_2.jpg', '1', 'Criando poderosas API''s RESTful com Django Rest Framework', '150.00', '20', '120.00'),

(5, 'Aprenda a criar uma aplicacao completa com Ruby on Rails API-only', 'https://img-c.udemycdn.com/course/240x135/1082928_b432_3.jpg', '1', 'Desenvolvendo REST / RESTful APIs com Ruby on Rails', '140.00', '10', '126.00'),

(6, 'Do Zero ao Expert em Spring Boot e todo o ecossistema Spring. Guia Completo e atualizado.', 'https://img-c.udemycdn.com/course/240x135/2777074_6d96_11.jpg', '1', 'Spring Boot Expert: JPA, RESTFul API, Security, JWT e Mais', '140.00', '0', '0');

INSERT INTO tb_module VALUES

(1, 'Historia do Java e Conceitos Iniciais de OO', '1h 18m', 1),

(2, '42m', 'Instalando o Java e o Eclipse', 1),

(3, '2h 37m', 'Pacotes, Heranca, Associacoes e Polimorfismo', 1),

(4, '28m', 'Constantes, Variaveis e Tipos de Dados', 2),

(5, '18m', 'Estruturas de Decisao', 2),

(6, '18m', 'Comandos de repeticao', 2),

(7, '18m', 'Web Services - basico', 3),

(8, '42m', 'API dos Carros', 3),

(9, '37m', 'Testes com Spring Boot', 3),

(10, '1h 58m', 'Desenvolvendo uma API de pontos Turisticos', 4),

(11, '42m', 'Desenvolvendo recursos avancados na API', 4),

(12, '27m', 'Habilitando buscas na API', 4),

(13, '3h 10m', 'Introducao ao Rails API-only', 5),

(14, '58m', 'Active Model Serializers', 5),

(15, '38m', 'Ajustes e Paginação', 5),

(16, '1h 18m', 'Spring Boot Core e Spring Framework', 6),

(17, '42m', 'Persistencia e Acesso a Dados com Spring Data JPA', 6),

(18, '37m', 'Spring Security e JWT', 6);

INSERT INTO tb_content VALUES

(1, 'JRE vs JDK'),

(2, 'Instalando o JDK no Mac'),

(3, 'Instalando o JDK no Linux'),

(4, 'Instalando o JDK no Windows'),

(5, 'Instalando o JDK no Windows'),

(6, 'Eclipse'),

(7, 'Instalando o Eclipse no Mac'),

(8, 'Instalando o Eclipse no Linux'),

(9, 'Conhecendo o Eclipse'),

(10, 'Desenvolvendo Classes com o Eclipse'),

(11, 'Pacotes'),

(12, 'Arrays'),

(13, 'Associacoes'),

(14, 'Heranca'),

(15, 'Reescrita de Metodos'),

(16, 'Polimorfismo'),

(17, 'Pilares da OO'),

(18, 'Constantes'),

(19, 'Variaveis'),

(20, 'Tipos de Dados'),

(21, 'Declaracao de Variaveis'),

(22, 'Operacoes Logicas'),

(23, 'Estruturas de Decisao'),

(24, 'Comandos de Decisao'),

(25, 'Enquanto algo, Processar'),

(26, 'Ate que algo, Processar'),

(27, 'Enquanto algo, Processar'),

(28, 'Processar, Enquanto algo'),

(29, 'Processar, Ate que algo'),

(30, 'Para'),

(31, 'Criando o IndexController'),

(32, '@RequestMapping'),

(33, 'GET - POST - DELETE - PUT'),

(34, 'GET - @RequestParam'),

(35, '@PathVariable'),

(36, 'POST - @RequestParam'),

(37, 'Criando as tabelas no MySQL'),

(38, '@Service - Injecao de dependencias com Spring'),

(39, 'Criando o IndexController'),

(40, 'Ajuste Timezone MySQL'),

(41, 'JPA - Lista de Carros do banco de dados'),

(42, '@Id @GeneratedValue (Auto vs Identity)'),

(43, 'Get Carro By Id'),

(44, 'Get Carro By Tipo'),

(45, 'POST - Salvar Carro'),

(46, 'PUT - Atualizar o Carro'),

(47, 'DELETE - Excluir um Carro'),

(48, 'Testes com Spring Boot'),

(49, 'Teste para Inserir um Carro'),

(50, 'Teste para inserir e Deletar um Carro'),

(51, 'A necessidade de termos um banco de dados para testes'),

(52, 'H2 - banco de dados em memoria para testes'),

(53, 'Preenchendo o H2 com uma massa de testes'),

(54, 'Testes HTTP na API'),

(55, 'Criando e modelando a app pontos turisticos'),

(56, 'Criando e modelando a app Atracoes'),

(57, 'Criando e modelando a app de comentarios e avaliacoes'),

(58, 'Criando e modelando a app de Localizacao'),

(59, 'Primeiros passos da API'),

(60, 'Entendendo o CRUD do ModelViewSet'),

(61, 'Consumindo a API com Postman'),

(62, 'Criando o Endpoint de Atracoes'),

(63, 'Criando o Endpoint de Enderecos'),

(64, 'Criando o Endpoint de Comentarios'),

(65, 'Criando o Endpoint de Avaliacoes'),

(66, 'Implementando get_queryset em Pontos Turisticos'),

(67, 'Sobrescrevendo a action de GET'),

(68, 'Sobrescrevendo a action de POST'),

(69, 'Sobrescrevendo a action de DELETE'),

(70, 'Sobrescrevendo a action de update, partial_update e retrieve'),

(71, 'Implementando suas proprias actions personalizadas'),

(72, 'Utilizando DjangoFilter backend'),

(73, 'Utilizando o SearchFilter'),

(74, 'Alterando o lookup_field padrao do endpoint'),

(75, 'Analisando as Requisicoes HTTP'),

(76, 'Analisando as Respostas HTTP'),

(77, 'Conhecendo os Verbos HTTP'),

(78, 'Render JSON e Fix Auto-Reloading'),

(79, 'Active Model Serializers'),

(80, 'i18n + json_api Adapter'),

(81, 'Visualizando Campos Associados'),

(82, 'Desmistificando o Accept x Content-Type'),

(83, 'Paginação via HEADERS'),

(84, 'Paginação via JSON API'),

(85, 'Starters: Como funciona a magica por tras do Spring Boot'),

(86, 'Configurations e Beans'),

(87, 'O Container IOC do Spring Framework'),

(88, 'Injecao de Dependencias'),

(89, 'Configuracao externalizada: Application Properties'),

(90, 'Trabalhando com multiplos ambientes e profiles'),

(91, 'Criando as classes de modelo'),

(92, 'Salvando e recuperando clientes'),

(93, 'Mapeando a Entidade Cliente para JPA'),

(94, 'Refatorando as outras operacoes para o JPA'),

(95, 'Query Methods'),

(96, 'Trabalhando com @Query'),

(97, 'Configurando autenticacao em memoria'),

(98, 'Configurando a autorizacao de urls'),

(99, 'Configurando as Roles e Authorities');

INSERT INTO tb_module_contents VALUES
(2,1),
(2,2),
(2,3),
(2,4),
(2,5),
(2,6),
(2,7),
(2,8),
(2,9),
(3,10),
(3,11),
(3,12),
(3,13),
(3,14),
(3,15),
(3,16),
(3,17),
(4,18),
(4,19),
(4,20),
(4,21),
(5,22),
(5,23),
(5,24),
(6,25),
(6,26),
(6,27),
(6,28),
(6,29),
(6,30),
(7,31),
(7,32),
(7,33),
(7,34),
(7,35),
(7,36),
(8,37),
(8,38),
(8,39),
(8,40),
(8,41),
(8,42),
(8,43),
(8,44),
(8,45),
(8,46),
(8,47),
(9,48),
(9,49),
(9,50),
(9,51),
(9,52),
(9,53),
(9,54),
(10,55),
(10,56),
(10,57),
(10,58),
(10,59),
(10,60),
(10,61),
(10,62),
(10,63),
(10,64),
(10,65),
(11,66),
(11,67),
(11,68),
(11,69),
(11,70),
(11,71),
(12,72),
(12,73),
(12,74),
(13,75),
(13,76),
(13,77),
(13,78),
(14,79),
(14,80),
(14,81),
(15,82),
(15,83),
(15,84),
(16,85),
(16,86),
(16,87),
(16,88),
(16,89),
(16,90),
(17,91),
(17,92),
(17,93),
(17,94),
(17,95),
(17,96),
(18,97),
(18,98),
(18,99);