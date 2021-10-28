# Demonstrate Object Serialization in python by creating a custom
# class called Employee. Employee will store Employee name, age,
# salary, married and having kid. Save it and load it up into a separate
# object and display the new object.

import pickle


class Employee:
    def __init__(self, name, age, salary, married, kid):
        self.name = name
        self.age = age
        self.salary = salary
        self.married = married
        self.kid = kid

    def __str__(self):
        return "Name: {}, Age: {}, Salary: {}, Married: {}, Kid: {}".format(
            self.name, self.age, self.salary, self.married, self.kid)


def main():
    emp = Employee("Raj", 30, 50000, True, True)
    print(emp)
    with open("emp.txt", "wb") as f:
        pickle.dump(emp, f)
    with open("emp.txt", "rb") as f:
        emp = pickle.load(f)
    print(emp)


main()
