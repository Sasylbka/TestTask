INSERT INTO v_firm(tlgr, disloc) VALUES
( 'Фирма 1', 'Расположение 1'),
( 'Фирма 2', 'Расположение 2'),
( 'Фирма 3', 'Расположение 3');

INSERT INTO vidtc(shname, fullname) VALUES
	('В1', 'Вид 1'),
	('В2', 'Вид 2'),
	('В3', 'Вид 3');

INSERT INTO tiptr(tname, vidt_id, prizngr) VALUES
	('Тип 1', 1, 'Признак 1'),
	('Тип 2', 2, 'Признак 2'),
	('Тип 3', 3, 'Признак 3'),
	('Тип 4', 1, 'Признак 4');

INSERT INTO pts(unts, t_id, firm_id, grp, normt, datasp) VALUES
	(541, 1, 1, 100.0, 40.0, null),
	(542, 3, 2, 110.0, 41.0, null),
	(543, 4, 3, 120.0, 42.0, null),
	(544, 1, 1, 130.0, 43.0, null),
	(545, 2, 2, 140.0, 44.0, null),
	(546, 1, 3, 150.0, 45.0, null);