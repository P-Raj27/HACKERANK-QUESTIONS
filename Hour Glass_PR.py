lst=[]
R=int(input())
for i in range(R):
    row=[int(x) for x in input().split()]
    lst.append(row)
C=len(row)
max_sum=0
if(R<3 and C<3):
    print(-1)
for i in range(R-2):
    for j in range(C-2):
        summ=lst[i][j]+lst[i][j+1]+lst[i][j+2]+lst[i+1][j+1]+lst[i+2][j]+lst[i+2][j+1]+lst[i+2][j+2]           #Directly Adding With the proper index
    
        max_sum=max(max_sum,summ)
print(max_sum)



