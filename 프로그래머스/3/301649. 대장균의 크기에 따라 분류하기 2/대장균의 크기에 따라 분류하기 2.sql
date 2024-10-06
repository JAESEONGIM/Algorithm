select id,
case 
    when colony_rank = 1 then "CRITICAL"
    when colony_rank = 2 then "HIGH"
    when colony_rank = 3 then "MEDIUM"
    else "LOW"
    end as colony_name
from(select id, NTILE(4) over(order by size_of_colony desc) as colony_rank
    from ecoli_data) sub_query
order by id