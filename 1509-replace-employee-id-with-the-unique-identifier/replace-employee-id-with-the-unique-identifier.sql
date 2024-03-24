select employeeUNI.unique_id, Employees.name from
employees left Join employeeUNI
ON Employees.id = employeeUNI.id