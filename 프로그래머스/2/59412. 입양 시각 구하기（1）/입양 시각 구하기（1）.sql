select to_number(to_char(datetime,'hh24')) as hour, count(*) as COUNT
from animal_outs
where to_char(datetime,'hh24') between '09' and '19'
group by to_char(datetime,'hh24')
order by hour