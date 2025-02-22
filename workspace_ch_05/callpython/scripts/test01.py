import sys

def square_number(num):
    return num ** 2

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Please provide one argument.")
    else:
        try:
            num = float(sys.argv[1])
            print(f"The square of {num} is {square_number(num)}")
        except ValueError:
            print("Please provide a valid number.", file=sys.stderr)
