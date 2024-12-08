def palindrome(description):
    description_alpha = ''
    # This loop removes non alphabets from the string and lower the chars
    for i in range(len(description)):
        if description[i].lower().isalpha():
            description_alpha += description[i].lower()

    # we comapares the string by reversing it using [::-1]
    return description_alpha == description_alpha[::-1]


## TESTING INPUTS
input_true = "Madam, in Eden, I'm Adam"
print(palindrome(input_true))
input_false = "Complete the project report"
print(palindrome(input_false))