SELECT count(*) as COUNT
FROM ECOLI_DATA
WHERE GENOTYPE & 2 = 0 AND 
(GENOTYPE & 4 = 4 or GENOTYPE & 1 = 1)

