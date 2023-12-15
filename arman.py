import os


class Test:
    def __init__(self):
        self.__num = 100

        print(
            "this is a veryyyyyyyyyyyyy longggggggggggggg \
              lineeeeeeeeeeeeeeeeeee"
        )

    def setNum(self, newNum):
        self.__num = newNum

    def getNum(self):
        return self.__num


if __name__ == "__main__":
    t = Test()
    print(t.getNum())
    t.setNum(50)
    print(t.getNum())
    # print(t.__num)  # AttributeError: 'Test' object has no attribute '__num'
    print(t._Test__num)  # 50
