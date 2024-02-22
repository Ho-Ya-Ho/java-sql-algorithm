-- Intact Female
-- Neutered Male
-- Spayed Female
-- Intact Male

SELECT AI.ANIMAL_ID, AI.ANIMAL_TYPE, AI.NAME
FROM ANIMAL_INS  AI
   , ANIMAL_OUTS AO
WHERE AO.ANIMAL_ID = AI.ANIMAL_ID
  AND AI.SEX_UPON_INTAKE IN ('Intact Female', 'Intact Male')
  AND AO.SEX_UPON_OUTCOME IN ('Neutered Male', 'Spayed Female')
ORDER BY AI.ANIMAL_ID