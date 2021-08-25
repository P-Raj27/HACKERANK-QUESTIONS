x,y=input().split()
x=int(x)
y=int(x)
magazine=input()
note=input()
note_list=list(note.split())
magazine_list=list(magazine.split())
mag={}
#Converting magazine_list to the Dictionary for account of words present in the list.
for i in magazine_list:
    if(i in mag):
        mag[i]=mag[i]+1
    else:
        mag[i]=1
#Checking Words in the magazine_list and also updating the quantity of words once used. 
for i in note_list:
    if(i in mag and mag[i]>0):
        decision=True
        mag[i]=mag[i]-1
    else:
        decision=False
        break
if(decision==True):
    print("Yes")
else:
    print("No")
    
        
    
