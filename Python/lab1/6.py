# Demonstrate Serialization in python by creating a custom class
# called Player. Player will store an id, name. Save it and load it up into
# a separate object and display the new object.


import pickle


class Player:
    def __init__(self, id, name):
        self.id = id
        self.name = name

    def __str__(self):
        return "Player: {}, {}".format(self.id, self.name)


def main():
    player = Player(1, "John")
    print(player)
    with open("player.dat", "wb") as file:
        pickle.dump(player, file)
    with open("player.dat", "rb") as file:
        player = pickle.load(file)
    print(player)


main()
