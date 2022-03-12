DROP TABLE book;
DROP TABLE PCA;
DROP TABLE person;
DROP TABLE library;
DROP TABLE bookList;
DROP TABLE questions;
DROP TABLE chatBot;
DROP TABLE posFeedback;

CREATE TABLE person (
                        personID    INT IDENTITY,
                        personName VARCHAR(40),
                        personAge  VARCHAR(40),
                        occupation VARCHAR(40),
                        favBook     VARCHAR(40),
                        favGenre    VARCHAR(40),
                        pcaVector   INT,
                        PRIMARY KEY (personID)
);

CREATE TABLE PCA (
                       genresID        INT IDENTITY,
                       genreName       VARCHAR(40),
                       utilityID        VARCHAR(40),
                       userID           INT IDENTITY,
                       distanceID       INT,
                       indexInt         INT,
                       valueInt         INT,
                       PRIMARY KEY (genresID),
                       FOREIGN KEY (userID) REFERENCES person(personID)
);

CREATE TABLE book (
                      bookId           INT IDENTITY,
                      bookTitle         VARCHAR(40),
                      bookGenre          VARCHAR(40),
                      bookAuthor         VARCHAR(40),
                      bookPage            INT,
                      libraryIndex            INT,
                      PRIMARY KEY (bookId),
                      FOREIGN KEY (bookGenre) REFERENCES PCA(genreName),
                      FOREIGN KEY (libraryIndex) REFERENCES library(libraryID)
);


CREATE TABLE library (
                    libraryID   INT IDENTITY,
                    genreType   VARCHAR(40),
                    PRIMARY KEY (libraryID)
);

CREATE TABLE bookList(
                    bookListID  INT IDENTITY,
                    numberBooks    INT,
                    PRIMARY KEY (bookListID)
);

CREATE TABLE questions (
                questionID  INT IDENTITY,
                positivePoint   INT,
                content       VARCHAR(40),
                PRIMARY KEY (questionID),
);

CREATE TABLE statements (
            statementID     INT IDENTITY,
            statement       VARCHAR(40),
            PRIMARY KEY (statementID)
);

CREATE TABLE chatBot (
            chatBotID       INT IDENTITY ,
            personID        INT,
            statementID      INT,
            questionID      INT,
            PRIMARY KEY (chatBotID),
            FOREIGN KEY (personID) REFERENCES person(personID),
            FOREIGN KEY (questionID) REFERENCES questions(questionID),
            FOREIGN KEY (statementID) REFERENCES statements(statementID)
);

CREATE TABLE  posFeedback (
        posFeedbackID   INT IDENTITY ,
        feedback        VARCHAR(40),
        personID        INT,
        statementID     INT,
        PRIMARY KEY (posFeedbackID),
        FOREIGN KEY (personID) REFERENCES person(personID),
        FOREIGN KEY (statementID) REFERENCES statements(statementID)
);

INSERT INTO statements(statement) VALUES('Hello, my name is chat bot your personal library assistant')
INSERT INTO statements(statement) VALUES('eg. Random recommendation, or by favourite book, or favourite genre. Or search for a book by title, page, author. Or set of books by author, genre, page.')
INSERT INTO statements(statement) VALUES('By: ')
INSERT INTO statements(statement) VALUES('I would recommend the following book(s): ')
INSERT INTO statements(statement) VALUES('I found %d books by that title: ')
INSERT INTO statements(statement) VALUES('I found %d books by that author: ')
INSERT INTO statements(statement) VALUES('I found %d books in that genre: ')
INSERT INTO statements(statement) VALUES('I found %d books of that length: ')
INSERT INTO statements(statement) VALUES('Error, no by that title...')
INSERT INTO statements(statement) VALUES('Error, no books by that author...')
INSERT INTO statements(statement) VALUES('Error, no books of that length...')
INSERT INTO statements(statement) VALUES('May I suggest %s')
INSERT INTO statements(statement) VALUES('Are you a first time user?')
INSERT INTO statements(statement) VALUES('Welcome back %s how may I help you today?')


INSERT INTO questions (positivePoint, content)  VALUES(0, 'What is your name?');
INSERT INTO questions (positivePoint, content)  VALUES(0, 'How old are you %s?');
INSERT INTO questions (positivePoint, content)  VALUES(0, 'What is your occupation %s?');
INSERT INTO questions (positivePoint, content)  VALUES(0, 'What is your favourite book %s?');
INSERT INTO questions (positivePoint, content)  VALUES(0, 'What is your favourite genre %s?');
INSERT INTO questions (positivePoint, content)  VALUES(0, 'What service can I provide? ');
INSERT INTO questions (positivePoint, content)  VALUES(0, 'What should I base my recommendation on?');
INSERT INTO questions (positivePoint, content)  VALUES(0, 'Would you require additional service?');

INSERT INTO posFeedback(feedback, statementID)  VALUES('yes',1);
INSERT INTO posFeedback(feedback, statementID)  VALUES('yeah',2);
INSERT INTO posFeedback(feedback, statementID)  VALUES('yep',3);
INSERT INTO posFeedback(feedback, statementID)  VALUES('yeet',4);
INSERT INTO posFeedback(feedback, statementID)  VALUES('sure',5);
INSERT INTO posFeedback(feedback, statementID)  VALUES('yah',6);

