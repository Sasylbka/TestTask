create table if not exists "v_firm" (
"id" serial primary key,
"tlgr" varchar(64),
"disloc" varchar(64)
);

create table if not exists "vidtc"(
"id" serial primary key,
"shname" varchar(64),
"fullname" varchar(64)
);


create table if not exists "tiptr"(
"id" serial primary key,
"tname" varchar(64),
"vidt_id" int,
"prizngr" varchar(64),
foreign key(vidt_id) references vidtc(ID)
);


create table if not exists "pts"(
"uin" serial primary key,
"unts" int,
"t_id" int,
"firm_id" int,
"grp" float,
"normt" float,
"datasp" TIMESTAMPTZ,
foreign key(t_id) references tiptr(id),
foreign key(firm_id) references v_firm(id)
);

create table if not exists "dnlavt"(
"id" serial,
"uin" int,
"serpl" int,
"data" TIMESTAMP,
"dataret" TIMESTAMP,
"timeneg" time with time zone,
"timeend" time with time zone,
"worktime" float,
"prostoy" float,
"prostoytpr" float,
"prostoygr" float,
"speedb" float,
"speede" float,
"topid" int,
"tostv" float,
"tv" float,
"ts" float,
"tovz" float,
"pergr" float,
"pergrtkm" float,
primary key(id),
foreign key(uin) references pts(uin)
);

create table if not exists "dmapr"(
"id" serial primary key,
"uin_pts" int,
"pergr" float,
"dml_id" int,
foreign key(uin_pts) references pts(uin),
foreign key(dml_id) references dnlavt(id)
);