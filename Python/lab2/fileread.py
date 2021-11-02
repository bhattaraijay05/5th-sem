# 4.Write a Python program to read an entire text file.


def read_file(filename):
    with open(filename, 'r') as f:
        print(f.read())


read_file('test.txt')
