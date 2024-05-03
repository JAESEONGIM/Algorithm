-- 코드를 입력하세요
SELECT substr(product_code,1,2) as category, count(*) as products
from product
group by substr(product_code,1,2)
order by category
--SELECT SUBSTR(PRODUCT_CODE, 1, 2) AS CATEGORY, COUNT(*) AS PRODUCTS FROM PRODUCT
--GROUP BY SUBSTR(PRODUCT_CODE, 1, 2)
--ORDER BY CATEGORY;