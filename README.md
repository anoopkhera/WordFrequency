# Word Frequency 

This is repository contains the java file that can be ran in order to display word frequencies in a given sentence.


Time spent: **3** hours spent in total

## How to Execute the file

- Download the repository.
- In a terminal, move to the directory where this project is located.
- Change directory to the java directory (WordFrequency/src/main/java) where the package (com/example) is located.
- From here, we can run the command: javac Main.java 
- This will create a class file (Main.class) that we can execute in our terminal.
- To run the Main.class file, use hte following command: java org.example.Main
- Provide text after the command if you would like to see the frequencies of each word in that text.

For example: java org.example.Main the cat is in the bag

The above command will display the following in the console:

      2 the
      1 cat
      1 is
      1 in
      1 bag

Feel free to customize the text however you like. 

## Overview of Solution
1. A hashmap was created to map each word to it's frequency.
2. Loop over each word in the text and record it's count.
3. Pair class was created so we could store each word and it's frequency as a pair object which would be added to a list.
4. List to hold each pair was created to hold all <word, frequency> pairs.
5. Go through the hashmap and add each word (key) + frequency (value) as a pair to the list.
6. Since the problem wants us to output the word frequencies in descending order, the list of pairs was sorted based on the frequencies of each word.
7. A final loop was created to display each word along with it's frequency. 
