import sys
from transformers import pipeline


if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Please provide two arguments (a pipeline name and a prompt).")
    else:
        try:
            classifier = pipeline(sys.argv[1])
            result = classifier(sys.argv[2])
            print(result)
        except ValueError:
            print("something went wrong" + ValueError, file=sys.stderr)
