select  to_char(floor(price/10000) * 10000) as price_group,
        count(*) as products
from product
group by to_char(floor(price/10000) * 10000 )
order by price_group