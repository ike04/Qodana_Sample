import json

# result.jsonファイルを読み込む
with open('results/report/results/result-allProblems.json') as f:
    data = json.load(f)

# Criticalの数を数える
count = 0
for problem in data['listProblem']:
    if 'Critical' in problem.get('severity', ''):
        count += 1

# 結果をログに出力する
print(f'Number of critical errors: {count}')
