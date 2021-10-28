# Consider a file with 100 lines of data and the file object reference
# is “f”. Illustrate what each of these following operations does:
# 1. f.seek(0,)
# 2. f.seek(50,1)
# 3. f.seek(-5,2)
# 4. f.seek(0,2)
# 5. f.tell()

f = open("myfile.txt", "rb")

f.seek(0,)
f.read()

f.seek(50, 1)

f.seek(-5, 2)
f.tell()
f.read()

f.seek(0, 2)
f.read()

f.tell()
f.read()
