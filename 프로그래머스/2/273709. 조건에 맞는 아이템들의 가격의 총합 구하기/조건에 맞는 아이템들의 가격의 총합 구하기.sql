-- 코드를 작성해주세요
select SUM(price) as TOTAL_PRICE
FROM ITEM_INFO
WHERE RARITY = 'LEGEND'