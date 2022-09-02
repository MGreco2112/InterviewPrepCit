package com.company.questions;

public class OrderManagement {
//-- SELECT id, name
//-- FROM customer_credit
//-- INNER JOIN
//-- 	(SELECT id, name FROM customer_credit GROUP BY name HAVING COUNT(name) > 1 ORDER BY id ASC)
//--     TEMP ON customer.name = TEMP.name
//-- ORDER BY name DESC;

    //Attempt 2
//    SELECT id, name from customer_credit ORDER BY
//	(CASE
//	WHEN COUNT(name) > 1 THEN name
//    ELSE id
//    END);

    //Third and Closest Attempt Yet
//    SELECT id, name FROM customer_credit GROUP BY name ORDER BY CASE
//	WHEN COUNT(name) > 1 THEN id
//    ELSE name
//    END
//    ;
}
