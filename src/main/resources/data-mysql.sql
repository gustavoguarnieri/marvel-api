SET NAMES 'utf8';

INSERT INTO bd_marvel.charac(id, description, name, thumbnail) VALUES
(1, 'Bitten by a radioactive spider, high school student Peter Parker gained the speed, strength and powers of a spider.', 'Spider-Man', 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b.jpg');
INSERT INTO bd_marvel.charac(id, description, name, thumbnail) VALUES
(2, 'Text description', 'Hulk', 'http://fakeUrl/u/prod/marvel/i/mg/3/50/526548a343e4b.jpg');

INSERT INTO bd_marvel.comics(id, description, issue_number, title, variant_description, character_id) VALUES
(1, 'The frighteningly funky and fearsome Freak returns, more powerful than ever! ', 558, 'Amazing Spider-Man (1999) #558 (Turner Variant)', 'Turner Variant', 1);
INSERT INTO bd_marvel.comics(id, description, issue_number, title, variant_description, character_id) VALUES
(2, 'The Marvel Age of Comics continues! This time around, Spidey meets his match against such classic villains as Electro and the Lizard.', 0, 'Marvel Age Spider-Man Vol. 2: Everyday Hero (Digest)', NULL, 1);
INSERT INTO bd_marvel.comics(id, description, issue_number, title, variant_description, character_id) VALUES
(3, NULL, 5, 'Marvel''s Spider-Man: The Black Cat Strikes (2020) #5', NULL, 1);
INSERT INTO bd_marvel.comics(id, description, issue_number, title, variant_description, character_id) VALUES
(4, NULL, 6, 'Marvel''s Strikes', NULL, 2);
INSERT INTO bd_marvel.comics(id, description, issue_number, title, variant_description, character_id) VALUES
(5, NULL, 7, 'Marvel''s Black', NULL, 2);
INSERT INTO bd_marvel.comics(id, description, issue_number, title, variant_description, character_id) VALUES
(6, NULL, 8, 'Marvel''s Cat', NULL, 2);

INSERT INTO bd_marvel.events(id, description, end, start, title, character_id) VALUES
(1, 'Loki sets about convincing the super-villains of Earth.', '2008-01-04 00:00:00', '1989-12-12 00:00:00', 'Acts of Vengeance!', 1);
INSERT INTO bd_marvel.events(id, description, end, start, title, character_id) VALUES
(2, 'In a 10-issue event written by Brian Michael Bendis with art by Bryan Hitch!', '2013-06-19 00:00:00', '2013-03-06 00:00:00', 'Age of Ultron', 1);
INSERT INTO bd_marvel.events(id, description, end, start, title, character_id) VALUES
(3, 'Super-villains of Earth.', '2008-01-04 00:00:00', '1989-12-12 00:00:00', 'Age!', 2);
INSERT INTO bd_marvel.events(id, description, end, start, title, character_id) VALUES
(4, 'Brian Michael Bendis with art by Bryan Hitch!', '2013-06-19 00:00:00', '2013-03-06 00:00:00', 'Ultron', 2);

INSERT INTO bd_marvel.items(id, name, resourceuri, type, stories_id, series_id, events_id, comics_id) VALUES
(1, 'item1', 'http://item1', 'link', 1, NULL, NULL, NULL);
INSERT INTO bd_marvel.items(id, name, resourceuri, type, stories_id, series_id, events_id, comics_id) VALUES
(2, 'item2', 'http://item2', 'link', NULL, 1, NULL, NULL);
INSERT INTO bd_marvel.items(id, name, resourceuri, type, stories_id, series_id, events_id, comics_id) VALUES
(3, 'item3', 'http://item3', 'link', NULL, NULL, 1, NULL);
INSERT INTO bd_marvel.items(id, name, resourceuri, type, stories_id, series_id, events_id, comics_id) VALUES
(4, 'item4', 'http://item4', 'link', NULL, NULL, NULL, 1);
INSERT INTO bd_marvel.items(id, name, resourceuri, type, stories_id, series_id, events_id, comics_id) VALUES
(5, 'item5', 'http://item5', 'link', 2, NULL, NULL, NULL);
INSERT INTO bd_marvel.items(id, name, resourceuri, type, stories_id, series_id, events_id, comics_id) VALUES
(6, 'item6', 'http://item6', 'link', NULL, 2, NULL, NULL);
INSERT INTO bd_marvel.items(id, name, resourceuri, type, stories_id, series_id, events_id, comics_id) VALUES
(7, 'item7', 'http://item7', 'link', NULL, NULL, 2, NULL);
INSERT INTO bd_marvel.items(id, name, resourceuri, type, stories_id, series_id, events_id, comics_id) VALUES
(8, 'item8', 'http://item8', 'link', NULL, NULL, NULL, 2);

INSERT INTO bd_marvel.series(id, description, end_year, start_year, title, character_id) VALUES
(1, NULL, 2019, 2019, 'Superior Spider-Man Vol. 2: Otto-matic (2019)', 1);
INSERT INTO bd_marvel.series(id, description, end_year, start_year, title, character_id) VALUES
(2, NULL, 2019, 2019, '2099 Alpha (2019)', 1);
INSERT INTO bd_marvel.series(id, description, end_year, start_year, title, character_id) VALUES
(3, NULL, 2010, 2010, 'Superior Spider-Man Vol. 3', 2);
INSERT INTO bd_marvel.series(id, description, end_year, start_year, title, character_id) VALUES
(4, NULL, 2009, 2009, 'Super Alpha', 2);

INSERT INTO bd_marvel.stories(id, description, title, type, character_id) VALUES
(1, NULL, 'Cover #486', 'cover', 1);
INSERT INTO bd_marvel.stories(id, description, title, type, character_id) VALUES
(2, NULL, 'Interior #487', 'story', 1);
INSERT INTO bd_marvel.stories(id, description, title, type, character_id) VALUES
(3, NULL, 'Discover #499', 'discover', 2);
INSERT INTO bd_marvel.stories(id, description, title, type, character_id) VALUES
(4, NULL, 'Space #587', 'space', 2);

INSERT INTO bd_marvel.urls(id, type, url, character_id) VALUES
(1, 'detail', 'http://marvel.com/characters/113/ajaxis?utm_campaign=apiRef&utm_source=cea7d34a804a313d4568b8524c9ec96f', 1);
INSERT INTO bd_marvel.urls(id, type, url, character_id) VALUES
(2, 'wiki', 'http://marvel.com/universe/Ajaxis?utm_campaign=apiRef&utm_source=cea7d34a804a313d4568b8524c9ec96f', 1);
INSERT INTO bd_marvel.urls(id, type, url, character_id) VALUES
(3, 'detail', 'http://marvel.com/characters/113/ajaxis?utm_campaign=apiRef&utm_source=cea7d34a804a313d4568b8524c9ec96f', 2);
INSERT INTO bd_marvel.urls(id, type, url, character_id) VALUES
(4, 'wiki', 'http://marvel.com/universe/Ajaxis?utm_campaign=apiRef&utm_source=cea7d34a804a313d4568b8524c9ec96f', 2);
