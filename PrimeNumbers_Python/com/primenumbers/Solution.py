'''
Created on Jul 20, 2018

@author: wshaklee
'''
# change the values of lower and upper for a different result
lower = 2
upper = 101

# uncomment the following lines to take input from the user
#lower = int(input("Enter lower range: "))
#upper = int(input("Enter upper range: "))

print("Prime numbers between",lower,"and",upper,"are:")

for num in range(lower,upper + 1):
    # prime numbers are greater than 1
    if num > 1:
        for i in range(2,num/2):
            if (num % i) == 0:
                break
        else:
            print(num)