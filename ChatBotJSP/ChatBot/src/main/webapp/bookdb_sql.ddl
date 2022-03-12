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
                       generasID        INT IDENTITY,
                       utilityID        INT,
                       userID           INT,
                       distanceID       INT,
                       indexInt         INT,
                       valueInt         INT,
                       PRIMARY KEY (generasID),
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
                      FOREIGN KEY (bookGenre) REFERENCES genre(genreName),
                      FOREIGN KEY (libraryIndex) REFERENCES library(libraryID)
);

CREATE TABLE library (
                    libraryID   INT IDENTITY,
                    bookListID  INT,
                    PRIMARY KEY (libraryID),
                    FOREIGN KEY (bookListID) references bookList(bookListID)
);

CREATE TABLE bookList(
                    bookListID  INT IDENTITY,
                    numberBooks    INT,
                    PRIMARY KEY (bookListID)
);

CREATE TABLE questions (
                questionID  INT IDENTITY,
                positivePoint   INT,
                contentID       VARCHAR(40),
                PRIMARY KEY (questionID),
);

CREATE TABLE chatBot (
            chatBotID       INT IDENTITY ,
            personID        INT,
            statementID      INT,
            questionID      INT,
            PRIMARY KEY (chatBotID),
            FOREIGN KEY (personID) REFERENCES person(personID)
);

CREATE TABLE  posFeedback (
        posFeedbackID   INT IDENTITY ,
        feedback        VARCHAR(40),
        personID        INT,
        statementID     INT,
        questionID      INT,
        PRIMARY KEY (posFeedbackID),
        FOREIGN KEY (personID) REFERENCES person(personID)
);

-- INSERT INTO PCA(genreName) VALUES ('Sci-Fi');
-- INSERT INTO PCA(genreName) VALUES ('Fantasy');
-- INSERT INTO PCA(genreName) VALUES ('Sci-Fi');
-- INSERT INTO genre(genreName) VALUES ('Classic');
-- INSERT INTO genre(genreName) VALUES ('Romance');
-- INSERT INTO genre(genreName) VALUES ('Action');
-- INSERT INTO genre(genreName) VALUES ('Comedy');
-- INSERT INTO genre(genreName) VALUES ('Education');
-- INSERT INTO genre(genreName) VALUES ('Horror');
-- INSERT INTO genre(genreName) VALUES ('Light Novel');
-- INSERT INTO genre(genreName) VALUES ('Manga');
-- INSERT INTO genre(genreName) VALUES ('Comedy');
--
--
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('Dune','Sci-Fi', 300,'F. Hebert');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('Foundation','Sci-Fi', 300,'I. Asimov');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('Lord of the Rings','Fantasy', 300,'J.R. Tolkien');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('Game of Thrones','Fantasy', 300,'G.R.R. Martin');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('Odyssey','Classic', 300,'Homer');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('The Great Gatsby','Classic', 300,'F. Scott Fitzgerald');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('The Love Hypothesis','Romance', 384,'Ali Hazelwood');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('The Fault in Our Stars','Romance', 313,'John Green');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('Lord of the Rings','Fantasy', 300,'J.R. Tolkien');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('Sierra Six','Action', 308,'Mark Greaney');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('House of Earth and Blood','Action', 816,'Sarah J. Maas');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES ('Born a Crime','Comedy', 304,'Trevor Noah');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Yearbook', 'Comedy', 272, 'Seth Rogen');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('The Minimalist Teacher', 'Education', 144, 'C. Y. Arnold & Tamera Musiowsky-Borneman');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Ensouling Our Schools: A Universally Designed Framework for Mental Health, Well-Being, and Reconciliation', 'Education', 300, 'Jennifer Katz & Kevin Lamoureux');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('House of Leaves', 'Horror', 709, 'Mark Z. Danielewski');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Dracula', 'Horror', 418, 'Bram Stoker');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Overlord, Vol 1 - The Undead King', 'Light novel', 256, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Overlord, Vol 2 - The Dark Warrior', 'Light novel', 256, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Overlord, Vol 3 - The Bloody Valkyrie', 'Light novel', 288, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Overlord, Vol 4 - The Lizardman Heroes', 'Light novel', 304, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Overlord, Vol 5 - The Men Of The Kingdome Part 1', 'Light novel', 272, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Overlord, Vol 6 - The Men Of The Kingdome Part 2', 'Light novel', 292, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Overlord, Vol 7 - The Invaders Of The Great Tomb', 'Light novel', 350, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Overlord, Vol 8 - The Two Leaders', 'Light novel', 288, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('The return of Johnny Ridden MSV-R, Vol 1', 'Manga', 350, 'Kugane Maruyama');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Gundam Thunderbolt, Vol 1', 'Manga', 350, 'Hajime Yadate');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Gundam Thunderbolt, Vol 2', 'Manga', 350, 'Hajime Yadate');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('Gundam Thunderbolt, Vol 3', 'Manga', 350, 'Hajime Yadate');
-- INSERT book(bookTitle, bookGenre, bookPage, bookAuthor) VALUES('monty python', 'Comedy', 408, 'person');

