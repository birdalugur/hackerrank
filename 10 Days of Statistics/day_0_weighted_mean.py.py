n = int(input())

x_seq = input()
seq = list(map(lambda x: int(x),x_seq.split(' ')))

w_seq=input()
w_seq= list(map(lambda x: int(x),w_seq.split(' ')))

total=0
for i in range(n):
  total+=seq[i]*w_seq[i]

result = total/sum(w_seq)

result = round(result,1)

print(result)