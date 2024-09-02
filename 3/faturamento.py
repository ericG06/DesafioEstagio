import json

with open("3\dados.json", encoding='utf-8') as dados:
    dados = json.load(dados)

dados_diarios = dados.get('faturamento')

faturamento_diario = [item['valor'] for item in dados['faturamento'] if item['valor']]

menor_faturamento = min(faturamento_diario)
maior_faturamento = max(faturamento_diario)
    
media_mensal = sum(faturamento_diario) / len(faturamento_diario)
    
dias_acima_da_media = sum(1 for item in dados['faturamento'] if item['valor'] is not None and item['valor'] > media_mensal)

print(f"Menor valor de faturamento: R${menor_faturamento:.2f}")
print(f"Maior valor de faturamento: R${maior_faturamento:.2f}")
print(f"Número de dias com faturamento superior à média mensal: dia {dias_acima_da_media}")