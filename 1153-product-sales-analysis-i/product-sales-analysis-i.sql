# Write your MySQL query statement below
Select product_name,year,price 
from sales
INNER JOIN Product
on Sales.product_id = Product.product_id;