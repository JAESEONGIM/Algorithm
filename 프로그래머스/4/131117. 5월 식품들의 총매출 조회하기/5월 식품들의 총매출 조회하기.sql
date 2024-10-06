
-- SELECT A.PRODUCT_ID
--        ,A.PRODUCT_NAME
--        ,SUM(A.PRICE * B.AMOUNT) AS "TOTAL_SALES"
--   FROM FOOD_PRODUCT A
--        ,(SELECT PRODUCT_ID
--                 ,AMOUNT
--            FROM FOOD_ORDER
--           WHERE TO_CHAR(PRODUCE_DATE, 'YYYYMM') = '202205') B
--  WHERE A.PRODUCT_ID = B.PRODUCT_ID
-- GROUP BY A.PRODUCT_ID, A.PRODUCT_NAME
-- ORDER BY SUM(A.PRICE * B.AMOUNT) DESC, A.PRODUCT_ID














select a.product_id,a.product_name,sum(a.price*b.amount)
from food_product a ,(
select product_id,amount
from food_order
where to_char(produce_date,'yyyyMM') = '202205') b
where a.product_id = b.product_id
group by a.product_id,a.product_name
order by sum(a.price * b.amount) desc,a.product_id