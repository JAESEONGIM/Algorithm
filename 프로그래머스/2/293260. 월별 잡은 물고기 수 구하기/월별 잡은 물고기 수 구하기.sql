# select count(id) as fish_count,date_format(time,'%m') as month
# from fish_info
# group by date_format(time,'%m')
# order by date_format(time,'%m') 
select count(id) as fish_count,month(time)as month
from fish_info
group by 2
order by 2

