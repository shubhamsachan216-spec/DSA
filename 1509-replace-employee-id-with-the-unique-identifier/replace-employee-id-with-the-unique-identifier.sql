select e.name,ea.unique_id
from employees e
left join EmployeeUNI ea 
on e.id=ea.id;