-- SELECT to_number(to_char(start_date,'MM')) as MONTH,car_id,count(car_id) as RECORDS
-- from car_rental_company_rental_history
-- where car_id in(select car_id
--                 from car_rental_company_rental_history
--                 where start_date between to_date('2022-08-01','yyyy-MM-dd') and to_date('2022-10-31','yyyy-MM-dd')
--                 group by car_id
--                 having count(car_id) >= 5)
-- and start_date between to_date('2022-08-01','yyyy-MM-dd') and to_date('2022-10-01','yyyy-MM-dd')
-- group by to_char(start_date,'MM'),car_id
-- having count(car_id) > 0
-- order by to_char(start_date,'MM') asc,car_id desc
                 
SELECT TO_NUMBER(TO_CHAR(START_DATE, 'MM')) AS MONTH, CAR_ID, COUNT(CAR_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE CAR_ID IN (SELECT CAR_ID
                FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                WHERE TO_CHAR(START_DATE,'YYYYMM') BETWEEN '202208' AND '202210'
                GROUP BY CAR_ID HAVING COUNT(CAR_ID) >= 5)
                AND TO_CHAR(START_DATE,'YYYYMM') BETWEEN '202208' AND '202210' --CARID가 동일하면 다 뽑아버리니까, 외부 SELECT에서도 날짜 확인을 해줘야 함 
GROUP BY TO_CHAR(START_DATE, 'MM'), CAR_ID HAVING COUNT(CAR_ID) > 0
ORDER BY TO_CHAR(START_DATE, 'MM') ASC, CAR_ID DESC