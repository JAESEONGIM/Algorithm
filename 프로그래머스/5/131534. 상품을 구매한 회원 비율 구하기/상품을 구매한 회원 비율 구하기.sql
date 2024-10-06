
with j2021 as(
            select user_id
            from user_info
            where to_char(joined,'yyyy')='2021'),
b2022 as(
            select user_id,to_char(sales_date,'yyyy')as year,
                            to_number(to_char(sales_date,'MM') )as month
            from online_sale
            where to_char(sales_date,'yyyy')='2022')
select b.year,b.month,count(distinct b.user_id) as purchased_users,
round((count(distinct b.user_id)) / (select count(user_id) from user_info
                                    where to_char(joined,'yyyy')='2021'),1)  as purchased_ratio

from j2021 j join b2022 b on 
j.user_id = b.user_id  -- 2021년에 가입한 전체회원중 상품 구매한 회원 조인 한 것
group by b.year,b.month
order by year asc,month asc