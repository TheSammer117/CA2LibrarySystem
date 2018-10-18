-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 17, 2018 at 06:07 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wp`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `addressID` int(10) NOT NULL,
  `userID` int(10) NOT NULL,
  `address1` varchar(50) DEFAULT NULL,
  `address2` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `phone` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`addressID`, `userID`, `address1`, `address2`, `email`, `phone`) VALUES
(1, 4, '123. eastwood', 'Carlingford', '', 0),
(2, 5, 'Oriem Road', 'Downing Street', '', 0),
(3, 6, 'Tamming Road', 'Roadside', '', 0),
(4, 7, 'Test road', 'Test estate', '', 0),
(5, 8, '123', '123', '', 0),
(6, 9, '112', 'college', '', 0),
(7, 10, '112', 'college', '', 0),
(8, 12, '11', 'dundalk', '', 0),
(9, 13, '45', 'dundalk', '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `borrowed`
--

CREATE TABLE `borrowed` (
  `borrowedID` int(10) NOT NULL,
  `userID` int(10) NOT NULL,
  `titleID` int(10) NOT NULL,
  `daysBorrowed` int(5) NOT NULL,
  `status` int(1) NOT NULL,
  `dayStarted` date NOT NULL,
  `dayEnded` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `borrowed`
--

INSERT INTO `borrowed` (`borrowedID`, `userID`, `titleID`, `daysBorrowed`, `status`, `dayStarted`, `dayEnded`) VALUES
(1, 4, 1, 10, 0, '2018-10-01', '2018-10-10'),
(2, 5, 4, 8, 0, '2018-10-01', '2018-10-08'),
(3, 7, 7, 7, 0, '2018-10-07', '2018-10-13'),
(4, 6, 8, 14, 0, '2017-09-10', '2017-09-18'),
(5, 7, 7, 0, 0, '0000-00-00', '0000-00-00'),
(8, 9, 6, 3, 1, '2018-10-16', '2018-10-17'),
(11, 12, 2, 20, 1, '2017-11-01', '2017-11-20');

-- --------------------------------------------------------

--
-- Table structure for table `genre`
--

CREATE TABLE `genre` (
  `genreID` int(5) NOT NULL,
  `genre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `genre`
--

INSERT INTO `genre` (`genreID`, `genre`) VALUES
(1, 'Science fiction'),
(2, 'Satire'),
(3, 'Drama'),
(4, 'Action'),
(5, 'Adventure'),
(6, 'Romance'),
(7, 'Mystery'),
(8, 'Horror'),
(9, 'Self help'),
(10, 'Health'),
(11, 'Guide'),
(12, 'Travel'),
(13, 'Children\'s'),
(14, 'Religion'),
(15, 'Science'),
(16, 'History'),
(17, 'Math'),
(18, 'Anthology'),
(19, 'Poetry'),
(20, 'Encyclopedias'),
(21, 'Dictionaries'),
(22, 'Comics'),
(23, 'Art'),
(24, 'Cookbooks'),
(25, 'Diaries'),
(26, 'Journals'),
(27, 'Prayer books'),
(28, 'Series'),
(29, 'Trilogy'),
(30, 'Biographies'),
(31, 'Autobiographies'),
(32, 'Fantasy');

-- --------------------------------------------------------

--
-- Table structure for table `titlegenre`
--

