SELECT
  ANIMAL_ID,
  NAME
FROM
  ANIMAL_INS
WHERE
  1=1
  AND NOT INTAKE_CONDITION = 'Aged'
ORDER BY
  ANIMAL_ID;