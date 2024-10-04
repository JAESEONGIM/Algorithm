-- 코드를 입력하세요
SELECT f.ingredient_type, sum(a.total_order) as TOTAL_ORDER
from first_half a join icecream_info f on  a.flavor = f.flavor
group by f.ingredient_type