select count(id) as fish_count,a.fish_name
from fish_name_info as a ,fish_info as b
where a.fish_type = b.fish_type
group by fish_name
order by count(id) desc
