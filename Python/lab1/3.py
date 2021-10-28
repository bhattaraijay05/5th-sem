
# Implement a program to copy one python script into another by
# removing all the comment lines from the source file to destination
# file.

fi = open("test.py", "r")

alllines = fi.readlines()


copied = []
for i in range(len(alllines)):
    if not (alllines[i][0] == "#"):
        copied.append(alllines[i])


cop = open("copied.py", "w")
for i in range(len(copied)):
    cop.write(copied[i])
