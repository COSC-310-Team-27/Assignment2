# Assignment2
Part 1 of chat bot:

[Table of Contents]

# Description
# Getting Started
# Dependencies
# Installing
# Help
# Authors
# Version History
# Acknowledgments

## Description

Chat bot for online library book suggestion, 
console based: 
https://github.com/COSC-310-Team-27/Assignment2/tree/main/Console/src

mobile (WIP): 
https://github.com/COSC-310-Team-27/Assignment2/tree/main/ChatBotMobile

browser(WIP): 
https://github.com/COSC-310-Team-27/Assignment2/tree/main/ChatBotHTML

Bot intelligently responds to natural language input and suggests generas based on 
Principle Component Analysis: 
https://github.com/COSC-310-Team-27/Assignment2/blob/main/Python_PCA/PCA_encode_decode.ipynb
and Euclidian proximity to nearest standard user vector: 
https://github.com/COSC-310-Team-27/Assignment2/blob/main/Console/src/com/company/PCA.java 
and a number of other features found in the console folder. For those who are more adventurous could partake in a quiz that will be more competitive in part 2.

## Getting Started

### Dependencies

java dependencies (libraries installed using maven):
import org.apache.commons.math3.linear.*;
import org.apache.commons.math3.stat.correlation.Covariance;

python dependencies (pip install via console):
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from autograd import grad 

### Class structure
main.java
Handles user input and bot outputs

patterns.java
Hasn't been integrated, is supposed to handle user input and bot outputs among other functions. Was supposed to do spell-checking and auto-correct to some extent. 

person.java 
Is a projection of a user's preferences and data. Holds user's name, favourite book and genre, age, and occupation. 

quizQuestion.java
Pulls questions from question class and returns it to caller. As well as gets answer from caller

question.java
Contains a question's contents and their affiliated genre. 

library.java
Contains all methods involving books, such as get random title, get random book by specific genre, get random book by specific author, get specific title, get all books in a specific genre and etc. 

chatBot.java
Contains statements and questions that are commonly used. Handles talking between user and bot for all methods apart from some methods in library.  

PCA.java
joel take the wheel

quiz.java 

parse.java

book.java
Contains the title, author, number of pages, genre of a book. 

### Installing

run java.Main()

exe or appliication TBA
### Executing program


             
Bot will prompt user with generic questions to setup a user profile. After which user can choose from a number of features to checkout books. 
Through the main class, users can invoke features such as: 

(In quotations are the inputs the user needs to use to invoke the method)
* Recommend by random title - "random title" 
* Recommend by selecting a random book in a specific genre - "random book in genre"
* Search by title - "title" 
* Recommend random book by specific author - "author"
* Recommend random book that has same length as inputted number - "pages" 
* Recommend by PCA as aforementioned - "pca" 
* Take a quiz - "quiz"


## Help

List of limitations (Work in progress)
-Spell checking
-Cannot handle unexpected input types
-Error handling


## Authors

Contributors names and student numbers

Joel Johnson (37794112)
Mahir Rahman (71811509)
Matthew Halim (12588786)
Nikita Korobkin (13290333)
Richardo Brown (10142529)


## Version History

* 0.2
    * Various bug fixes and optimizations
    * See [commit change]() or See [release history]()
* 0.1
    * Initial Release

## Acknowledgments

Inspiration, code snippets, etc.
* [awesome-readme](https://github.com/matiassingers/awesome-readme)
* [PurpleBooth](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2)
* [dbader](https://github.com/dbader/readme-template)
* [zenorocha](https://gist.github.com/zenorocha/4526327)
* [fvcproductions](https://gist.github.com/fvcproductions/1bfc2d4aecb01a834b46)
* [DomPizzie](https://gist.github.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc)
