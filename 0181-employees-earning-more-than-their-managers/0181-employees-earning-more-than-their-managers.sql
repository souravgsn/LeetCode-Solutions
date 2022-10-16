# Write your MySQL query statement below
# select
#     name as Employee
# from
#     Employee a
# where
#     a.Salary > (
#         select
#             b.Salary
#         from
#             Employee b
#         where
#             a.ManagerId = b.Id
#     );


SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerID
WHERE
e1.salary < e2.salary