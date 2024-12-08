
def palindrome(description):
    description_alpha=''
    for i in range(len(description)):
        if description[i].lower().isalpha():
            description_alpha+=description[i].lower()
    print(description_alpha)
    return description_alpha==description_alpha[::-1]