CREATE TABLE `titlegenre` (
  `genreID` int(10) NOT NULL,
  `titleID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `titlegenre`
--

INSERT INTO `titlegenre` (`genreID`, `titleID`) VALUES
(1, 1),
(3, 6),
(4, 8),
(5, 2),
(7, 3),
(8, 4),
(14, 7);

-- --------------------------------------------------------

--
-- Table structure for table `titles`
--

CREATE TABLE `titles` (
  `titleID` int(10) NOT NULL,
  `novelName` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `stock` int(5) NOT NULL,
  `onLoan` int(5) NOT NULL,
  `titleDescription` varchar(5000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `titles`
--

INSERT INTO `titles` (`titleID`, `novelName`, `author`, `stock`, `onLoan`, `titleDescription`) VALUES
(1, 'All the King\'s Men', 'Robert Penn Warren ', 20, 7, 'More than just a classic political novel, Warren’s tale of power and corruption in the Depression-era South is a sustained meditation on the unforeseen consequences of every human act, the vexing connectedness of all people and the possibility—it’s not much of one—of goodness in a sinful world. Willie Stark, Warren’s lightly disguised version of Huey Long, the onetime Louisiana strongman/governor, begins as a genuine tribune of the people and ends as a murderous populist demagogue. Jack Burden is his press agent, who carries out the boss’s orders, first without objection, then in the face of his own increasingly troubled conscience. And the politics? For Warren, that’s simply the arena most likely to prove that man is a fallen creature. Which it does.'),
(2, 'The Adventures of Augie March', 'Saul Bellow', 5, 0, 'Augie comes on stage with one of literature’s most famous opening lines. “I am an American, Chicago born, and go at things as I have taught myself, free-style, and will make the record in my own way: first to knock, first admitted.” It’s the “Call me Ishmael” of mid-20th-century American fiction. (For the record, Bellow was born in Canada.) Or it would be if Ishmael had been more like Tom Jones with a philosophical disposition. With this teeming book Bellow returned a Dickensian richness to the American novel. As he makes his way to a full brimming consciousness of himself, Augie careens through numberless occupations and countless mentors and exemplars, all the while enchanting us with the slapdash American music of his voice.'),
(3, 'American Pastoral', 'Philip Roth', 2, 0, 'In American Pastoral, Philip Roth gives us a novel of unqualified greatness that is an elegy for all the twentieth century\'s promises of prosperity, civic order, and domestic bliss. Roth\'s protagonist is Seymour \'Swede\' Levov - a legendary high school athlete, a devoted family man, a hard worker, the prosperous inheritor of his father\'s Newark glove factory - comes of age in thriving, triumphant post-war America. And then one day in 1968, Swede\'s beautiful American luck deserts him.\r\n\r\nFor Swede\'s adored daughter, Merry, has grown from a loving, quick-witted girl into a sullen, fanatical teenager - a teenager capable of an outlandishly savage act of political terrorism. And overnight Swede is wrenched out of the longed-for American pastoral and into the indigenous American berserk. Compulsively readable, propelled by sorrow, rage, and a deep compassion for its characters, this is Roth\'s masterpiece.'),
(4, 'An American Tragedy', 'Theodore Dreiser', 2, 0, 'On one level, An American Tragedy is the story of the corruption and destruction of one man, Clyde Griffiths, who forfeits his life in desperate pursuit of success. On a deeper, more profound level, the novel represents a massive portrayal of the society whose values both shape Clyde\'s tawdry ambitions and seal his fate: It is an unsurpassed depiction of the harsh realities of American life and of the dark side of the American Dream. Extraordinary in scope and power, vivid in its sense of wholesale human waste, unceasing in its rich compassion, An American Tragedy stands as Theodore Dreiser\'s supreme achievement.\r\n\r\nBased on an actual crime case, An American Tragedy was the inspiration for the film A Place in the Sun, winner of six Academy Awards, starring Elizabeth Taylor and Montgomery Clift.'),
(6, 'Appointment in Samarra ', 'John O\'Hara', 62, 0, 'O’Hara did for fictional Gibbsville, Pennsylvania what Faulkner did for Yoknapatawpha County, Mississippi: surveyed its social life and drew its psychic outlines, but he did it in utterly worldly terms, without Faulkner’s taste for mythic inference or the basso profundo of his prose. Julian English is a man who squanders what fate gave him. He lives on the right side of the tracks, with a country club membership and a wife who loves him. His decline and fall, over the course of just 72 hours around Christmas, is a matter of too much spending, too much liquor, and a couple of reckless gestures. That his calamity is petty and preventable only makes it more powerful. In Faulkner, the tragedies all seem to be taking place on Olympus, even when they’re happening among the low-lifes. In O’Hara, they could be happening to you.'),
(7, 'Are You There God? It’s Me, Margaret', 'Judy Blume', 15, 0, 'Margaret Simon, almost twelve, likes long hair, tuna fish, the smell of rain, and things that are pink. She’s just moved from New York City to Farbook, New Jersey, and is anxious to fit in with her new friends—Nancy, Gretchen, and Janie. When they form a secret club to talk about private subjects like boys, bras, and getting their first periods, Margaret is happy to belong.\r\n\r\nBut none of them can believe Margaret doesn’t have religion, and that she isn’t going to the Y or the Jewish Community Center. What they don’t know is Margaret has her own very special relationship with God. She can talk to God about everything—family, friends, even Moose Freed, her secret crush.\r\n\r\nMargaret is funny and real, and her thoughts and feelings are oh-so-relatable—you’ll feel like she’s talking right to you, sharing her secrets with a friend.'),
(8, 'The Assistant', 'Camille Perri', 25, 0, 'Tina Fontana is the hapless but brazen thirty-year-old executive assistant to Robert Barlow, the all-powerful and commanding CEO of Titan Corp., a multinational media conglomerate. She’s excellent at her job and beloved by her famous boss—but after six years of making his reservations for restaurants she’d never get into on her own and pouring his drinks from bottles that cost more than her rent, she’s bored, broke, and just a bit over it all.\r\n \r\nWhen a technical error with Robert’s travel-and-expenses report presents Tina with the opportunity to pay off the entire balance of her student loan debt with what would essentially be pocket change for her boss, she struggles with the decision: She’s always played by the rules. But it’s such a relatively small amount of money for the Titan Corporation—and for her it would be a life-changer . . .\r\n \r\nThe Assistants speaks directly to a new generation of women who feel stuck and unable to get ahead playing by the rules. It will appeal to all of those who have ever asked themselves, “How is it that after all these years, we are still assistants?”');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userID` int(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `country` varchar(25) NOT NULL,
  `isAdmin` int(1) NOT NULL,
  `dateJoined` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userID`, `email`, `password`, `firstName`, `lastName`, `country`, `isAdmin`, `dateJoined`) VALUES
(4, 'fakeEmail@fakingEmails.com', 'password', 'Fake', 'News', 'America', 0, '2017-10-11 21:06:33'),
(5, 'jamesWord@gmail.com', 'passingWord', 'James', 'Wood', 'Ireland', 0, '2017-10-11 21:12:39'),
(6, 'Frank13@live.com', 'FrankWest92', 'Frank', 'West', 'America', 0, '2017-10-11 21:12:22'),
(7, 'Test@test.com', 'testing', 'Sean', 'Tester', 'Ireland', 0, '2017-10-20 00:05:06'),
(8, 'tester@tester.com', '123', '123', '123', '123', 0, '2017-10-20 11:01:41'),
(9, 'ayesha@test.com', 'ayesha', 'ayesha', 'khan', 'ireland', 0, '2017-10-30 20:36:18'),
(10, 'admin@admin.com', 'admin', 'Ayesha', 'Khan', 'ireland', 1, '2017-10-30 20:42:38'),
(12, 'sean@gmail.com', 'sean', 'sean', 'ohora', 'ireland', 1, '2017-10-30 20:43:12'),
(13, 'sami@admin', 'sami', 'sami', 'mahmoud', 'ireland', 1, '2017-10-30 20:43:41');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`addressID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `borrowed`
--
ALTER TABLE `borrowed`
  ADD PRIMARY KEY (`borrowedID`,`userID`,`titleID`),
  ADD KEY `fk_B_TitleID` (`titleID`),
  ADD KEY `fk_B_UserID` (`userID`);

--
-- Indexes for table `genre`
--
ALTER TABLE `genre`
  ADD PRIMARY KEY (`genreID`);

--
-- Indexes for table `titlegenre`
--
ALTER TABLE `titlegenre`
  ADD PRIMARY KEY (`genreID`,`titleID`),
  ADD KEY `fk_TG_TitleID` (`titleID`);

--
-- Indexes for table `titles`
--
ALTER TABLE `titles`
  ADD PRIMARY KEY (`titleID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `addressID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `borrowed`
--
ALTER TABLE `borrowed`
  MODIFY `borrowedID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `genre`
--
ALTER TABLE `genre`
  MODIFY `genreID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `titles`
--
ALTER TABLE `titles`
  MODIFY `titleID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `address_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `users` (`userID`);

--
-- Constraints for table `borrowed`
--
ALTER TABLE `borrowed`
  ADD CONSTRAINT `fk_B_TitleID` FOREIGN KEY (`titleID`) REFERENCES `titles` (`titleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_B_UserID` FOREIGN KEY (`userID`) REFERENCES `users` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `titlegenre`
--
ALTER TABLE `titlegenre`
  ADD CONSTRAINT `fk_TG_GenreID` FOREIGN KEY (`genreID`) REFERENCES `genre` (`genreID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_TG_TitleID` FOREIGN KEY (`titleID`) REFERENCES `titles` (`titleID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
