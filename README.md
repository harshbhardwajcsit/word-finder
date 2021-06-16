#Problem Statement:
1. If the word exists in the dictionary, return the meaning of the word in the quickest fashion possible. Key aspects here will be how you decide on storage, how your algorithm works to optimize the retrieval etc.
2. If the word doesn't exist in the dictionary, you can assume the word was spelt incorrectly by the user. In this case, the program should return a list of 3 probable suggestions that are close to the user's input 
   and likely what the user intended to type (very similar to an auto-suggest module on your phone). For instance, if the user entered "Strepe", the suggestions might include "Stripe", "Street" or "Treat" 
   (the suggestions would basically be based on some relevance score that was determined for the match).
   

#Proposed solution:
1. A Solution has developed by imagining a scenario of 90's where a user can enter a word and computer suggest word/words along with their summary as 
   a search results.
2. A Word finder algorithm that runs over a dictionary that is stored in form of key, value pair (HashMap) for retrieval.
3. Manager Layer has been introduced for handling words in the dictionary, operation like addWordsToDictionary, updateWordsInDictionary etc..

#Scope of Improvement (Performance wise)
1. As currently the performance of operation when exact word does not found is O(n), could be improved by thinking about the algorithm that stores scores
   along map whenever it is created,
    eg. 
    ** score based on adding character position in Alphabet series.
    ** score based on adding ASCII values of character in word.
    
#In that case HashMap would be a key (Score), value (List of Word having that score).

Performance would be O(1) with this approach

Apart from the current algo, few more algorithms can be used to improve accuracy of match.
   eg.
   ** Edit distance algo
   ** Tries
  

#Scope of Improvement (Scalability wise)
1. As current implementation only deals with single request - response architecture, could be improved by adding concurrency layer.


    




