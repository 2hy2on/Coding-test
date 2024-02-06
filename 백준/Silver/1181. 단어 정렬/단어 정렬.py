N = int(input())
words =  []
for i in range(N):
    words.append(input())

newWords = list(set(words))
sortedWords = sorted(newWords, key=lambda x: (len(x), x))


for w in sortedWords:
    print(w)