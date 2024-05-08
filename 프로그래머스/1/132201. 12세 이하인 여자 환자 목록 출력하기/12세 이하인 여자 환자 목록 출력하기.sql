SELECT pt_name, pt_NO, gend_cd, age, nvl(tlno,'NONE') as TLNO
from patient
where gend_Cd like 'W' and age <='12'
order by age desc ,pt_name asc