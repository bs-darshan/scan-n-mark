'''
amt=int(input("enter amount"))
hundreed=0
fifty=0
twenty=0
ten=0
if amt>500:
    fivehundreed=int(amt/500)
amt=amt-(fivehundreed*500)
print("500= ",fivehundreed)
if amt>200:
    twohundreed=int(amt/200)
amt=amt-twohundreed*200
print("200= ",twohundreed)
if amt>100:
    hundreed=int(amt/100)
amt=amt-hundreed*100
print("100= ",hundreed)
if amt>=50:
    fifty=int(amt/50)
amt=amt-fifty*50
print("50= ",fifty)
if amt>20:
    twenty=int(amt/20)
amt=amt-twenty*20
print("20= ",twenty)
if amt>10:
    ten=int(amt/10)
print("10= ",ten)
'''



'''
n=int(input('Enter n : '))
b=''
while n!=0:
    b=str(n%2)+b
    n=n//2
print(b)
'''
"""
a=[1,2,3,4]
max=8
results=[]
pres=0
for i in a:
    for j in a:
        if i + j <=max:

            pres+=1




print(results,pres)
"""
'''
a = 0
b = 1
x=0
print("1")
for i in range(2,5):

    a = b
    b = a + b
    a, b = b, a + b
    print(b)
    for j in range(2, b):
        if (b % j) == 0:
            print( "prime")
            

def fact(n):
    if n==1:
        return 1
    if n==2:
        return 2
    x+=n
    return fact(n-1)
'''




'''
def lcm(a, b):
    gcd = math.gcd(a, b)
    lcm = (a * b) // gcd
    return lcm
print(lcm(5,5))
'''

import math as m
lcm= lambda a,b:(a*b) // m.gcd(a,b)

print(lcm(5,5))































