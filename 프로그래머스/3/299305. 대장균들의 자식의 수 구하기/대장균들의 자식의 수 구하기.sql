-- 코드를 작성해주세요
select a.id,count(b.id) as child_count
from ecoli_data a left outer join ecoli_data b on a.id = b.parent_id
# where a.id = b.parent_id
group by a.id
order by a.id

# SELECT PARENT.ID, COUNT(CHILD.ID) AS CHILD_COUNT
# FROM ECOLI_DATA PARENT 
# LEFT JOIN ECOLI_DATA CHILD
# ON PARENT.ID = CHILD.PARENT_ID
# GROUP BY PARENT.ID
# ORDER BY PARENT.ID