# 2.Write a Python program to generate 26 text files named A.txt, B.txt, and so on up to Z.txt


import os

path = "files"

if not os.path.exists(path):
    os.makedirs(path)


def main():
    for i in range(1, 27):
        with open(os.path.join(path, f'{chr(i + 64)}.txt'), 'w') as f:
            f.write(f'{chr(i + 64)}')


if __name__ == '__main__':
    main()
    os.system('pause')
    exit(0)
