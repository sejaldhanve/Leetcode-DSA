# Write your MySQL query statement below
select t1.id from Weather as t1 , Weather as t2
where t1.recordDate=DATE_ADD(t2.recordDate, interval 1 day)
and t1.temperature>t2.temperature;
