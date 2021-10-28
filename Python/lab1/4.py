# Implement a program that generates a Quiz and uses two files-
# Questions.txt and Answers.txt. The program opens Questions.txt and
# reads a question and displays the question with options on the screen.
# The program then opens the Answers.txt file and displays the correct
# answers.


quesfile = open("ques.txt", "r")
ansfile = open("answer.txt", "r")
score = 0

questions = quesfile.readlines()
answers = ansfile.readlines()

for i in range(len(answers)):
    print(questions[i])
    useranswer = input("Enter the choice ")
    if(useranswer == answers[i][0]):
        print("Correct Answer\n")
        score += 1
    else:
        print("Wrong Answer\n")

print("Your score is", score)
