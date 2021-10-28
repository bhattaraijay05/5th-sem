
# Suppose we have created a file with 500 lines of data and the
# file object reference is “f”. Illustrate fseek() function for the
# following.

# 1. Beginning of the file
# 2. Move to 100 th location from the beginning of the file
# 3. Move to 10 th location from end of the file
# 4. Move file pointer to the end of the file
# Returns current position in the file

f = open("myfile.txt", 'rb')

f.seek(0)
f.read()

f.seek(100, 0)
f.read()

f.seek(-10, 2)
f.read()

f.seek(0, 2)
f.read()

f.tell()
