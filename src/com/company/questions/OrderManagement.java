package com.company.questions;

public class OrderManagement {
//-- SELECT id, name
//-- FROM customer_credit
//-- INNER JOIN
//-- 	(SELECT id, name FROM customer_credit GROUP BY name HAVING COUNT(name) > 1 ORDER BY id ASC)
//--     TEMP ON customer.name = TEMP.name
//-- ORDER BY name DESC;
}
