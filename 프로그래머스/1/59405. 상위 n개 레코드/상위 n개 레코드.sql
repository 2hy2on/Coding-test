-- 코드를 입력하세요
SELECT name
FROM ANIMAL_INS
WHERE DATETIME IN (SELECT min(DATETIME)
                  FROM ANIMAL_INS)