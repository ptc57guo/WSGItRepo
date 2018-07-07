'''
Created on Jul 6, 2018

@author: wshaklee
'''
import string
    
def doIHaveTheWord(arr, word):
    wordFound = True;
    characterCountMap = {}
    for char in arr:
        if characterCountMap.has_key(char):
            characterCountMap[char] += 1
        else:
            characterCountMap[char] = 1
    for wordChar in list(word):
        if wordChar not in characterCountMap or characterCountMap[wordChar] == 0:
            wordFound = False
            break
        else: 
            if not characterCountMap.has_key(wordChar): 
                wordFound = False
                break
            else: 
                characterCountMap[wordChar] -= 1

    return wordFound;
    
word = "disassemble";
firstArray = list(string.ascii_lowercase)
secondArray = list("abcdsfijelsemqrstusescvbn")
print(firstArray)
print(secondArray)        
print(doIHaveTheWord(firstArray, word))
print(doIHaveTheWord(secondArray, word))
        
