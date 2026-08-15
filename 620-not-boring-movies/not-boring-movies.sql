select id ,movie,description,rating
from Cinema where id like '%1' and description !="boring"
or id like '%3'and description !="boring"
or id like '%5'and description !="boring"
or id like '%7'and description !="boring"
or id like '%9'and
description !="boring"
order by rating desc;