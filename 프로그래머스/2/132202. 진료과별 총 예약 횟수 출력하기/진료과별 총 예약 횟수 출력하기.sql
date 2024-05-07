select mcdp_cd as "진료과 코드" ,count(*) as "5월 예약 건수"
from appointment
WHERE TO_CHAR(APNT_YMD, 'YYYY-MM') = '2022-05'
group by mcdp_cd
order by "5월 예약 건수" asc, "진료과 코드" asc