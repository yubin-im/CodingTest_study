SELECT I.FLAVOR
FROM FIRST_HALF AS H JOIN ICECREAM_INFO AS I
ON H.FLAVOR = I.FLAVOR
WHERE H.TOTAL_ORDER > 3000
AND I.INGREDIENT_TYPE = 'FRUIT_BASED'
ORDER BY H.TOTAL_ORDER DESC;