INSERT INTO PCA(utilityID, distanceID, indexInt, valueInt) VALUES ('{10,1,10,0,5,2,2}', 4,0, 1000);
INSERT INTO PCA(utilityID, distanceID, indexInt, valueInt) VALUES ('{0,10,1,10,5,2,2}', 4,0, 1000);
INSERT INTO PCA(utilityID, distanceID, indexInt, valueInt) VALUES ('{0,1,1,0,10,10,2}', 4,0, 1000);
INSERT INTO PCA(utilityID, distanceID, indexInt, valueInt) VALUES ('{8,1,1,1,5,4,8}', 4,0, 1000);
INSERT INTO PCA(genreName) VALUES ('Sci-Fi');
INSERT INTO PCA(genreName) VALUES ('Fantasy');
INSERT INTO PCA(genreName) VALUES ('Sci-Fi');
INSERT INTO PCA(genreName) VALUES ('Classic');
INSERT INTO PCA(genreName) VALUES ('Romance');
INSERT INTO PCA(genreName) VALUES ('Action');
INSERT INTO PCA(genreName) VALUES ('Comedy');
INSERT INTO PCA(genreName) VALUES ('Education');
INSERT INTO PCA(genreName) VALUES ('Horror');
INSERT INTO PCA(genreName) VALUES ('Light Novel');
INSERT INTO PCA(genreName) VALUES ('Manga');
INSERT INTO PCA(genreName) VALUES ('Comedy');

INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Dune','Sci-Fi',300,'F. Hebert', 1);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Dune','Sci-Fi', 300,'F. Hebert',1);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Foundation','Sci-Fi', 300,'I. Asimov',1);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Lord of the Rings','Fantasy', 300,'J.R. Tolkien',2);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Game of Thrones','Fantasy', 300,'G.R.R. Martin',2);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Odyssey','Classic', 300,'Homer',3);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('The Great Gatsby','Classic', 300,'F. Scott Fitzgerald',3);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('The Love Hypothesis','Romance', 384,'Ali Hazelwood',4);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('The Fault in Our Stars','Romance', 313,'John Green',4);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Lord of the Rings','Fantasy', 300,'J.R. Tolkien',2);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Sierra Six','Action', 308,'Mark Greaney',5);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('House of Earth and Blood','Action', 816,'Sarah J. Maas',5);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES ('Born a Crime','Comedy', 304,'Trevor Noah',6);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Yearbook', 'Comedy', 272, 'Seth Rogen',6);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('The Minimalist Teacher', 'Education', 144, 'C. Y. Arnold & Tamera Musiowsky-Borneman',7);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Ensouling Our Schools: A Universally Designed Framework for Mental Health, Well-Being, and Reconciliation', 'Education', 300, 'Jennifer Katz & Kevin Lamoureux',7);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('House of Leaves', 'Horror', 709, 'Mark Z. Danielewski',8);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Dracula', 'Horror', 418, 'Bram Stoker',8);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Overlord, Vol 1 - The Undead King', 'Light novel', 256, 'Kugane Maruyama',9);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Overlord, Vol 2 - The Dark Warrior', 'Light novel', 256, 'Kugane Maruyama',9);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Overlord, Vol 3 - The Bloody Valkyrie', 'Light novel', 288, 'Kugane Maruyama',9);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Overlord, Vol 4 - The Lizardman Heroes', 'Light novel', 304, 'Kugane Maruyama',9);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Overlord, Vol 5 - The Men Of The Kingdome Part 1', 'Light novel', 272, 'Kugane Maruyama',9);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Overlord, Vol 6 - The Men Of The Kingdome Part 2', 'Light novel', 292, 'Kugane Maruyama',9);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Overlord, Vol 7 - The Invaders Of The Great Tomb', 'Light novel', 350, 'Kugane Maruyama',9);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Overlord, Vol 8 - The Two Leaders', 'Light novel', 288, 'Kugane Maruyama',9);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('The return of Johnny Ridden MSV-R, Vol 1', 'Manga', 350, 'Kugane Maruyama',10);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Gundam Thunderbolt, Vol 1', 'Manga', 350, 'Hajime Yadate',10);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Gundam Thunderbolt, Vol 2', 'Manga', 350, 'Hajime Yadate',10);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('Gundam Thunderbolt, Vol 3', 'Manga', 350, 'Hajime Yadate',10);
INSERT INTO book(bookTitle, bookGenre, bookPage, bookAuthor, libraryIndex) VALUES('monty python', 'Comedy', 408, 'person',6);

INSERT INTO library(genreType) VALUES ('Sci-Fi');
INSERT INTO library(genreType) VALUES ('Fantasy');
INSERT INTO library(genreType) VALUES ('Classic');
INSERT INTO library(genreType) VALUES ('Romance');
INSERT INTO library(genreType) VALUES ('Action');
INSERT INTO library(genreType) VALUES ('Comedy');
INSERT INTO library(genreType) VALUES ('Education');
INSERT INTO library(genreType) VALUES ('Horror');
INSERT INTO library(genreType) VALUES ('Light novel');
INSERT INTO library(genreType) VALUES ('Manga');