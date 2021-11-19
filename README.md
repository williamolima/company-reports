# company-reportsexpese
Respostas para as alterações

# Template Method

Método gancho. Tenho uma super classe para reportar um serviço, e vou aplicar dois métodos, quando no código existe um método apenas para gerar o <i>report</i>, e duas instâncias foram criadas. Com a solução, vamos ter apenas umas instância, com dois métodos diferentes, usando o mesmo código de processamento.

# Factory Method

Como existiam duas classes abstratas no escopo, foi adicionado uma classe Report, com uma função que atribui o objeto <i>report</i> o valor da classe abstrata adequada, retornando o objeto.
