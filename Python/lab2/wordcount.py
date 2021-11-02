# Write a Python program that takes a text file as input and returns the number of words of a given text file.


def word_count(file_name):
    with open(file_name, 'r') as f:
        words = f.read().split()
        return len(words)


def main():
    file_name = input('Enter the file name: ')
    print(word_count(file_name))


main()
