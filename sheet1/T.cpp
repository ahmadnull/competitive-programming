#include <iostream>
#include <cmath>

using namespace std;

int main()
{
  int a, b, c;
  cin >> a >> b >> c;
  int mn = min(min(a, b), c), mx = max(max(a, b), c), md = a + b + c - mn - mx;
  cout << mn << endl << md << endl << mx << endl << endl << a << endl << b << endl << c << endl;
  return 0;
}
