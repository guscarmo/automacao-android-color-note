#language: pt
#enconding: UTF-8


@Validacao
Funcionalidade: Validar

Contexto: Cria uma nota e um checklist com tres itens
	Dado que eu criei a nota com o texto "Vou passar na Formacao de QA da Stefanini"
	E criei um checklist com o titulo "metas"
	E criei o checklist "Ser um stefaniner" 
	E criei o checklist "Resiliencia"
	E criei o checklist "Eu quero, eu posso"
	Entao com a nota e os tres checklist criados volta para a tela principal do sistema 
	
Cenario: Alterar a cor da nota
	Quando que eu abri a nota
	E eu editar a nota
	E trocar de cor
	Entao filtro pela cor a azul e aparece a nota que editei
	
Cenario: Marcar como concluido um ou varios itens da lista
	Dado que acionei o checklist de metas
	Quando acionar a meta Ser um stefaniner
	E Resiliencia
	Entao marcar como concluido
	
	
Cenario: Colocar um lembrete de quinze minutos na lista
	Dado que acionei o checklist de metas
	Quando entrar nas opcoes
	Entao acionar reminder para lembrete em quinze minutos
	E o lembrete e acionado
	

Cenario: excluir lista
	Dado que acionei o checklist de metas
	Quando entrar nas opcoes
	E acionar delete
	Entao a lista e enviada para a lixeira
	E esvazia a lixeira