select dr_name, dr_id, mcdp_cd, date_format(hire_ymd, "%Y-%m-%d")
from doctor
where mcdp_cd in ("CS", "GS")
order by hire_ymd desc, dr_name

-- 코드를 입력하세요
-- SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') as HIRE_YMD
-- FROM DOCTOR
-- WHERE MCDP_CD IN ("CS", "GS")
-- ORDER BY HIRE_YMD DESC, DR_NAME