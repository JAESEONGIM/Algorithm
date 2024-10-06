-- 코드를 작성해주세요
select 
case
    when category = "front End" and name = "python" then "A"
    when name = "c#" then "B"
    when category = "front end" then "C"
    else "D"
    end as GRADE
    ,id,email
from skillcodes a join developers b on b.skill_code & a.code