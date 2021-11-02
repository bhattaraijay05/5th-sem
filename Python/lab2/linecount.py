# 3.Write a Python program to count the number of lines in a text file


def count_lines(file_name):
    with open(file_name, 'r') as f:
        count = 0
        for _ in f:
            count += 1
        return count


print(count_lines('fileread.py'))
