select b.year as year, max_size - a.size_of_colony as year_dev,id
from ecoli_data a,(

select year(DIFFERENTIATION_DATE) as year,max(size_of_colony) as max_size
    
from ecoli_data
group by year
) b
where year(DIFFERENTIATION_DATE) = b.year
order by year asc,year_dev asc