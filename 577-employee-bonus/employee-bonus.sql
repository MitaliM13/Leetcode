# Write your MySQL query statement below
Select Employee.name, Bonus.bonus from Employee
Left join Bonus ON Employee.empId = Bonus.empId
where bonus< 1000 or bonus is NULL;