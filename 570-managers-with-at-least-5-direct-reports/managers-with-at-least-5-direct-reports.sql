# Write your MySQL query statement below
select t2.name
from Employee t1, Employee t2
where t1.managerId=t2.id
group by t2.id, t2.name 
having count(t1.managerId)>=5;
