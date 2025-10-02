class Solution {
    static int solution(int[] bandage, int health, int[][] attacks) {
		int answer = health;

		int idx = 0;
		int cnt = 1, heal = 0;
		while (idx < attacks.length) {
			if (health > answer)
				health = answer;
			if (attacks[idx][0] != cnt) { // 공격이 아닐때

				health += bandage[1];
				heal++;
				if (heal == bandage[0]) {
					health += bandage[2];
					heal = 0;
				}
				
			} else { // 공격일 경우
				heal = 0;
				health -= attacks[idx++][1];
				if (health <= 0)
					return -1;
			}
			cnt++;

		}

		return health;
	}
}