# write a program to count the number of upper-case and lower-case alphabets present in a text file “data.txt”.


data = open('data.txt', 'r')
low = 0
high = 0
sentence = data.read()
a = sentence.split()
for i in range(len(a)):
    for element in range(len(a[i])):
        if(a[i][element].isupper()):
            high += 1
        if(a[i][element].islower()):
            low += 1

print("Uppercase = ", high)
print("Lowercase = ", low)
