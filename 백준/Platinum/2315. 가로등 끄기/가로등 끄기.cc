#include <cstdio>
#include <cstring>
#include <vector>
#include <algorithm>
#define INF 2e9
using namespace std;

typedef long long ll;
int N, M;
int d[1001], w[1001], sw[1001];
ll dp[1001][1001][2];
ll solve(int left, int right, int dir)
{
	int on, cur = dir == 0 ? left : right;
	ll &ret = dp[left][right][dir];

	if (left == 1 && right == N) return 0;
	if (ret != -1) return ret;
	ret = INF;
	on = sw[N] - sw[right] + sw[left - 1];
	if (left > 1) ret = min(ret, solve(left - 1, right, 0) + (d[cur] - d[left - 1]) * on);
	if (right < N) ret = min (ret, solve(left, right + 1, 1) + (d[right+ 1] - d[cur]) * on);
	return ret;
}
int main()
{
	memset(dp, -1, sizeof(dp));
	scanf("%d %d", &N, &M);
	for (int i = 1; i <= N; i++) scanf("%d %d", &d[i], &w[i]), sw[i] = sw[i - 1] + w[i];
	printf("%lld\n", solve(M, M, 0));
	return 0;
}