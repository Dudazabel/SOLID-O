# Sistema de Compras Internacional

Este projeto implementa um sistema abrangente de compras internacionais focado em recursos de cálculo de impostos especificamente para importações nos EUA e Brasil. O sistema visa simplificar o processo de compra, garantindo conformidade com as regulamentações fiscais locais.

## Recursos

- **Cálculo de Impostos Específicos por País**: Calcula automaticamente os impostos de importação com base no país de destino.
- **Interface Amigável**: Interface simples e intuitiva para os usuários executarem compras.
- **Suporte Multi-moeda**: Trata transações em diferentes moedas, convertendo com base nas taxas de câmbio atuais.
- **Transações Seguras**: Implementa protocolos de segurança para proteger as informações do usuário e detalhes de pagamento.

## Começando

### Pré-requisitos

- Node.js v14 ou superior
- npm v6 ou superior

### Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/Dudazabel/SOLID-O.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd SOLID-O
   ```
3. Instale as dependências:
   ```bash
   npm install
   ```

### Uso

Execute a aplicação com:
```bash
npm start
```

### Cálculo de Impostos

#### Cálculo de Impostos nos EUA
- Os impostos de importação nos EUA são geralmente calculados com base no valor das mercadorias e na classificação tarifária.
- O sistema recupera as taxas de imposto atuais de fontes oficiais para calcular o imposto total necessário.

#### Cálculo de Impostos no Brasil
- Os impostos de importação do Brasil incluem Imposto de Importação (II), Imposto sobre Produtos Industrializados (IPI) e Imposto sobre Circulação de Mercadorias e Serviços (ICMS).
- A aplicação calcula cada tipo de imposto com base no valor do produto importado e nas alíquotas aplicáveis.

## Referência de API

- `GET /api/calculateTax`: Calcula o imposto de importação para um país e valor específicos.

### Exemplo de Requisição
```bash
GET /api/calculateTax?country=USA&value=1000
```

### Exemplo de Resposta
```json
{
  "country": "USA",
  "value": 1000,
  "tax": 100.00
}
```

## Contribuindo

Recebemos contribuições! Por favor, siga estas etapas:
1. Faça um fork do repositório.
2. Crie uma nova branch (`git checkout -b feature-branch`).
3. Faça suas alterações e confirme-as (`git commit -m 'Adicionar novo recurso'`).
4. Envie para a branch (`git push origin feature-branch`).
5. Abra um Pull Request.

## Licença

Este projeto é licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para detalhes.

## Agradecimentos

- Obrigado a todos que contribuíram para o projeto!
- Agradecimentos especiais aos colaboradores que tornaram este projeto possível.

---

* Este README foi gerado em 2026-02-26 16:52:12 UTC *