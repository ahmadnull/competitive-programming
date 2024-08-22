#include <iostream>
#include <cmath>

using namespace std;

int main()
{
  double a, b, c, d;
  cin >> a >> b >> c >> d;
  cout << (log(a * b) > log(c * d) ? "YES" : "NO") << endl;
  return 0;
}
